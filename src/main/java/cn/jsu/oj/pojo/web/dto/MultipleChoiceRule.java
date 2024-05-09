package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 10:08
 * describe:
 * 多选题评分规则
 */
public class MultipleChoiceRule implements Serializable
{
    private char ruleId;
    private String ruleScore;

    public MultipleChoiceRule()
    {
    }

    public MultipleChoiceRule(char ruleId, String ruleScore)
    {
        this.ruleId = ruleId;
        this.ruleScore = ruleScore;
    }

    public char getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(char ruleId)
    {
        this.ruleId = ruleId;
    }

    public String getRuleScore()
    {
        return ruleScore;
    }

    public void setRuleScore(String ruleScore)
    {
        this.ruleScore = ruleScore;
    }

    @Override
    public String toString()
    {
        return "MultipleChoiceRule{" +
                "ruleId=" + ruleId +
                ", ruleScore='" + ruleScore + '\'' +
                '}';
    }
}