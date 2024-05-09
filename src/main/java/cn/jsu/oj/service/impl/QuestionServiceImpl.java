package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.QuestionDao;
import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.service.QuestionService;
import cn.jsu.oj.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/28 10:11
 * describe:
 */
@Service
public class QuestionServiceImpl implements QuestionService
{
    @Autowired
    QuestionDao questionDao;

    @Autowired
    TopicService topicService;

    @Override
    public HashMap showTopicBaseInfo(QTestTopic qTestTopic)
    {
        HashMap hashMap = topicService.queryTopicById(qTestTopic);
        QTestTopic qTestTopic1 = questionDao.showTopicBaseInfo(qTestTopic);
        Integer topicFraction = qTestTopic1.getTopicFraction();
        Integer topicTitle = qTestTopic1.getTopicTitle();
        hashMap.put("topicFraction", topicFraction);
        hashMap.put("topicTitle", topicTitle);
        return hashMap;
    }

    @Override
    public CommonResult makeTopic()
    {
        return null;
    }

    @Override
    public CommonResult showLastTopicSubmit()
    {
        return null;
    }

    @Override
    public CommonResult showTopicSetTopicList()
    {
        return null;
    }

    @Override
    public CommonResult showTopicSubmitList()
    {
        return null;
    }

    @Override
    public CommonResult queryTopicSetOneSubmitList()
    {
        return null;
    }
}
