package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 21:27
 * describe:
 */
public class BaseTopic implements Serializable
{
    private Integer topicId;
    private Integer topicTypeId;
    private String unitSchool;
    private String teacherName;
    private String topicName;
    private Integer topicDifficulty;
    private Date topicTime;
    private Integer topicCount;
    private boolean topicTStatus;
    private boolean topicAStatus;
    private Integer topicPermission;
    private Integer topicFraction;

    public BaseTopic()
    {
    }

    public BaseTopic(Integer topicId, Integer topicTypeId, String unitSchool, String teacherName, String topicName, Integer topicDifficulty, Date topicTime, Integer topicCount, boolean topicTStatus, boolean topicAStatus, Integer topicPermission, Integer topicFraction)
    {
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.unitSchool = unitSchool;
        this.teacherName = teacherName;
        this.topicName = topicName;
        this.topicDifficulty = topicDifficulty;
        this.topicTime = topicTime;
        this.topicCount = topicCount;
        this.topicTStatus = topicTStatus;
        this.topicAStatus = topicAStatus;
        this.topicPermission = topicPermission;
        this.topicFraction = topicFraction;
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

    public String getUnitSchool()
    {
        return unitSchool;
    }

    public void setUnitSchool(String unitSchool)
    {
        this.unitSchool = unitSchool;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
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

    public Date getTopicTime()
    {
        return topicTime;
    }

    public void setTopicTime(Date topicTime)
    {
        this.topicTime = topicTime;
    }

    public Integer getTopicCount()
    {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount)
    {
        this.topicCount = topicCount;
    }

    public boolean isTopicTStatus()
    {
        return topicTStatus;
    }

    public void setTopicTStatus(boolean topicTStatus)
    {
        this.topicTStatus = topicTStatus;
    }

    public boolean isTopicAStatus()
    {
        return topicAStatus;
    }

    public void setTopicAStatus(boolean topicAStatus)
    {
        this.topicAStatus = topicAStatus;
    }

    public Integer getTopicPermission()
    {
        return topicPermission;
    }

    public void setTopicPermission(Integer topicPermission)
    {
        this.topicPermission = topicPermission;
    }

    public Integer getTopicFraction()
    {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction)
    {
        this.topicFraction = topicFraction;
    }


    @Override
    public String toString()
    {
        return "BaseTopic{" +
                "topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", unitSchool='" + unitSchool + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", topicName='" + topicName + '\'' +
                ", topicDifficulty=" + topicDifficulty +
                ", topicTime=" + topicTime +
                ", topicCount=" + topicCount +
                ", topicTStatus=" + topicTStatus +
                ", topicAStatus=" + topicAStatus +
                ", topicPermission=" + topicPermission +
                ", topicFraction=" + topicFraction +
                '}';
    }
}