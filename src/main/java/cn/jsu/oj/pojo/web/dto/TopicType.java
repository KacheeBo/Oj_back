package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 10:00
 * describe:
 * 题目集类型表
 */
public class TopicType implements Serializable
{
    private Integer topicTypeId;
    private String typeDescription;
    private String typeComponent;

    public TopicType()
    {
    }

    public TopicType(Integer topicTypeId, String typeDescription, String typeComponent)
    {
        this.topicTypeId = topicTypeId;
        this.typeDescription = typeDescription;
        this.typeComponent = typeComponent;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
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

    @Override
    public String toString()
    {
        return "TopicType{" +
                "topicTypeId=" + topicTypeId +
                ", typeDescription='" + typeDescription + '\'' +
                ", typeComponent='" + typeComponent + '\'' +
                '}';
    }
}