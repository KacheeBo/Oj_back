package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/26 17:05
 * describe:
 */
public class QTestTopic implements Serializable
{
    private Integer qTestTopicId;
    private Integer testId;
    private Integer topicId;
    private Integer topicTypeId;
    private Integer topicFraction;
    private Integer topicTitle;

    public QTestTopic()
    {
    }

    public QTestTopic(Integer qTestTopicId, Integer testId, Integer topicId, Integer topicTypeId, Integer topicFraction, Integer topicTitle)
    {
        this.qTestTopicId = qTestTopicId;
        this.testId = testId;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.topicFraction = topicFraction;
        this.topicTitle = topicTitle;
    }

    public Integer getqTestTopicId()
    {
        return qTestTopicId;
    }

    public void setqTestTopicId(Integer qTestTopicId)
    {
        this.qTestTopicId = qTestTopicId;
    }

    public Integer getTestId()
    {
        return testId;
    }

    public void setTestId(Integer testId)
    {
        this.testId = testId;
    }

    public Integer getTopicId()
    {
        return topicId;
    }

    public void setTopicId(Integer topicId)
    {
        this.topicId = topicId;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public Integer getTopicFraction()
    {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction)
    {
        this.topicFraction = topicFraction;
    }

    public Integer getTopicTitle()
    {
        return topicTitle;
    }

    public void setTopicTitle(Integer topicTitle)
    {
        this.topicTitle = topicTitle;
    }

    @Override
    public String toString()
    {
        return "QTestTopic{" +
                "qTestTopicId=" + qTestTopicId +
                ", testId=" + testId +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", topicFraction=" + topicFraction +
                ", topicTitle=" + topicTitle +
                '}';
    }
}