package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:29
 * describe:
 */
public class TopicMake implements Serializable
{
    private Integer topicSetId;
    private Integer topicId;//题目id
    private Integer topicTypeId;
    private Integer accountId;
    private byte    languageType;//语言类型
    private boolean taskPriority;//是否是优先任务
    private byte    judgeModel;//判题模式
    private long    serialNumber;//流水号
    private String  sourceCode;//源代码
    private Integer taskWeight;//任务权值

    public TopicMake()
    {
    }

    public TopicMake(Integer topicSetId, Integer topicId, Integer topicTypeId, Integer accountId, byte languageType, boolean taskPriority, byte judgeModel, long serialNumber, String sourceCode, Integer taskWeight)
    {
        this.topicSetId = topicSetId;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.accountId = accountId;
        this.languageType = languageType;
        this.taskPriority = taskPriority;
        this.judgeModel = judgeModel;
        this.serialNumber = serialNumber;
        this.sourceCode = sourceCode;
        this.taskWeight = taskWeight;
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

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    public byte getLanguageType()
    {
        return languageType;
    }

    public void setLanguageType(byte languageType)
    {
        this.languageType = languageType;
    }

    public boolean isTaskPriority()
    {
        return taskPriority;
    }

    public void setTaskPriority(boolean taskPriority)
    {
        this.taskPriority = taskPriority;
    }

    public byte getJudgeModel()
    {
        return judgeModel;
    }

    public void setJudgeModel(byte judgeModel)
    {
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

    public String getSourceCode()
    {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode)
    {
        this.sourceCode = sourceCode;
    }

    public Integer getTaskWeight()
    {
        return taskWeight;
    }

    public void setTaskWeight(Integer taskWeight)
    {
        this.taskWeight = taskWeight;
    }

    @Override
    public String toString()
    {
        return "TopicMake{" +
                "topicSetId=" + topicSetId +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", accountId=" + accountId +
                ", languageType=" + languageType +
                ", taskPriority=" + taskPriority +
                ", judgeModel=" + judgeModel +
                ", serialNumber=" + serialNumber +
                ", sourceCode='" + sourceCode + '\'' +
                ", taskWeight=" + taskWeight +
                '}';
    }
}