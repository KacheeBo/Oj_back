package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/31 15:45
 * describe:
 */
public class MakeRequest implements Serializable
{
    private Integer topicId;
    private Integer topicTypeId;
    private Integer topicSetId;
    private Integer topicTitle;
    private String topicDescription;
    private String topicName;
    private Integer topicFraction;
    private String unitSchool;
    private String teacherName;
    private String typeDescription;
    private String typeComponent;
    private Integer topicSizeL;
    private Integer topicStack;
    private Integer topicTimeL;
    private Integer topicMemoryL;

    public MakeRequest()
    {
    }

    public MakeRequest(Integer topicId, Integer topicTypeId, Integer topicSetId, Integer topicTitle, String topicDescription, String topicName, Integer topicFraction, String unitSchool, String teacherName, String typeDescription, String typeComponent, Integer topicSizeL, Integer topicStack, Integer topicTimeL, Integer topicMemoryL)
    {
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.topicSetId = topicSetId;
        this.topicTitle = topicTitle;
        this.topicDescription = topicDescription;
        this.topicName = topicName;
        this.topicFraction = topicFraction;
        this.unitSchool = unitSchool;
        this.teacherName = teacherName;
        this.typeDescription = typeDescription;
        this.typeComponent = typeComponent;
        this.topicSizeL = topicSizeL;
        this.topicStack = topicStack;
        this.topicTimeL = topicTimeL;
        this.topicMemoryL = topicMemoryL;
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

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer getTopicTitle()
    {
        return topicTitle;
    }

    public void setTopicTitle(Integer topicTitle)
    {
        this.topicTitle = topicTitle;
    }

    public String getTopicDescription()
    {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription)
    {
        this.topicDescription = topicDescription;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void setTopicName(String topicName)
    {
        this.topicName = topicName;
    }

    public Integer getTopicFraction()
    {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction)
    {
        this.topicFraction = topicFraction;
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

    public String getTypeDescription()
    {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription)
    {
        this.typeDescription = typeDescription;
    }

    public String getTypeComponent()
    {
        return typeComponent;
    }

    public void setTypeComponent(String typeComponent)
    {
        this.typeComponent = typeComponent;
    }

    public Integer getTopicSizeL()
    {
        return topicSizeL;
    }

    public void setTopicSizeL(Integer topicSizeL)
    {
        this.topicSizeL = topicSizeL;
    }

    public Integer getTopicStack()
    {
        return topicStack;
    }

    public void setTopicStack(Integer topicStack)
    {
        this.topicStack = topicStack;
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

    @Override
    public String toString()
    {
        return "MakeRequest{" +
                "topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", topicSetId=" + topicSetId +
                ", topicTitle=" + topicTitle +
                ", topicDescription='" + topicDescription + '\'' +
                ", topicName='" + topicName + '\'' +
                ", topicFraction=" + topicFraction +
                ", unitSchool='" + unitSchool + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", typeComponent='" + typeComponent + '\'' +
                ", topicSizeL=" + topicSizeL +
                ", topicStack=" + topicStack +
                ", topicTimeL=" + topicTimeL +
                ", topicMemoryL=" + topicMemoryL +
                '}';
    }
}