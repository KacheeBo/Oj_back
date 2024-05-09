package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.AddTopicInfo;
import cn.jsu.oj.pojo.web.vo.BaseTopic;
import cn.jsu.oj.pojo.web.vo.QueryTopic;
import cn.jsu.oj.pojo.web.vo.TeacherBaseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:13
 * describe:
 */
@Mapper
@Repository
public interface TopicDao
{

    public List<TopicType> queryTopicType();

    public TeacherBaseInfo queryUserInfo(TeacherInfo teacherInfo);

    public List<KnowledgePoints> queryTopicKnowLedge(KnowledgePoints knowledgePoints);

    public List<KnowledgePoints> queryTopicKnowLedgeNull();

    public int addTopicProgram(TopicProgram topicProgram);

    public int addTopicKnow(TopicKnowledge topicKnowledge);

    public HashMap queryTopicById(@Param("topicTypeId") Integer topicTypeId, @Param("topicId") Integer topicId);

    public List<KnowledgePoints> queryPoint(@Param("topicTypeId") Integer topicTypeId, @Param("topicId") Integer topicId);

    public KnowledgePoints queryPointBy(@Param("knowledgeFatherId") Integer knowledgeFatherId);

    public List<BaseTopic> queryByTopicType(@Param("topicTypeId") Integer topicTypeId);

    public List<BaseTopic> showTopicList(QueryTopic queryTopic);

    public List<TestPointInfo> queryTestCaseByIdX(TestPointInfo testPointInfo);

    public int updateTopic(AddTopicInfo addTopicInfo);

    public TopicProgram queryCanUpdateTopic(Integer topicId);
}
