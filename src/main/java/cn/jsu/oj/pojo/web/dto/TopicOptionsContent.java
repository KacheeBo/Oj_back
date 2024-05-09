package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/29 14:22
 * describe:
 */
public class TopicOptionsContent implements Serializable
{
    private Integer optionsId;
    private Integer topicId;
    private Integer topicTypeId;
    private String optionsLabel;
    private String optionsContent;

    public TopicOptionsContent()
    {
    }

    public TopicOptionsContent(Integer optionsId, Integer topicId, Integer topicTypeId, String optionsLabel, String optionsContent)
    {
        this.optionsId = optionsId;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.optionsLabel = optionsLabel;
        this.optionsContent = optionsContent;
    }

    public Integer getOptionsId()
    {
        return optionsId;
    }

    public void setOptionsId(Integer optionsId)
    {
        this.optionsId = optionsId;
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

    public String getOptionsLabel()
    {
        return optionsLabel;
    }

    public void setOptionsLabel(String optionsLabel)
    {
        this.optionsLabel = optionsLabel;
    }

    public String getOptionsContent()
    {
        return optionsContent;
    }

    public void setOptionsContent(String optionsContent)
    {
        this.optionsContent = optionsContent;
    }

    @Override
    public String toString()
    {
        return "TopicOptionsContent{" +
                "optionsId=" + optionsId +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", optionsLabel='" + optionsLabel + '\'' +
                ", optionsContent='" + optionsContent + '\'' +
                '}';
    }
}