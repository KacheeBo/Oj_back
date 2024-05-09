package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 20:30
 * describe:
 */
public class ExamineList implements Serializable
{
    private Integer studentId;
    private String studentNumber;
    private String studentName;
    private Date stuTopicSetStartTime;
    private Date topicSetEndTime;

    public ExamineList()
    {
    }

    public ExamineList(Integer studentId, String studentNumber, String studentName, Date stuTopicSetStartTime, Date topicSetEndTime)
    {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.stuTopicSetStartTime = stuTopicSetStartTime;
        this.topicSetEndTime = topicSetEndTime;
    }

    public Integer getStudentId()
    {
        return studentId;
    }

    public void setStudentId(Integer studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public Date getStuTopicSetStartTime()
    {
        return stuTopicSetStartTime;
    }

    public void setStuTopicSetStartTime(Date stuTopicSetStartTime)
    {
        this.stuTopicSetStartTime = stuTopicSetStartTime;
    }

    public Date getTopicSetEndTime()
    {
        return topicSetEndTime;
    }

    public void setTopicSetEndTime(Date topicSetEndTime)
    {
        this.topicSetEndTime = topicSetEndTime;
    }

    @Override
    public String toString()
    {
        return "ExamineList{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", stuTopicSetStartTime=" + stuTopicSetStartTime +
                ", topicSetEndTime=" + topicSetEndTime +
                '}';
    }
}