package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.MakeDao;
import cn.jsu.oj.net.thread.NettyOutThread;
import cn.jsu.oj.pojo.net.QuestionTaskInformation;
import cn.jsu.oj.pojo.web.dto.SubmitTopic;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.MakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:31
 * describe:
 */
@Service
public class MakeServiceImpl implements MakeService
{
    private LinkedBlockingQueue<QuestionTaskInformation> linkedBlockingQueue;

    public void setLinkedBlockingQueue(LinkedBlockingQueue linkedBlockingQueue)
    {
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    public LinkedBlockingQueue<QuestionTaskInformation> getLinkedBlockingQueue()
    {
        return linkedBlockingQueue;
    }

    @Autowired
    ConcurrentHashMap map;

    @Autowired
    NettyOutThread nettyOutThread;

    @Autowired
    MakeDao makeDao;

    @Override
    public void makeTopic(TopicMake topicMake, HttpServletResponse response)
    {
        make(topicMake, response);
    }

    private void make(TopicMake topicMake, HttpServletResponse response)
    {
        SubmitTopic submitTopic = new SubmitTopic();
        long serialNumber = System.currentTimeMillis();
        byte judgeModel = topicMake.getJudgeModel();
        byte languageType = topicMake.getLanguageType();
        Integer topicTypeId = topicMake.getTopicTypeId();
        Integer topicId = topicMake.getTopicId();
        String subjectId = topicTypeId + "-" + topicId;
        String sourceCode = topicMake.getSourceCode();
        Integer topicSetId = topicMake.getTopicSetId();
        Integer accountId = topicMake.getAccountId();
        submitTopic.setTopicId(topicId);
        submitTopic.setTopicTypeId(topicTypeId);
        submitTopic.setJudgeModel(Integer.valueOf(judgeModel));
        submitTopic.setLanguageId(Integer.valueOf(languageType));
        submitTopic.setSubmitCode(sourceCode);
        submitTopic.setSerialNumber(serialNumber);
        submitTopic.setTopicSetId(topicSetId);
        submitTopic.setAccountId(accountId);
        if (response != null)
        {
            map.put(serialNumber, response);
        }
        makeDao.addMakeTopic(submitTopic);
        WAMax waMax = makeDao.queryWeight(topicMake);
        QuestionTaskInformation info = new QuestionTaskInformation();
        info.setTaskPriority(true);
        info.setLanguageType(languageType);
        info.setJudgeModel(judgeModel);
        info.setSubjectId(subjectId);
        info.setSerialNumber(serialNumber);
        info.setSourceCode(sourceCode);
        info.setTaskWeight(waMax.getTopicWeight());
        info.setMaxRunningTime(waMax.getTopicTimeL());
        info.setMaxRunningMemory(waMax.getTopicMemoryL());
        try
        {
            linkedBlockingQueue.put(info);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public MakeRequest queryTopicBaseInfoX(MakeRequest makeRequest)
    {
        return makeDao.queryTopicBaseInfoX(makeRequest);
    }

    @Override
    public Long querySerialNumber(SubmitTopic submitTopic)
    {
        return makeDao.querySerialNumber(submitTopic);
    }

    @Override
    public MakeResult showTopicSubmit(SubmitTopic submitTopic)
    {
        MakeResult makeResult = makeDao.showTopicSubmit(submitTopic);
        List<PointResult> pointResults = makeDao.showPoint(submitTopic);
        makeResult.setPointResults(pointResults);
        return makeResult;
    }

    @Override
    public List<ListOfResult> showTopicSubmitList(SubmitTopic submitTopic)
    {
        List<ListOfResult> listOfResults = new ArrayList<>();
        ArrayList<ListOfResult> results = new ArrayList<>();
        ArrayList<ListOfResult> list = new ArrayList<>();
        HashSet<Map<Integer, Integer>> all = new HashSet<>();
        if (submitTopic.getTopicTypeId() != null)
        {
            listOfResults = makeDao.showTopicSubmitList(submitTopic);
            results = listSort(listOfResults);
        }
        else if (submitTopic.getSerialNumber() == 1)
        {
            List<SubmitTopic> submitTopics = makeDao.queryIdAndTId(submitTopic);
            SubmitTopic sbT = new SubmitTopic();
            sbT.setTopicSetId(submitTopic.getTopicSetId());
            sbT.setAccountId(submitTopic.getAccountId());
            for (SubmitTopic topic : submitTopics)
            {
                Integer topicTypeId = topic.getTopicTypeId();
                Integer topicId = topic.getTopicId();
                System.out.println(topicTypeId + "LLLLLLLLLLLLLL" + topicId);
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(topicTypeId, topicId);
                all.add(map);
            }
            for (Map<Integer, Integer> map : all)
            {
                for (Integer key : map.keySet())
                {
                    sbT.setTopicTypeId(key);
                    sbT.setTopicId(map.get(key));
                    listOfResults = makeDao.showTopicSubmitList(sbT);
                    list = listSort(listOfResults);
                    for (ListOfResult listOfResult : list)
                    {
                        results.add(listOfResult);
                    }
                }
            }
        }
        else if (submitTopic.getSerialNumber() == 2)
        {
            List<SubmitTopic> submitTopics = makeDao.queryIdAndTIdNoAccount(submitTopic);
            SubmitTopic sbT = new SubmitTopic();
            sbT.setTopicSetId(submitTopic.getTopicSetId());
            sbT.setAccountId(submitTopic.getAccountId());
            for (SubmitTopic topic : submitTopics)
            {
                Integer topicTypeId = topic.getTopicTypeId();
                Integer topicId = topic.getTopicId();
                System.out.println(topicTypeId + "LLLLLLLLLLLLLL" + topicId);
                sbT.setTopicTypeId(topicTypeId);
                sbT.setTopicId(topicId);
                sbT.setAccountId(topic.getAccountId());
                listOfResults = makeDao.showTopicSubmitList(sbT);
                list = listSort(listOfResults);
                for (ListOfResult listOfResult : list)
                {
                    results.add(listOfResult);
                }
            }
        }
        return results;
    }

    private ArrayList<ListOfResult> listSort(List<ListOfResult> listOfResults)
    {
        ArrayList<ListOfResult> ls = null;
        ArrayList<ArrayList<ListOfResult>> list = new ArrayList<>();
        long oldNum = 0;
        for (ListOfResult listOfResult : listOfResults)
        {
            long serialNumber = listOfResult.getSerialNumber();
            if (oldNum != serialNumber)
            {
                ls = new ArrayList<>();
                ls.add(listOfResult);
                if (!list.contains(ls))
                {
                    list.add(ls);
                }
                oldNum = serialNumber;
            }
            else
            {
                ls.add(listOfResult);
            }
        }
        ArrayList<ListOfResult> results = judgeState(list);
        return results;
    }

    @Override
    public void submitAllResult(List<TopicMake> topicMakes)
    {
        for (TopicMake topicMake : topicMakes)
        {
            make(topicMake, null);
        }
    }

    private ArrayList<ListOfResult> judgeState(ArrayList<ArrayList<ListOfResult>> list)
    {
        ArrayList<ListOfResult> results = new ArrayList<>();
        for (ArrayList<ListOfResult> listOfResults : list)
        {
            ListOfResult ls = new ListOfResult();
            Integer sumScore = 0;
            long serialNumber = 0;
            Date submitTime = null;
            String languageName = null;
            Integer runTimeMax = 0;
            Integer runMemoryMax = 0;
            Integer topicTitle = 0;
            Integer topicTypeId = 0;
            String accountId = null;
            String accountNickName = null;
            HashSet<Integer> integers = new HashSet<>();
            for (ListOfResult listOfResult : listOfResults)
            {
                serialNumber = listOfResult.getSerialNumber();
                submitTime = listOfResult.getSubmitTime();
                sumScore = listOfResult.getJudgePointScore() + sumScore;
                languageName = listOfResult.getLanguageName();
                topicTitle = listOfResult.getTopicTitle();
                topicTypeId = listOfResult.getTopicTypeId();
                accountId = listOfResult.getAccountId();
                accountNickName = listOfResult.getAccountNickName();
                Integer runTime = listOfResult.getRunTime();
                Integer runMemory = listOfResult.getRunMemory();
                if (runTimeMax < runTime)
                {
                    runTimeMax = runTime;
                }
                if (runMemoryMax < runMemory)
                {
                    runMemoryMax = runMemory;
                }
                integers.add(listOfResult.getSituationId());
            }
            String s = finalState(integers);
            ls.setJudgePointScore(sumScore);
            ls.setSerialNumber(serialNumber);
            ls.setSubmitTime(submitTime);
            ls.setLanguageName(languageName);
            ls.setRunTime(runTimeMax);
            ls.setRunMemory(runMemoryMax);
            ls.setTopicTitle(topicTitle);
            ls.setTopicTypeId(topicTypeId);
            ls.setAccountId(accountId);
            ls.setAccountNickName(accountNickName);
            ls.setSituationName(s);
            results.add(ls);
        }
        return results;
    }

    private String finalState(HashSet<Integer> integers)
    {
        String result = null;
        int size = integers.size();
        if (integers.contains(2))
        {
            result = "编译错误";
        }
        else if ((integers.contains(1)) && (size == 1))
        {
            result = "答案正确";
        }
        else if ((integers.contains(11)) && (size == 1))
        {
            result = "答案错误";
        }
        else if ((integers.contains(10)) && (size == 1))
        {
            result = "格式错误";
        }
        else if (((integers.contains(1)) && (size >= 2)))
        {
            result = "部分正确";
        }
        else if ((integers.contains(5)) && (size == 1))
        {
            result = "浮点错误";
        }
        else if ((integers.contains(4)) && (size == 1))
        {
            result = "段错误";
        }
        else if ((integers.contains(9)) && (size == 1))
        {
            result = "内存超限";
        }
        else if ((integers.contains(8)) && (size == 1))
        {
            result = "运行超时";
        }
        else if ((integers.contains(6)) && (size == 1))
        {
            result = "非零返回";
        }
        else if ((integers.contains(12)) && (size == 1))
        {
            result = "输出超限";
        }
        else
        {
            result = "多种错误";
        }
        return result;
    }
}