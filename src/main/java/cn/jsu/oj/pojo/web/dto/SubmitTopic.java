package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/31 17:25
 * describe:
 */
public class SubmitTopic implements Serializable
{
    private long serialNumber;
    private Integer topicSetId;
    private Integer topicId;
    private Integer topicTypeId;
    private Integer accountId;
    private Integer languageId;
    private String submitCode;
    private Date submitTime;
    private Integer situationId;
    private Integer runTime;
    private Integer runMemory;
    private String compilationInfo;
    private Integer judgeModel;

    public SubmitTopic()
    {
    }

    public SubmitTopic(long serialNumber, Integer topicSetId, Integer topicId, Integer topicTypeId, Integer accountId, Integer languageId, String submitCode, Date submitTime, Integer situationId, Integer runTime, Integer runMemory, String compilationInfo, Integer judgeModel)
    {
        this.serialNumber = serialNumber;
        this.topicSetId = topicSetId;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.accountId = accountId;
        this.languageId = languageId;
        this.submitCode = submitCode;
        this.submitTime = submitTime;
        this.situationId = situationId;
        this.runTime = runTime;
        this.runMemory = runMemory;
        this.compilationInfo = compilationInfo;
        this.judgeModel = judgeModel;
    }

    public long getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer getTopicId()
    {
        return topicId;
    }

    public void setTopicId(Integer topicId)
    {
        this.topicId = topicId;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    public Integer getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(Integer languageId)
    {
        this.languageId = languageId;
    }

    public String getSubmitCode()
    {
        return submitCode;
    }

    public void setSubmitCode(String submitCode)
    {
        this.submitCode = submitCode;
    }

    public Date getSubmitTime()
    {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime)
    {
        this.submitTime = submitTime;
    }

    public Integer getSituationId()
    {
        return situationId;
    }

    public void setSituationId(Integer situationId)
    {
        this.situationId = situationId;
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

    public String getCompilationInfo()
    {
        return compilationInfo;
    }

    public void setCompilationInfo(String compilationInfo)
    {
        this.compilationInfo = compilationInfo;
    }

    public Integer getJudgeModel()
    {
        return judgeModel;
    }

    public void setJudgeModel(Integer judgeModel)
    {
        this.judgeModel = judgeModel;
    }

    @Override
    public String toString()
    {
        return "SubmitTopic{" +
                "serialNumber=" + serialNumber +
                ", topicSetId=" + topicSetId +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", accountId=" + accountId +
                ", languageId=" + languageId +
                ", submitCode='" + submitCode + '\'' +
                ", submitTime=" + submitTime +
                ", situationId=" + situationId +
                ", runTime=" + runTime +
                ", runMemory=" + runMemory +
                ", compilationInfo='" + compilationInfo + '\'' +
                ", judgeModel=" + judgeModel +
                '}';
    }
}