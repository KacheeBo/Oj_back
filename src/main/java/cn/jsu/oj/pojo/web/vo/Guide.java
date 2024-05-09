package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.QTestTopic;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/28 17:56
 * describe:
 */
public class Guide implements Serializable
{
    private Integer testId;
    private Integer topicTypeId;
    private List<QTestTopic> qTestTopics;

    public Guide()
    {
    }

    public Guide(Integer testId, Integer topicTypeId, List<QTestTopic> qTestTopics)
    {
        this.testId = testId;
        this.topicTypeId = topicTypeId;
        this.qTestTopics = qTestTopics;
    }

    public Integer getTestId()
    {
        return testId;
    }

    public void setTestId(Integer testId)
    {
        this.testId = testId;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public List<QTestTopic> getqTestTopics()
    {
        return qTestTopics;
    }

    public void setqTestTopics(List<QTestTopic> qTestTopics)
    {
        this.qTestTopics = qTestTopics;
    }

    @Override
    public String toString()
    {
        return "Guide{" +
                "testId=" + testId +
                ", topicTypeId=" + topicTypeId +
                ", qTestTopics=" + qTestTopics +
                '}';
    }
}