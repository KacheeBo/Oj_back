package cn.jsu.oj.net.thread;

import cn.jsu.oj.config.NettyConfig;
import cn.jsu.oj.pojo.net.QuestionTaskInformation;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:22
 * describe:
 */
@Component
public class NettyOutThread implements Runnable
{
    @Autowired
    NettyConfig nettyConfig;

    private LinkedBlockingQueue<QuestionTaskInformation> queueOut;
    private ConcurrentHashMap<String, Channel> mapC;

    public void setQueueOut(LinkedBlockingQueue<QuestionTaskInformation> queueOut)
    {
        this.queueOut = queueOut;
    }

    public void setMapC(ConcurrentHashMap<String, Channel> mapC)
    {
        this.mapC = mapC;
    }

    @Override
    public void run()
    {
        QuestionTaskInformation questionTaskInformation = null;
        byte[] serialize = null;
        Channel channel = null;
        String lowerMachine = nettyConfig.getLowerMachine();
        while (true)
        {
            System.out.println("外写线程开始运行.....");
            try
            {
                questionTaskInformation = queueOut.take();
                System.out.println("拿到数据尝试外写...." + questionTaskInformation.toString() + "::::" + lowerMachine);
                serialize = questionTaskInformation.serialize();
                channel = mapC.get(lowerMachine);
                System.out.println(channel);
                if (channel != null)
                {
                    channel.writeAndFlush(serialize);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}
