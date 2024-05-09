package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/29 19:58
 * describe:
 */
public class TestPointInfo implements Serializable
{
    private Integer testPointId;
    private Integer testPointNumber;
    private Integer testPointScore;
    private Integer topicId;
    private Integer topicTypeId;
    private String topicTip;
    private Date testPointTime;

    public TestPointInfo()
    {
    }

    public TestPointInfo(Integer testPointId, Integer testPointNumber, Integer testPointScore, Integer topicId, Integer topicTypeId, String topicTip, Date testPointTime)
    {
        this.testPointId = testPointId;
        this.testPointNumber = testPointNumber;
        this.testPointScore = testPointScore;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.topicTip = topicTip;
        this.testPointTime = testPointTime;
    }

    public Integer getTestPointId()
    {
        return testPointId;
    }

    public void setTestPointId(Integer testPointId)
    {
        this.testPointId = testPointId;
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

    public String getTopicTip()
    {
        return topicTip;
    }

    public void setTopicTip(String topicTip)
    {
        this.topicTip = topicTip;
    }

    public Date getTestPointTime()
    {
        return testPointTime;
    }

    public void setTestPointTime(Date testPointTime)
    {
        this.testPointTime = testPointTime;
    }

    @Override
    public String toString()
    {
        return "TestPointInfo{" +
                "testPointId=" + testPointId +
                ", testPointNumber=" + testPointNumber +
                ", testPointScore=" + testPointScore +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", topicTip='" + topicTip + '\'' +
                ", testPointTime=" + testPointTime +
                '}';
    }
}