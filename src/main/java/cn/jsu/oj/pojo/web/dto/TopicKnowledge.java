package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 10:09
 * describe:
 * 题目知识点关联表
 */
public class TopicKnowledge implements Serializable
{
    private Integer topicKnowledgeId;
    private Integer topicId;
    private Integer topicTypeId;
    private Integer knowledgeId;

    public TopicKnowledge()
    {
    }

    public TopicKnowledge(Integer topicKnowledgeId, Integer topicId, Integer topicTypeId, Integer knowledgeId)
    {
        this.topicKnowledgeId = topicKnowledgeId;
        this.topicId = topicId;
        this.topicTypeId = topicTypeId;
        this.knowledgeId = knowledgeId;
    }

    public Integer getTopicKnowledgeId()
    {
        return topicKnowledgeId;
    }

    public void setTopicKnowledgeId(Integer topicKnowledgeId)
    {
        this.topicKnowledgeId = topicKnowledgeId;
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

    public Integer getKnowledgeId()
    {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId)
    {
        this.knowledgeId = knowledgeId;
    }

    @Override
    public String toString()
    {
        return "TopicKnowledge{" +
                "topicKnowledgeId=" + topicKnowledgeId +
                ", topicId=" + topicId +
                ", topicTypeId=" + topicTypeId +
                ", knowledgeId=" + knowledgeId +
                '}';
    }
}