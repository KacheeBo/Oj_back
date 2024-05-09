package cn.jsu.oj.net;

import cn.jsu.oj.config.NettyConfig;
import cn.jsu.oj.net.server.NettyServer;
import cn.jsu.oj.net.thread.NettyInThread;
import cn.jsu.oj.net.thread.NettyOutThread;
import cn.jsu.oj.pojo.net.QuestionTaskInformation;
import cn.jsu.oj.service.impl.FileServiceImpl;
import cn.jsu.oj.service.impl.MakeServiceImpl;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: suixuexue
 * @Date: 2020/12/25/21:38
 * @Description: 相当于Netty服务端应用的启动类
 */
@Component
public class NettyServerApplication
{
    @Autowired
    NettyConfig nettyConfig;
    @Autowired
    NettyServer nettyServer;
    @Autowired
    NettyOutThread nettyOutThread;
    @Autowired
    MakeServiceImpl makeService;
    @Autowired
    FileServiceImpl fileService;
    @Autowired
    NettyInThread nettyInThread;

    private static Integer port;
    private static Integer sizeIn;
    private static Integer sizeOut;
    private static ConcurrentHashMap<String, Channel> mapC;
    private static ConcurrentHashMap<Long, HttpRequest> mapH;
    private static LinkedBlockingQueue<Object> queueIn;
    private static LinkedBlockingQueue<QuestionTaskInformation> queueOut;

    public void run()
    {
        loadResource();
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        new Thread(() ->
        {
            startNetty();
        }, "NettyServer").start();

        new Thread(() ->
        {
            nettyOutThread.run();
        }, "nettyOutThread").start();

        new Thread(() ->
        {
            nettyInThread.run();
        }, "nettyInThread").start();
    }

    private void startNetty()
    {
        nettyServer.setPort(port);
        nettyServer.setMapC(mapC);
        nettyServer.setQueueIn(queueIn);
        nettyServer.startServer();
    }

    private void loadResource()
    {
        port = nettyConfig.getPort();
        sizeIn = nettyConfig.getSizeIn();
        sizeOut = nettyConfig.getSizeOut();

        mapC = new ConcurrentHashMap<>();
        mapH = new ConcurrentHashMap<>();

        queueIn = new LinkedBlockingQueue<>();
        queueOut = new LinkedBlockingQueue<>();
        nettyOutThread.setQueueOut(queueOut);
        nettyOutThread.setMapC(mapC);
        makeService.setLinkedBlockingQueue(queueOut);
        fileService.setLinkedBlockingQueue(queueOut);
        nettyInThread.setLinkedBlockingQueue(queueIn);
    }
}
