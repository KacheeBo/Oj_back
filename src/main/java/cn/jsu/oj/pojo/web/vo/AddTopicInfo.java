package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/27 16:16
 * describe:
 */
public class AddTopicInfo implements Serializable
{
    private TopicJudge topicJudge;//1
    private TopicSingleOptions topicSingleOptions;//2
    private TopicDoubleOptions topicDoubleOptions;//3
    private TopicFill topicFill;//4
    private TopicFillProgram topicFillProgram;//5
    private TopicProgram topicProgram;//编程题
    private TopicFunction topicFunction;//7
    private Integer topicTypeId;
    private List<Integer> topicKnowledge;

    public AddTopicInfo()
    {
    }

    public AddTopicInfo(TopicJudge topicJudge, TopicSingleOptions topicSingleOptions, TopicDoubleOptions topicDoubleOptions, TopicFill topicFill, TopicFillProgram topicFillProgram, TopicProgram topicProgram, TopicFunction topicFunction, Integer topicTypeId, List<Integer> topicKnowledge)
    {
        this.topicJudge = topicJudge;
        this.topicSingleOptions = topicSingleOptions;
        this.topicDoubleOptions = topicDoubleOptions;
        this.topicFill = topicFill;
        this.topicFillProgram = topicFillProgram;
        this.topicProgram = topicProgram;
        this.topicFunction = topicFunction;
        this.topicTypeId = topicTypeId;
        this.topicKnowledge = topicKnowledge;
    }

    public TopicJudge getTopicJudge()
    {
        return topicJudge;
    }

    public void setTopicJudge(TopicJudge topicJudge)
    {
        this.topicJudge = topicJudge;
    }

    public TopicSingleOptions getTopicSingleOptions()
    {
        return topicSingleOptions;
    }

    public void setTopicSingleOptions(TopicSingleOptions topicSingleOptions)
    {
        this.topicSingleOptions = topicSingleOptions;
    }

    public TopicDoubleOptions getTopicDoubleOptions()
    {
        return topicDoubleOptions;
    }

    public void setTopicDoubleOptions(TopicDoubleOptions topicDoubleOptions)
    {
        this.topicDoubleOptions = topicDoubleOptions;
    }

    public TopicFill getTopicFill()
    {
        return topicFill;
    }

    public void setTopicFill(TopicFill topicFill)
    {
        this.topicFill = topicFill;
    }

    public TopicFillProgram getTopicFillProgram()
    {
        return topicFillProgram;
    }

    public void setTopicFillProgram(TopicFillProgram topicFillProgram)
    {
        this.topicFillProgram = topicFillProgram;
    }

    public TopicProgram getTopicProgram()
    {
        return topicProgram;
    }

    public void setTopicProgram(TopicProgram topicProgram)
    {
        this.topicProgram = topicProgram;
    }

    public TopicFunction getTopicFunction()
    {
        return topicFunction;
    }

    public void setTopicFunction(TopicFunction topicFunction)
    {
        this.topicFunction = topicFunction;
    }

    public Integer getTopicTypeId()
    {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId)
    {
        this.topicTypeId = topicTypeId;
    }

    public List<Integer> getTopicKnowledge()
    {
        return topicKnowledge;
    }

    public void setTopicKnowledge(List<Integer> topicKnowledge)
    {
        this.topicKnowledge = topicKnowledge;
    }

    @Override
    public String toString()
    {
        return "AddTopicInfo{" +
                "topicJudge=" + topicJudge +
                ", topicSingleOptions=" + topicSingleOptions +
                ", topicDoubleOptions=" + topicDoubleOptions +
                ", topicFill=" + topicFill +
                ", topicFillProgram=" + topicFillProgram +
                ", topicProgram=" + topicProgram +
                ", topicFunction=" + topicFunction +
                ", topicTypeId=" + topicTypeId +
                ", topicKnowledge=" + topicKnowledge +
                '}';
    }
}