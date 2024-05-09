package cn.jsu.oj.net.thread;

import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.pojo.net.JudgeResult;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:21
 * describe:
 */
@Component
public class NettyInThread implements Runnable
{
    @Autowired
    ConcurrentHashMap map;

    PrintWriter printWriter = null;
    ServletOutputStream outputStream = null;
    private LinkedBlockingQueue<Object> queueIn;

    public void setLinkedBlockingQueue(LinkedBlockingQueue queueIn)
    {
        this.queueIn = queueIn;
    }

    @Override
    public void run()
    {
        JudgeResult judgeResult = null;
        while (true)
        {
            System.out.println("inThread开始运行.......");
            try
            {
                byte[] bytes = (byte[]) queueIn.take();
                Pack deserialize = Pack.deserialize(bytes);
                short typeNo = deserialize.getTypeNo();
                switch (typeNo)
                {
                    case 8:
                        judgeResult = (JudgeResult) deserialize;
                }
                long serialNumber = judgeResult.getSerialNumber();
                HttpServletResponse response = (HttpServletResponse) map.get(serialNumber);
                System.out.println(serialNumber + "??????????????" + judgeResult.toString() + ">>>>>>>>>>>>>>>>" + response);
                //out(response, judgeResult);
                map.remove(serialNumber);
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

    public void out(HttpServletResponse response, JudgeResult judgeResult)
    {
        try
        {
            String jsonStr = JSON.toJSONString(judgeResult);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            //outputStream = response.getOutputStream();
            //outputStream.write(jsonStr.getBytes());
            printWriter = response.getWriter();
            printWriter.println(jsonStr);
            //printWriter.append(jsonStr);
            printWriter.write(jsonStr);
            printWriter.flush();
            //outputStream.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (printWriter != null)
            {
                printWriter.close();
            }
            //if (outputStream != null)
            //{
            //    try
            //    {
            //        outputStream.close();
            //    }
            //    catch (IOException e)
            //    {
            //        e.printStackTrace();
            //    }
            //}
        }
    }
}