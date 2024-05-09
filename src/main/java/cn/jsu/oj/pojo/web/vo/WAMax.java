package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2021/1/7 17:37
 * describe:
 */
public class WAMax implements Serializable
{
    private Integer topicWeight;
    private Integer topicMemoryL;
    private Integer topicTimeL;

    public WAMax()
    {
    }

    public WAMax(Integer topicWeight, Integer topicMemoryL, Integer topicTimeL)
    {
        this.topicWeight = topicWeight;
        this.topicMemoryL = topicMemoryL;
        this.topicTimeL = topicTimeL;
    }

    public Integer getTopicWeight()
    {
        return topicWeight;
    }

    public void setTopicWeight(Integer topicWeight)
    {
        this.topicWeight = topicWeight;
    }

    public Integer getTopicMemoryL()
    {
        return topicMemoryL;
    }

    public void setTopicMemoryL(Integer topicMemoryL)
    {
        this.topicMemoryL = topicMemoryL;
    }

    public Integer getTopicTimeL()
    {
        return topicTimeL;
    }

    public void setTopicTimeL(Integer topicTimeL)
    {
        this.topicTimeL = topicTimeL;
    }

    @Override
    public String toString()
    {
        return "WAMax{" +
                "topicWeight=" + topicWeight +
                ", topicMemoryL=" + topicMemoryL +
                ", topicTimeL=" + topicTimeL +
                '}';
    }
}