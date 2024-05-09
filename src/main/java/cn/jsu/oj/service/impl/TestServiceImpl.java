package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.TestDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TestService;
import cn.jsu.oj.util.CWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/26 15:58
 * describe:
 */
@Service
public class TestServiceImpl implements TestService
{

    @Autowired
    TestDao testDao;

    @Autowired
    CWT cwt;

    @Override
    public List<TestPaper> showTestList(Integer teacherId)
    {
        return testDao.showTestList(teacherId);
    }

    @Override
    public int quoteTestToTopicSet(QTopicSetTest qTopicSetTest)
    {
        return testDao.quoteTestToTopicSet(qTopicSetTest);
    }

    @Override
    public int updateTestBaseInfo(TestPaper testPaper)
    {
        if (testPaper.getTestDifficulty() != null)
        {
            Integer integer = calculationDiff(testPaper.getTestId());
            testPaper.setTestDifficulty(integer);
        }
        return testDao.updateTestBaseInfo(testPaper);
    }

    @Override
    public List<ExamineList> queryExamineList(Integer topicSetId)
    {
        return testDao.queryExamineList(topicSetId);
    }

    @Override
    public ArrayList<BaseTopic> queryTopicByShareCode(String shareCode)
    {
        List<QTestTopic> qTestTopics = testDao.queryTopicByShareCode(shareCode);
        QTestTopicList qTestTopicList = fen(qTestTopics);
        ArrayList<BaseTopic> baseTopics = showTopic(qTestTopicList);
        return baseTopics;
    }

    @Override
    public List<TestLabel> showTestLabelList(TestLabel testLabel)
    {
        return testDao.showTestLabelList(testLabel);
    }

    @Override
    public int addTestType(TestLabel testLabel)
    {
        return testDao.addTestType(testLabel);
    }

    @Override
    public int updateTestTypeInfo(TestLabel testLabel)
    {
        return testDao.updateTestTypeInfo(testLabel);
    }

    @Override
    public int deleteLabel(MoveLabel moveLabel)
    {
        Integer testLabelId = moveLabel.getTestLabelId();
        List<Integer> have = testDao.have(testLabelId);
        if (have.size() > 0)
        {
            moveLabel.setTestId(have);
            Integer testLabelId1 = testDao.finDefault(have.get(0)).getTestLabelId();
            moveLabel.setTestLabelId(testLabelId1);
            int i = moveLabel(moveLabel);
            if (i > 0)
            {
                return testDao.deleteLabel(testLabelId);
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return testDao.deleteLabel(testLabelId);
        }
    }

    @Override
    public int moveLabel(MoveLabel moveLabel)
    {
        List<Integer> testId = moveLabel.getTestId();
        Integer testLabelId = moveLabel.getTestLabelId();
        for (Integer integer : testId)
        {
            int i = testDao.moveLabel(integer, testLabelId);
            if (i <= 0)
            {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int testGuide(Guide guide)
    {
        Integer testId = guide.getTestId();
        Integer topicTypeId = guide.getTopicTypeId();
        List<QTestTopic> qTestTopics = guide.getqTestTopics();
        for (QTestTopic qTestTopic : qTestTopics)
        {
            qTestTopic.setTestId(testId);
            qTestTopic.setTopicTypeId(topicTypeId);
            int i = testDao.testGuide(qTestTopic);
            Integer qTestTopicId = qTestTopic.getqTestTopicId();
            List<TestPointInfo> testPointInfos = testDao.queryBaseScore(qTestTopic);
            for (TestPointInfo testPointInfo : testPointInfos)
            {
                testDao.addScore(qTestTopicId, testPointInfo.getTestPointNumber(), testPointInfo.getTestPointScore());
            }
            if (i <= 0)
            {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public int addTest(TestPaper testPaper)
    {
        String csc = cwt.CSC();
        testPaper.setTestShareCode(csc);
        return testDao.addTest(testPaper);
    }

    @Override
    public HashMap<Integer, Integer> showTestTopicList(TestPaper testPaper)
    {
        Integer testId = testPaper.getTestId();
        List<QTestTopic> qTestTopics = testDao.showTestTypeId(testId);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (QTestTopic qTestTopic : qTestTopics)
        {
            Integer topicTypeId = qTestTopic.getTopicTypeId();
            Integer integer = testDao.showTestTopicList(testId, topicTypeId);
            map.put(topicTypeId, integer);
        }
        return map;
    }

    @Override
    public InfoBase queryTestBaseJ(TestPaper testPaper)
    {
        return testDao.queryTestBaseJ(testPaper);
    }

    private ArrayList<BaseTopic> showTopic(QTestTopicList qTestTopicList)
    {
        List<Integer> topicIdList = qTestTopicList.getTopicIdList();
        List<Integer> topicTypeIdList = qTestTopicList.getTopicTypeIdList();
        ArrayList<BaseTopic> baseTopics = new ArrayList<>();
        for (int i = 0; i < topicIdList.size(); i++)
        {
            Integer topicId = topicIdList.get(i);
            Integer topicTypeId = topicTypeIdList.get(i);
            BaseTopic baseTopic = testDao.queryBaseTopic(topicId, topicTypeId);
            baseTopic.setTopicTypeId(topicTypeId);
            baseTopics.add(baseTopic);
        }
        return baseTopics;
    }

    private Integer calculationDiff(Integer testId)
    {
        List<QTestTopic> qTestTopics = testDao.calculationDiff(testId);
        QTestTopicList qTestTopicList = fen(qTestTopics);
        return diffS(qTestTopicList);
    }

    private QTestTopicList fen(List<QTestTopic> qTestTopics)
    {
        QTestTopicList qTestTopicList = new QTestTopicList();
        List<Integer> topicIdList = new ArrayList<>();
        List<Integer> topicTypeIdList = new ArrayList<>();
        for (QTestTopic qTestTopic : qTestTopics)
        {
            Integer topicId = qTestTopic.getTopicId();
            Integer topicTypeId = qTestTopic.getTopicTypeId();
            topicIdList.add(topicId);
            topicTypeIdList.add(topicTypeId);
        }
        qTestTopicList.setTopicIdList(topicIdList);
        qTestTopicList.setTopicTypeIdList(topicTypeIdList);
        return qTestTopicList;
    }

    private int diffS(QTestTopicList qTestTopicList)
    {
        List<Integer> topicIdList = qTestTopicList.getTopicIdList();
        List<Integer> topicTypeIdList = qTestTopicList.getTopicTypeIdList();
        int result = 0;
        for (int i = 0; i < topicIdList.size(); i++)
        {
            Integer topicId = topicIdList.get(i);
            Integer topicTypeId = topicTypeIdList.get(i);
            int diff = testDao.diff(topicId, topicTypeId);
            result = result + diff;
        }
        return (int) (result / (topicIdList.size()));
    }


}
