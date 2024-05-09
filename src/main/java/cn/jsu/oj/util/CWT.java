package cn.jsu.oj.util;

import cn.jsu.oj.dao.TopicDao;
import cn.jsu.oj.pojo.web.dto.KnowledgePoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/25 11:13
 * describe:
 * 比较是否超时
 */
@Component
public class CWT
{

    @Autowired
    TopicDao topicDao;

    public String cwt(HashMap<String, Date> map)
    {
        String result = null;
        long start = map.get("start").getTime();
        long end = map.get("end").getTime();
        if (start > System.currentTimeMillis())
        {
            result = "未开始";
        }
        else if (start < System.currentTimeMillis() && System.currentTimeMillis() < end)
        {
            result = "已开始";
        }
        else
        {
            result = "已结束";
        }
        return result;
    }

    public String CSC()
    {
        long l = System.currentTimeMillis();
        return Long.toHexString(l);
    }

    public ArrayList<Object> queryPoint(Integer topicId, Integer topicTypeId)
    {
        ArrayList<Object> list = new ArrayList<>();
        List<KnowledgePoints> knowledgePoints = topicDao.queryPoint(topicTypeId, topicId);
        for (KnowledgePoints knowledgePoint : knowledgePoints)
        {
            ArrayList<Object> integers = new ArrayList<>();
            KnowledgePoints knowledgePoints1 = topicDao.queryPointBy(knowledgePoint.getKnowledgeFatherId());
            KnowledgePoints knowledgePoints2 = topicDao.queryPointBy(knowledgePoints1.getKnowledgeFatherId());
            integers.add(knowledgePoint.getKnowledgeId());
            integers.add(knowledgePoint.getKnowledgeType());
            integers.add(knowledgePoints1.getKnowledgeType());
            integers.add(knowledgePoints2.getKnowledgeType());
            list.add(integers);
        }
        return list;
    }
}