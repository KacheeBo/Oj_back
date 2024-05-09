package cn.jsu.oj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: suixuexue
 * @Date: 2020/12/25/21:30
 * @Description: Netty配置，读取YAML配置
 */
@Component
@ConfigurationProperties(prefix = "netty")
public class NettyConfig
{
    private int port;
    private int sizeIn;
    private int sizeOut;
    private String lowerMachine;

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public int getSizeIn()
    {
        return sizeIn;
    }

    public void setSizeIn(int sizeIn)
    {
        this.sizeIn = sizeIn;
    }

    public int getSizeOut()
    {
        return sizeOut;
    }

    public void setSizeOut(int sizeOut)
    {
        this.sizeOut = sizeOut;
    }

    public String getLowerMachine()
    {
        return lowerMachine;
    }

    public void setLowerMachine(String lowerMachine)
    {
        this.lowerMachine = lowerMachine;
    }
}