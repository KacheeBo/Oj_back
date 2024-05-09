package cn.jsu.oj.pojo.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author: suixuexue
 * @date: 2020/12/17 17:25
 * describe:
 * 语言及对应版本的实体类
 */
@ApiModel(value = "题目集对应语言及相应版本实体类")
public class LanguageEdition implements Serializable
{
    @ApiModelProperty(value = "题目集id")
    private Integer topicSetId;
    @ApiModelProperty(value = "题目集对应的语言及相应的版本")
    private Integer[] languageId;

    public LanguageEdition()
    {
    }

    public LanguageEdition(Integer topicSetId, Integer[] languageId)
    {
        this.topicSetId = topicSetId;
        this.languageId = languageId;
    }

    public Integer getTopicSetId()
    {
        return topicSetId;
    }

    public void setTopicSetId(Integer topicSetId)
    {
        this.topicSetId = topicSetId;
    }

    public Integer[] getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(Integer[] languageId)
    {
        this.languageId = languageId;
    }

    @Override
    public String toString()
    {
        return "LanguageEdition{" +
                "topicSetId=" + topicSetId +
                ", languageId=" + Arrays.toString(languageId) +
                '}';
    }
}