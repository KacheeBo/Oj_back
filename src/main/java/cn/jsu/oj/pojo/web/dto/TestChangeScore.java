package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2021/1/5 18:11
 * describe:
 */
public class TestChangeScore implements Serializable
{
    private Integer testPointChangeId;
    private Integer qTestTopicId;
    private Integer testPointNumber;
    private Integer testPointScore;

    public TestChangeScore()
    {
    }

    public TestChangeScore(Integer testPointChangeId, Integer qTestTopicId, Integer testPointNumber, Integer testPointScore)
    {
        this.testPointChangeId = testPointChangeId;
        this.qTestTopicId = qTestTopicId;
        this.testPointNumber = testPointNumber;
        this.testPointScore = testPointScore;
    }

    public Integer getTestPointChangeId()
    {
        return testPointChangeId;
    }

    public void setTestPointChangeId(Integer testPointChangeId)
    {
        this.testPointChangeId = testPointChangeId;
    }

    public Integer getqTestTopicId()
    {
        return qTestTopicId;
    }

    public void setqTestTopicId(Integer qTestTopicId)
    {
        this.qTestTopicId = qTestTopicId;
    }

    public Integer getTestPointNumber()
    {
        return testPointNumber;
    }

    public void setTestPointNumber(Integer testPointNumber)
    {
        this.testPointNumber = testPointNumber;
    }

    public Integer getTestPointScore()
    {
        return testPointScore;
    }

    public void setTestPointScore(Integer testPointScore)
    {
        this.testPointScore = testPointScore;
    }

    @Override
    public String toString()
    {
        return "TestChangeScore{" +
                "testPointChangeId=" + testPointChangeId +
                ", qTestTopicId=" + qTestTopicId +
                ", testPointNumber=" + testPointNumber +
                ", testPointScore=" + testPointScore +
                '}';
    }
}