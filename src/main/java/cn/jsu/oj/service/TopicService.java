package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:13
 * describe:
 */
public interface TopicService
{
    public List<TopicType> queryTopicType();

    public TeacherBaseInfo queryUserInfo(TeacherInfo teacherInfo);

    public List<KnowledgePoints> queryTopicKnowLedge(KnowledgePoints knowledgePoints);

    public int addTopicProgram(AddTopicInfo addTopicInfo);

    public HashMap queryTopicById(QTestTopic qTestTopic);

    public List<BaseTopic> queryByTopicType(Integer topicTypeId);

    public List<BaseTopic> showTopicList(QueryTopic queryTopic);

    public CommonResult updateTopic(AddTopicInfo addTopicInfo);

    public List<TestPointInfo> queryTestCaseByIdX(TestPointInfo testPointInfo);
}
