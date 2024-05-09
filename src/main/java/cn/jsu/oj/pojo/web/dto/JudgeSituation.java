package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2021/1/4 22:50
 * describe:
 */
public class JudgeSituation implements Serializable
{
    private Integer situationId;
    private String situationName;

    public JudgeSituation()
    {
    }

    public JudgeSituation(Integer situationId, String situationName)
    {
        this.situationId = situationId;
        this.situationName = situationName;
    }

    public Integer getSituationId()
    {
        return situationId;
    }

    public void setSituationId(Integer situationId)
    {
        this.situationId = situationId;
    }

    public String getSituationName()
    {
        return situationName;
    }

    public void setSituationName(String situationName)
    {
        this.situationName = situationName;
    }

    @Override
    public String toString()
    {
        return "JudgeSituation{" +
                "situationId=" + situationId +
                ", situationName='" + situationName + '\'' +
                '}';
    }
}