package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/26 17:08
 * describe:
 */
public class QTestTopicList implements Serializable
{
    private List<Integer> topicIdList;
    private List<Integer> topicTypeIdList;

    public QTestTopicList()
    {
    }

    public QTestTopicList(List<Integer> topicIdList, List<Integer> topicTypeIdList)
    {
        this.topicIdList = topicIdList;
        this.topicTypeIdList = topicTypeIdList;
    }

    public List<Integer> getTopicIdList()
    {
        return topicIdList;
    }

    public void setTopicIdList(List<Integer> topicIdList)
    {
        this.topicIdList = topicIdList;
    }

    public List<Integer> getTopicTypeIdList()
    {
        return topicTypeIdList;
    }

    public void setTopicTypeIdList(List<Integer> topicTypeIdList)
    {
        this.topicTypeIdList = topicTypeIdList;
    }

    @Override
    public String toString()
    {
        return "QTestTopicList{" +
                "topicIdList=" + topicIdList +
                ", topicTypeIdList=" + topicTypeIdList +
                '}';
    }
}