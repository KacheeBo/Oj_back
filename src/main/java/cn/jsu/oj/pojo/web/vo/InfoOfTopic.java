package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.TopicOptionsContent;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/29 13:37
 * describe:
 */
public class InfoOfTopic implements Serializable
{
    private Integer topicId;
    private Integer topicTypeId;
    private Integer topicFraction;
    private Integer topicTitle;
    private String topicName;
    private String topicDescription;
    private List<TopicOptionsContent> topicOptionsContent;
    private Integer topicDifficulty;
    private List<Object> knowledgePoint;

    public InfoOfTopic()
    {
    }

    public InfoOfTopic(Integer topicId, Integer topicTypeId, Integer topicFraction, Integer topicTitle, String topicName, String topicDescription, List<TopicOptionsContent> topicOptionsContent, Integer topicDifficulty, List<Object> knowledgePoint)
    {
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.topicFraction = topicFraction;
        this.topicTitle = topicTitle;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.topicOptionsContent = topicOptionsContent;
        this.topicDifficulty = topicDifficulty;
        this.knowledgePoint = knowledgePoint;
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

    public Integer getTopicFraction()
    {
        return topicFraction;
    }

    public void setTopicFraction(Integer topicFraction)
    {
        this.topicFraction = topicFraction;
    }

    public Integer getTopicTitle()
    {
        return topicTitle;
    }

    public void setTopicTitle(Integer topicTitle)
    {
        this.topicTitle = topicTitle;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void setTopicName(String topicName)
    {
        this.topicName = topicName;
    }

    public String getTopicDescription()
    {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription)
    {
        this.topicDescription = topicDescription;
    }

    public List<TopicOptionsContent> getTopicOptionsContent()
    {
        return topicOptionsContent;
    }

    public void setTopicOptionsContent(List<TopicOptionsContent> topicOptionsContent)
    {
        this.topicOptionsContent = topicOptionsContent;
    }

    public Integer getTopicDifficulty()
    {
        return topicDifficulty;
    }

    public void setTopicDifficulty(Integer topicDifficulty)
    {
        this.topicDifficulty = topicDifficulty;
    }

    public List<Object> getKnowledgePoint()
    {
        return knowledgePoint;
    }

    public void setKnowledgePoint(List<Object> knowledgePoint)
    {
        this.knowledgePoint = knowledgePoint;
    }

    @Override
    public String toString()
    {
        return "InfoOfTopic{" +
                "topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", topicFraction=" + topicFraction +
                ", topicTitle=" + topicTitle +
                ", topicName='" + topicName + '\'' +
                ", topicDescription='" + topicDescription + '\'' +
                ", topicOptionsContent=" + topicOptionsContent +
                ", topicDifficulty=" + topicDifficulty +
                ", knowledgePoint=" + knowledgePoint +
                '}';
    }
}