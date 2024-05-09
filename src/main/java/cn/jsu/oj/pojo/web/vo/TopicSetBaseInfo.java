package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/24 20:11
 * describe:
 * 显示的部分数据，不同于数据库数据字段
 */
public class TopicSetBaseInfo implements Serializable
{
    private Integer topicSetId;
    private String  topicSetName;
    private Integer teacherId;
    private String  unitSName;
    private String  teacherName;
    private Date    topicSetReleaseTime;
    private Date    topicSetStartTime;
    private Date    topicSetEndTime;
    private String  topicSetStatus;
    private Integer topicSetDifficulty;

    public TopicSetBaseInfo()
    {
    }

    public TopicSetBaseInfo(Integer topicSetId, String topicSetName, Integer teacherId, String unitSName, String teacherName, Date topicSetReleaseTime, Date topicSetStartTime, Date topicSetEndTime, String topicSetStatus, Integer topicSetDifficulty)
    {
        this.topicSetId = topicSetId;
        this.topicSetName = topicSetName;
        this.teacherId = teacherId;
        this.unitSName = unitSName;
        this.teacherName = teacherName;
        this.topicSetReleaseTime = topicSetReleaseTime;
        this.topicSetStartTime = topicSetStartTime;
        this.topicSetEndTime = topicSetEndTime;
        this.topicSetStatus = topicSetStatus;
        this.topicSetDifficulty = topicSetDifficulty;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public String getTopicSetName()
    {
        return topicSetName;
    }

    public void setTopicSetName(String topicSetName)
    {
        this.topicSetName = topicSetName;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getUnitSName()
    {
        return unitSName;
    }

    public void setUnitSName(String unitSName)
    {
        this.unitSName = unitSName;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public Date getTopicSetReleaseTime()
    {
        return topicSetReleaseTime;
    }

    public void setTopicSetReleaseTime(Date topicSetReleaseTime)
    {
        this.topicSetReleaseTime = topicSetReleaseTime;
    }

    public Date getTopicSetStartTime()
    {
        return topicSetStartTime;
    }

    public void setTopicSetStartTime(Date topicSetStartTime)
    {
        this.topicSetStartTime = topicSetStartTime;
    }

    public Date getTopicSetEndTime()
    {
        return topicSetEndTime;
    }

    public void setTopicSetEndTime(Date topicSetEndTime)
    {
        this.topicSetEndTime = topicSetEndTime;
    }

    public String getTopicSetStatus()
    {
        return topicSetStatus;
    }

    public void setTopicSetStatus(String topicSetStatus)
    {
        this.topicSetStatus = topicSetStatus;
    }

    public Integer getTopicSetDifficulty()
    {
        return topicSetDifficulty;
    }

    public void setTopicSetDifficulty(Integer topicSetDifficulty)
    {
        this.topicSetDifficulty = topicSetDifficulty;
    }

    @Override
    public String toString()
    {
        return "TopicSetBaseInfo{" +
                "topicSetId=" + topicSetId +
                ", topicSetName='" + topicSetName + '\'' +
                ", teacherId=" + teacherId +
                ", unitSName='" + unitSName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", topicSetReleaseTime=" + topicSetReleaseTime +
                ", topicSetStartTime=" + topicSetStartTime +
                ", topicSetEndTime=" + topicSetEndTime +
                ", topicSetStatus='" + topicSetStatus + '\'' +
                ", topicSetDifficulty=" + topicSetDifficulty +
                '}';
    }
}