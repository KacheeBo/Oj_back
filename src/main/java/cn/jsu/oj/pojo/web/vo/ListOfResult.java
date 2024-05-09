package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2021/1/4 23:47
 * describe:
 */
public class ListOfResult implements Serializable
{
    private long serialNumber;//
    private Integer testPointNumber;//----
    private String situationName;//
    private Date submitTime;//
    private Integer judgePointScore;//
    private String languageName;//
    private Integer runTime;//
    private Integer runMemory;//
    private Integer situationId;//--
    private Integer topicTitle;
    private Integer topicTypeId;
    private String accountId;
    private String accountNickName;
    private String teacherName;//-----

    public ListOfResult()
    {
    }

    public ListOfResult(long serialNumber, Integer testPointNumber, String situationName, Date submitTime, Integer judgePointScore, String languageName, Integer runTime, Integer runMemory, Integer situationId, Integer topicTitle, Integer topicTypeId, String accountId, String accountNickName, String teacherName)
    {
        this.serialNumber = serialNumber;
        this.testPointNumber = testPointNumber;
        this.situationName = situationName;
        this.submitTime = submitTime;
        this.judgePointScore = judgePointScore;
        this.languageName = languageName;
        this.runTime = runTime;
        this.runMemory = runMemory;
        this.situationId = situationId;
        this.topicTitle = topicTitle;
        this.topicTypeId = topicTypeId;
        this.accountId = accountId;
        this.accountNickName = accountNickName;
        this.teacherName = teacherName;
    }

    public long getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getSituationName()
    {
        return situationName;
    }

    public void setSituationName(String situationName)
    {
        this.situationName = situationName;
    }

    public Date getSubmitTime()
    {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime)
    {
        this.submitTime = submitTime;
    }

    public Integer getJudgePointScore()
    {
        return judgePointScore;
    }

    public void setJudgePointScore(Integer judgePointScore)
    {
        this.judgePointScore = judgePointScore;
    }

    public String getLanguageName()
    {
        return languageName;
    }

    public void setLanguageName(String languageName)
    {
        this.languageName = languageName;
    }

    public Integer getRunTime()
    {
        return runTime;
    }

    public void setRunTime(Integer runTime)
    {
        this.runTime = runTime;
    }

    public Integer getRunMemory()
    {
        return runMemory;
    }

    public void setRunMemory(Integer runMemory)
    {
        this.runMemory = runMemory;
    }

    public Integer getSituationId()
    {
        return situationId;
    }

    public void setSituationId(Integer situationId)
    {
        this.situationId = situationId;
    }

    public Integer getTopicTitle()
    {
        return topicTitle;
    }

    public void setTopicTitle(Integer topicTitle)
    {
        this.topicTitle = topicTitle;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public Integer getTestPointNumber()
    {
        return testPointNumber;
    }

    public void setTestPointNumber(Integer testPointNumber)
    {
        this.testPointNumber = testPointNumber;
    }

    public String getAccountNickName()
    {
        return accountNickName;
    }

    public void setAccountNickName(String accountNickName)
    {
        this.accountNickName = accountNickName;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    @Override
    public String toString()
    {
        return "ListOfResult{" +
                "serialNumber=" + serialNumber +
                ", testPointNumber=" + testPointNumber +
                ", situationName='" + situationName + '\'' +
                ", submitTime=" + submitTime +
                ", judgePointScore=" + judgePointScore +
                ", languageName='" + languageName + '\'' +
                ", runTime=" + runTime +
                ", runMemory=" + runMemory +
                ", situationId=" + situationId +
                ", topicTitle=" + topicTitle +
                ", topicTypeId=" + topicTypeId +
                ", accountId='" + accountId + '\'' +
                ", accountNickName='" + accountNickName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}