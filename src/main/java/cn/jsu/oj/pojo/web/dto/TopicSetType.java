package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/25 8:57
 * describe:
 * 题目基类型查询
 */
public class TopicSetType implements Serializable
{
    private Integer topicSetTypeId;
    private String typeInfo;

    public TopicSetType()
    {
    }

    public TopicSetType(Integer topicSetTypeId, String typeInfo)
    {
        this.topicSetTypeId = topicSetTypeId;
        this.typeInfo = typeInfo;
    }

    public Integer getTopicSetTypeId()
    {
        return topicSetTypeId;
    }

    public void setTopicSetTypeId(Integer topicSetTypeId)
    {
        this.topicSetTypeId = topicSetTypeId;
    }

    public String getTypeInfo()
    {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo)
    {
        this.typeInfo = typeInfo;
    }

    @Override
    public String toString()
    {
        return "TopicSetType{" +
                "topicSetTypeId=" + topicSetTypeId +
                ", typeInfo='" + typeInfo + '\'' +
                '}';
    }
}