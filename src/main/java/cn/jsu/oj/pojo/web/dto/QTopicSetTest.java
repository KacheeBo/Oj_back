package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/26 16:12
 * describe:
 */
public class QTopicSetTest implements Serializable
{
    private Integer qTopicSetId;
    private Integer topicSetId;
    private Integer testId;

    public QTopicSetTest()
    {
    }

    public QTopicSetTest(Integer qTopicSetId, Integer topicSetId, Integer testId)
    {
        this.qTopicSetId = qTopicSetId;
        this.topicSetId = topicSetId;
        this.testId = testId;
    }

    public Integer getqTopicSetId()
    {
        return qTopicSetId;
    }

    public void setqTopicSetId(Integer qTopicSetId)
    {
        this.qTopicSetId = qTopicSetId;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer getTestId()
    {
        return testId;
    }

    public void setTestId(Integer testId)
    {
        this.testId = testId;
    }

    @Override
    public String toString()
    {
        return "QTopicSetTest{" +
                "qTopicSetId=" + qTopicSetId +
                ", topicSetId=" + topicSetId +
                ", testId=" + testId +
                '}';
    }
}