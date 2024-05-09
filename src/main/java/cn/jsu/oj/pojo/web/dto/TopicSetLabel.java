package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 9:55
 * describe:
 * 题目集分类标签表
 */
public class TopicSetLabel implements Serializable
{
    private Integer topicSetLabelId;
    private String labelName;
    private Integer teacherId;

    public TopicSetLabel()
    {
    }

    public Integer getTopicSetLabelId()
    {
        return topicSetLabelId;
    }

    public void setTopicSetLabelId(Integer topicSetLabelId)
    {
        this.topicSetLabelId = topicSetLabelId;
    }

    public String getLabelName()
    {
        return labelName;
    }

    public void setLabelName(String labelName)
    {
        this.labelName = labelName;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    @Override
    public String toString()
    {
        return "TopicSetLabel{" +
                "topicSetLabelId=" + topicSetLabelId +
                ", labelName='" + labelName + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}