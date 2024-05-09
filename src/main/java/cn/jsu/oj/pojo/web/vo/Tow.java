package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/29 14:47
 * describe:
 */
public class Tow implements Serializable
{
    private String topicName;
    private String topicDescription;
    private Integer topicDifficulty;

    public Tow()
    {
    }

    public Tow(String topicName, String topicDescription, Integer topicDifficulty)
    {
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.topicDifficulty = topicDifficulty;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void setTopicName(String topicName)
    {
        this.topicName = topicName;
    }

    public String getTopicDescription()
    {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription)
    {
        this.topicDescription = topicDescription;
    }

    public Integer getTopicDifficulty()
    {
        return topicDifficulty;
    }

    public void setTopicDifficulty(Integer topicDifficulty)
    {
        this.topicDifficulty = topicDifficulty;
    }

    @Override
    public String toString()
    {
        return "Tow{" +
                "topicName='" + topicName + '\'' +
                ", topicDescription='" + topicDescription + '\'' +
                ", topicDifficulty=" + topicDifficulty +
                '}';
    }
}