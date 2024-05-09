package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/24 10:03
 * describe:
 */
public class TopicSetRLanguage implements Serializable
{
    private Integer topicSetRLanguageId;
    private Integer topicSetId;
    private Integer languageId;

    public TopicSetRLanguage()
    {
    }

    public TopicSetRLanguage(Integer topicSetRLanguageId, Integer topicSetId, Integer languageId)
    {
        this.topicSetRLanguageId = topicSetRLanguageId;
        this.topicSetId = topicSetId;
        this.languageId = languageId;
    }

    public Integer getTopicSetRLanguageId()
    {
        return topicSetRLanguageId;
    }

    public void setTopicSetRLanguageId(Integer topicSetRLanguageId)
    {
        this.topicSetRLanguageId = topicSetRLanguageId;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(Integer languageId)
    {
        this.languageId = languageId;
    }

    @Override
    public String toString()
    {
        return "TopicSetRLanguage{" +
                "topicSetRLanguageId=" + topicSetRLanguageId +
                ", topicSetId=" + topicSetId +
                ", languageId=" + languageId +
                '}';
    }
}