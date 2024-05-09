package cn.jsu.oj.pojo.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/17 15:29
 * describe:
 * 题目集基本信息
 */
@ApiModel(value = "题目集基本信息")
public class TopicSetInfo implements Serializable
{
    @ApiModelProperty(value = "")
    private Integer topicSetId;
    private String  topicSetName;
    private Integer teacherId;
    private Integer topicSetTypeId;
    private Integer topicSetLabelId;
    private String  topicSetNotice;
    private Date    topicSetReleaseTime;
    private Date    topicSetStartTime;
    private Date    topicSetEndTime;
    private boolean topicSetLAnswerTime;
    private Integer topicSetAnswerTime;
    private String  topicSetShareCode;
    private Integer ruleId;
    private boolean topicSetRecycled;
    private boolean topicSetHiddenName;
    private boolean topicSetAdvance;
    private Integer topicSetDifficulty;

    public TopicSetInfo()
    {
    }

    public TopicSetInfo(Integer topicSetId, String topicSetName, Integer teacherId, Integer topicSetTypeId, Integer topicSetLabelId, String topicSetNotice, Date topicSetReleaseTime, Date topicSetStartTime, Date topicSetEndTime, boolean topicSetLAnswerTime, Integer topicSetAnswerTime, String topicSetShareCode, Integer ruleId, boolean topicSetRecycled, boolean topicSetHiddenName, boolean topicSetAdvance, Integer topicSetDifficulty)
    {
        this.topicSetId = topicSetId;
        this.topicSetName = topicSetName;
        this.teacherId = teacherId;
        this.topicSetTypeId = topicSetTypeId;
        this.topicSetLabelId = topicSetLabelId;
        this.topicSetNotice = topicSetNotice;
        this.topicSetReleaseTime = topicSetReleaseTime;
        this.topicSetStartTime = topicSetStartTime;
        this.topicSetEndTime = topicSetEndTime;
        this.topicSetLAnswerTime = topicSetLAnswerTime;
        this.topicSetAnswerTime = topicSetAnswerTime;
        this.topicSetShareCode = topicSetShareCode;
        this.ruleId = ruleId;
        this.topicSetRecycled = topicSetRecycled;
        this.topicSetHiddenName = topicSetHiddenName;
        this.topicSetAdvance = topicSetAdvance;
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

    public Integer getTopicSetTypeId()
    {
        return topicSetTypeId;
    }

    public void setTopicSetTypeId(Integer topicSetTypeId)
    {
        this.topicSetTypeId = topicSetTypeId;
    }

    public Integer getTopicSetLabelId()
    {
        return topicSetLabelId;
    }

    public void setTopicSetLabelId(Integer topicSetLabelId)
    {
        this.topicSetLabelId = topicSetLabelId;
    }

    public String getTopicSetNotice()
    {
        return topicSetNotice;
    }

    public void setTopicSetNotice(String topicSetNotice)
    {
        this.topicSetNotice = topicSetNotice;
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

    public boolean isTopicSetLAnswerTime()
    {
        return topicSetLAnswerTime;
    }

    public void setTopicSetLAnswerTime(boolean topicSetLAnswerTime)
    {
        this.topicSetLAnswerTime = topicSetLAnswerTime;
    }

    public Integer getTopicSetAnswerTime()
    {
        return topicSetAnswerTime;
    }

    public void setTopicSetAnswerTime(Integer topicSetAnswerTime)
    {
        this.topicSetAnswerTime = topicSetAnswerTime;
    }

    public String getTopicSetShareCode()
    {
        return topicSetShareCode;
    }

    public void setTopicSetShareCode(String topicSetShareCode)
    {
        this.topicSetShareCode = topicSetShareCode;
    }

    public Integer getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(Integer ruleId)
    {
        this.ruleId = ruleId;
    }

    public boolean isTopicSetRecycled()
    {
        return topicSetRecycled;
    }

    public void setTopicSetRecycled(boolean topicSetRecycled)
    {
        this.topicSetRecycled = topicSetRecycled;
    }

    public boolean isTopicSetHiddenName()
    {
        return topicSetHiddenName;
    }

    public void setTopicSetHiddenName(boolean topicSetHiddenName)
    {
        this.topicSetHiddenName = topicSetHiddenName;
    }

    public boolean isTopicSetAdvance()
    {
        return topicSetAdvance;
    }

    public void setTopicSetAdvance(boolean topicSetAdvance)
    {
        this.topicSetAdvance = topicSetAdvance;
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
        return "TopicSetInfo{" +
                "topicSetId=" + topicSetId +
                ", topicSetName='" + topicSetName + '\'' +
                ", teacherId=" + teacherId +
                ", topicSetTypeId=" + topicSetTypeId +
                ", topicSetLabelId=" + topicSetLabelId +
                ", topicSetNotice='" + topicSetNotice + '\'' +
                ", topicSetReleaseTime=" + topicSetReleaseTime +
                ", topicSetStartTime=" + topicSetStartTime +
                ", topicSetEndTime=" + topicSetEndTime +
                ", topicSetLAnswerTime=" + topicSetLAnswerTime +
                ", topicSetAnswerTime=" + topicSetAnswerTime +
                ", topicSetShareCode='" + topicSetShareCode + '\'' +
                ", ruleId=" + ruleId +
                ", topicSetRecycled=" + topicSetRecycled +
                ", topicSetHiddenName=" + topicSetHiddenName +
                ", topicSetAdvance=" + topicSetAdvance +
                ", topicSetDifficulty=" + topicSetDifficulty +
                '}';
    }
}