package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 19:53
 * describe:
 */
public class TopicFunction implements Serializable
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
    private boolean topicTStatus;
    private boolean topicAStatus;
    private Integer topicTimeL;
    private Integer topicMemoryL;
    private Integer topicWeight;
    private Integer topicSizeL;
    private String topicProgram;
    private String topicAnswer;
    private Integer languageId;

    public TopicFunction()
    {
    }

    public TopicFunction(Integer topicId, String topicName, Integer topicDifficulty, Integer topicFraction, String topicDescription, String topicStem, Date topicTime, boolean topicPermission, Integer teacherId, Integer topicCount, boolean topicTStatus, boolean topicAStatus, Integer topicTimeL, Integer topicMemoryL, Integer topicWeight, Integer topicSizeL, String topicProgram, String topicAnswer, Integer languageId)
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
        this.topicTStatus = topicTStatus;
        this.topicAStatus = topicAStatus;
        this.topicTimeL = topicTimeL;
        this.topicMemoryL = topicMemoryL;
        this.topicWeight = topicWeight;
        this.topicSizeL = topicSizeL;
        this.topicProgram = topicProgram;
        this.topicAnswer = topicAnswer;
        this.languageId = languageId;
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

    public Integer getTopicTimeL()
    {
        return topicTimeL;
    }

    public void setTopicTimeL(Integer topicTimeL)
    {
        this.topicTimeL = topicTimeL;
    }

    public Integer getTopicMemoryL()
    {
        return topicMemoryL;
    }

    public void setTopicMemoryL(Integer topicMemoryL)
    {
        this.topicMemoryL = topicMemoryL;
    }

    public Integer getTopicWeight()
    {
        return topicWeight;
    }

    public void setTopicWeight(Integer topicWeight)
    {
        this.topicWeight = topicWeight;
    }

    public Integer getTopicSizeL()
    {
        return topicSizeL;
    }

    public void setTopicSizeL(Integer topicSizeL)
    {
        this.topicSizeL = topicSizeL;
    }

    public String getTopicProgram()
    {
        return topicProgram;
    }

    public void setTopicProgram(String topicProgram)
    {
        this.topicProgram = topicProgram;
    }

    public String getTopicAnswer()
    {
        return topicAnswer;
    }

    public void setTopicAnswer(String topicAnswer)
    {
        this.topicAnswer = topicAnswer;
    }

    public Integer getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(Integer languageId)
    {
        this.languageId = languageId;
    }

    @Override
    public String toString()
    {
        return "TopicFunction{" +
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
                ", topicTStatus=" + topicTStatus +
                ", topicAStatus=" + topicAStatus +
                ", topicTimeL=" + topicTimeL +
                ", topicMemoryL=" + topicMemoryL +
                ", topicWeight=" + topicWeight +
                ", topicSizeL=" + topicSizeL +
                ", topicProgram='" + topicProgram + '\'' +
                ", topicAnswer='" + topicAnswer + '\'' +
                ", languageId=" + languageId +
                '}';
    }
}