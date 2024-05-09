package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 9:57
 * describe:
 * 知识点表
 */
public class KnowledgePoints implements Serializable
{
    private Integer knowledgeId;
    private Integer knowledgeFatherId;
    private String knowledgeType;

    public KnowledgePoints()
    {
    }

    public KnowledgePoints(Integer knowledgeId, Integer knowledgeFatherId, String knowledgeType)
    {
        this.knowledgeId = knowledgeId;
        this.knowledgeFatherId = knowledgeFatherId;
        this.knowledgeType = knowledgeType;
    }

    public Integer getKnowledgeId()
    {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId)
    {
        this.knowledgeId = knowledgeId;
    }

    public Integer getKnowledgeFatherId()
    {
        return knowledgeFatherId;
    }

    public void setKnowledgeFatherId(Integer knowledgeFatherId)
    {
        this.knowledgeFatherId = knowledgeFatherId;
    }

    public String getKnowledgeType()
    {
        return knowledgeType;
    }

    public void setKnowledgeType(String knowledgeType)
    {
        this.knowledgeType = knowledgeType;
    }

    @Override
    public String toString()
    {
        return "KnowledgePoints{" +
                "knowledgeId=" + knowledgeId +
                ", knowledgeFatherId=" + knowledgeFatherId +
                ", knowledgeType='" + knowledgeType + '\'' +
                '}';
    }
}