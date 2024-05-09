package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 17:57
 * describe:
 */
public class StuTopicSetSets implements Serializable
{
    private Integer stuTopicSetId;
    private Integer topicSetId;
    private Integer studentId;
    private Integer stuTopicSetScore;
    private Date stuTopicSetStartTime;

    public StuTopicSetSets()
    {
    }

    public StuTopicSetSets(Integer stuTopicSetId, Integer topicSetId, Integer studentId, Integer stuTopicSetScore, Date stuTopicSetStartTime)
    {
        this.stuTopicSetId = stuTopicSetId;
        this.topicSetId = topicSetId;
        this.studentId = studentId;
        this.stuTopicSetScore = stuTopicSetScore;
        this.stuTopicSetStartTime = stuTopicSetStartTime;
    }

    public Integer getStuTopicSetId()
    {
        return stuTopicSetId;
    }

    public void setStuTopicSetId(Integer stuTopicSetId)
    {
        this.stuTopicSetId = stuTopicSetId;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer getStudentId()
    {
        return studentId;
    }

    public void setStudentId(Integer studentId)
    {
        this.studentId = studentId;
    }

    public Integer getStuTopicSetScore()
    {
        return stuTopicSetScore;
    }

    public void setStuTopicSetScore(Integer stuTopicSetScore)
    {
        this.stuTopicSetScore = stuTopicSetScore;
    }

    public Date getStuTopicSetStartTime()
    {
        return stuTopicSetStartTime;
    }

    public void setStuTopicSetStartTime(Date stuTopicSetStartTime)
    {
        this.stuTopicSetStartTime = stuTopicSetStartTime;
    }

    @Override
    public String toString()
    {
        return "StuTopicSetSets{" +
                "stuTopicSetId=" + stuTopicSetId +
                ", topicSetId=" + topicSetId +
                ", studentId=" + studentId +
                ", stuTopicSetScore=" + stuTopicSetScore +
                ", stuTopicSetStartTime=" + stuTopicSetStartTime +
                '}';
    }
}