package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 10:05
 * describe:
 * 题目集状态类型表
 */
public class TopicSetStatusType implements Serializable
{
    private char topicSetStatusId;
    private String topicSetStatus;

    public TopicSetStatusType()
    {
    }

    public TopicSetStatusType(char topicSetStatusId, String topicSetStatus)
    {
        this.topicSetStatusId = topicSetStatusId;
        this.topicSetStatus = topicSetStatus;
    }

    public char getTopicSetStatusId()
    {
        return topicSetStatusId;
    }

    public void setTopicSetStatusId(char topicSetStatusId)
    {
        this.topicSetStatusId = topicSetStatusId;
    }

    public String getTopicSetStatus()
    {
        return topicSetStatus;
    }

    public void setTopicSetStatus(String topicSetStatus)
    {
        this.topicSetStatus = topicSetStatus;
    }

    @Override
    public String toString()
    {
        return "TopicSetStatusType{" +
                "topicSetStatusId=" + topicSetStatusId +
                ", topicSetStatus='" + topicSetStatus + '\'' +
                '}';
    }
}