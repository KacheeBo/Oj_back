package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 19:33
 * describe:
 */
public class TopicSingleOptions implements Serializable
{
    private Integer topicId;
    private String topicName;
    private Integer topicDifficulty;
    private Integer topicFraction;
    private String topicDescription;
    private String topicStem;
    private Date topicTime;
    private boolean topicPermission;
    private Integer teacherId;
    private Integer topicCount;

    public TopicSingleOptions()
    {
    }

    public TopicSingleOptions(Integer topicId, String topicName, Integer topicDifficulty, Integer topicFraction, String topicDescription, String topicStem, Date topicTime, boolean topicPermission, Integer teacherId, Integer topicCount)
    {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDifficulty = topicDifficulty;
        this.topicFraction = topicFraction;
        this.topicDescription = topicDescription;
        this.topicStem = topicStem;
        this.topicTime = topicTime;
        this.topicPermission = topicPermission;
        this.teacherId = teacherId;
        this.topicCount = topicCount;
    }

    public Integer getTopicId()
    {
        return topicId;
    }

    public void setTopicId(Integer topicId)
    {
        this.topicId = topicId;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void setTopicName(String topicName)
    {
        this.topicName = topicName;
    }

    public Integer getTopicDifficulty()
    {
        return topicDifficulty;
    }

    public void setTopicDifficulty(Integer topicDifficulty)
    {
        this.topicDifficulty = topicDifficulty;
    }

    public Integer getTopicFraction()
    {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction)
    {
        this.topicFraction = topicFraction;
    }

    public String getTopicDescription()
    {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription)
    {
        this.topicDescription = topicDescription;
    }

    public String getTopicStem()
    {
        return topicStem;
    }

    public void setTopicStem(String topicStem)
    {
        this.topicStem = topicStem;
    }

    public Date getTopicTime()
    {
        return topicTime;
    }

    public void setTopicTime(Date topicTime)
    {
        this.topicTime = topicTime;
    }

    public boolean isTopicPermission()
    {
        return topicPermission;
    }

    public void setTopicPermission(boolean topicPermission)
    {
        this.topicPermission = topicPermission;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    public Integer getTopicCount()
    {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount)
    {
        this.topicCount = topicCount;
    }

    @Override
    public String toString()
    {
        return "TopicSingleOptions{" +
                "topicId=" + topicId +
                ", topicName='" + topicName + '\'' +
                ", topicDifficulty=" + topicDifficulty +
                ", topicFraction=" + topicFraction +
                ", topicDescription='" + topicDescription + '\'' +
                ", topicStem='" + topicStem + '\'' +
                ", topicTime=" + topicTime +
                ", topicPermission=" + topicPermission +
                ", teacherId=" + teacherId +
                ", topicCount=" + topicCount +
                '}';
    }
}