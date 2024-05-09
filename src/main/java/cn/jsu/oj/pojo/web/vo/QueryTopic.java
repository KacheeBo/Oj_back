package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/27 21:06
 * describe:
 */
public class QueryTopic implements Serializable
{
    private Integer teacherId;
    private Integer topicTypeId;
    private Integer knowledgeId;
    private Integer topicDifficulty;
    private Integer topicPermission;

    public QueryTopic()
    {
    }

    public QueryTopic(Integer teacherId, Integer topicTypeId, Integer knowledgeId, Integer topicDifficulty, Integer topicPermission)
    {
        this.teacherId = teacherId;
        this.topicTypeId = topicTypeId;
        this.knowledgeId = knowledgeId;
        this.topicDifficulty = topicDifficulty;
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

    public Integer getTopicDifficulty()
    {
        return topicDifficulty;
    }

    public void setTopicDifficulty(Integer topicDifficulty)
    {
        this.topicDifficulty = topicDifficulty;
    }

    public Integer getTopicPermission()
    {
        return topicPermission;
    }

    public void setTopicPermission(Integer topicPermission)
    {
        this.topicPermission = topicPermission;
    }

    @Override
    public String toString()
    {
        return "QueryTopic{" +
                "teacherId=" + teacherId +
                ", topicTypeId=" + topicTypeId +
                ", knowledgeId=" + knowledgeId +
                ", topicDifficulty=" + topicDifficulty +
                ", topicPermission=" + topicPermission +
                '}';
    }
}