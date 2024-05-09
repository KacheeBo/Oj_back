package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.TopicDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TopicService;
import cn.jsu.oj.util.CWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:13
 * describe:
 */
@Service
public class TopicServiceImpl implements TopicService
{

    @Autowired
    TopicDao topicDao;

    @Autowired
    CWT cwt;

    @Override
    public List<TopicType> queryTopicType()
    {
        return topicDao.queryTopicType();
    }

    @Override
    public TeacherBaseInfo queryUserInfo(TeacherInfo teacherInfo)
    {
        return topicDao.queryUserInfo(teacherInfo);
    }

    @Override
    public List<KnowledgePoints> queryTopicKnowLedge(KnowledgePoints knowledgePoints)
    {
        Integer knowledgeFatherId = knowledgePoints.getKnowledgeFatherId();
        if (knowledgeFatherId != null)
        {
            return topicDao.queryTopicKnowLedge(knowledgePoints);
        }
        else
        {
            return topicDao.queryTopicKnowLedgeNull();
        }
    }

    @Override
    public int addTopicProgram(AddTopicInfo addTopicInfo)
    {
        TopicProgram topicProgram = addTopicInfo.getTopicProgram();
        Integer topicTypeId = addTopicInfo.getTopicTypeId();
        List<Integer> list = addTopicInfo.getTopicKnowledge();
        int i = topicDao.addTopicProgram(topicProgram);
        Integer topicId = topicProgram.getTopicId();
        TopicKnowledge topicKnowledge = new TopicKnowledge();
        if (i > 0)
        {
            for (int k = 0; k < list.size(); k++)
            {
                topicKnowledge.setTopicTypeId(topicTypeId);
                topicKnowledge.setTopicId(topicId);
                topicKnowledge.setKnowledgeId(list.get(k));
                topicDao.addTopicKnow(topicKnowledge);
            }
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public HashMap queryTopicById(QTestTopic qTestTopic)
    {
        Integer topicId = qTestTopic.getTopicId();
        Integer topicTypeId = qTestTopic.getTopicTypeId();
        HashMap hashMap = topicDao.queryTopicById(topicTypeId, topicId);
        ArrayList<Object> list = cwt.queryPoint(topicId, topicTypeId);
        hashMap.put("KnowledgeName", list);
        return hashMap;
    }

    @Override
    public List<BaseTopic> queryByTopicType(Integer topicTypeId)
    {
        return topicDao.queryByTopicType(topicTypeId);
    }

    @Override
    public List<BaseTopic> showTopicList(QueryTopic queryTopic)
    {
        return topicDao.showTopicList(queryTopic);
    }

    @Override
    public CommonResult updateTopic(AddTopicInfo addTopicInfo)
    {
        Integer topicTypeId = addTopicInfo.getTopicTypeId();
        TopicProgram topicProgram = addTopicInfo.getTopicProgram();

        //topicDao.queryCanUpdateTopic(topicId);
        switch (topicTypeId)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:

                break;
            case 7:
                break;
        }
        //topicDao.updateTopic()
        return null;
    }

    @Override
    public List<TestPointInfo> queryTestCaseByIdX(TestPointInfo testPointInfo)
    {
        return topicDao.queryTestCaseByIdX(testPointInfo);
    }

}
