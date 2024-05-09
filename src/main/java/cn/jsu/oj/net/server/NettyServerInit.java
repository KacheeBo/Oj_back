package cn.jsu.oj.net.server;

import cn.jsu.oj.net.handler.InBoundHandler;
import cn.jsu.oj.net.handler.OutBoundHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:43
 * describe:
 * Netty服务端初始化类，指定对于服务端进出数据的处理顺序以及处理逻辑
 */
public class NettyServerInit extends ChannelInitializer<SocketChannel>
{

    private ConcurrentHashMap<String, Channel> mapC;
    private LinkedBlockingQueue<Object> queueIn;

    public NettyServerInit(ConcurrentHashMap<String, Channel> mapC, LinkedBlockingQueue<Object> queueIn)
    {
        this.mapC = mapC;
        this.queueIn = queueIn;
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception
    {
        socketChannel.pipeline()
                .addLast(new OutBoundHandler())
                .addLast(new InBoundHandler())
                .addLast(new NettyServerInHandler(mapC, queueIn));
    }

}
