package cn.jsu.oj.net.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:42
 * describe:
 * Netty服务端主控制类
 */
@Slf4j
@Component
public class NettyServer
{
    private Integer port;
    private ConcurrentHashMap<String, Channel> mapC;
    private LinkedBlockingQueue<Object> queueIn;

    public void setMapC(ConcurrentHashMap<String, Channel> mapC)
    {
        this.mapC = mapC;
    }

    public void setQueueIn(LinkedBlockingQueue<Object> queueIn)
    {
        this.queueIn = queueIn;
    }

    public void setPort(Integer port)
    {
        this.port = port;
    }

    public void startServer()
    {
        NioEventLoopGroup boss = new NioEventLoopGroup();//服务端连接监听组，接收accept事件的client连接
        NioEventLoopGroup worker = new NioEventLoopGroup();//服务端数据发送线程组，默认大小为CPU核数的2倍
        try
        {
            ServerBootstrap serverBootstrap = new ServerBootstrap();//启动NIO服务的服务端的启动引导器
            serverBootstrap.group(boss, worker)
                    .channel(NioServerSocketChannel.class)//指定NIO的通道类型
                    .option(ChannelOption.SO_BACKLOG, 128)//设置通道选项，服务端接收连接的队列的长度，如果队列已满，客户端连接将被拒绝，默认值windows默认为200，其他为128
                    .childOption(ChannelOption.SO_KEEPALIVE, true)//设置通道选项，表示是否开启TCP底层心跳机制，true表示开启
                    .childHandler(new NettyServerInit(mapC, queueIn));//添加处理器到pipeline，Handler流水线
            //设置监听连接的端口号
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync();//异步绑定服务器，阻塞状态直到服务器绑定完成
            channelFuture.channel().closeFuture().sync();//应用程序将一直等待，直到服务器的通道关闭
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // 释放所有资源，包括创建的线程，优雅的关闭
            boss.shutdownGracefully();
            worker.shutdownGracefully();
        }
    }

}
