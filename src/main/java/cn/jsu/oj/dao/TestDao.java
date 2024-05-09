package cn.jsu.oj.dao;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.BaseTopic;
import cn.jsu.oj.pojo.web.vo.ExamineList;
import cn.jsu.oj.pojo.web.vo.InfoBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/26 15:57
 * describe:
 */
@Mapper
@Repository
public interface TestDao
{
    public List<TestPaper> showTestList(Integer teacherId);

    public int quoteTestToTopicSet(QTopicSetTest qTopicSetTest);

    public int updateTestBaseInfo(TestPaper testPaper);

    public List<QTestTopic> calculationDiff(Integer testId);

    public int diff(@Param("topicId") Integer topicId, @Param("topicTypeId") Integer topicTypeId);

    public List<ExamineList> queryExamineList(Integer topicSetId);

    public List<QTestTopic> queryTopicByShareCode(String shareCode);

    public BaseTopic queryBaseTopic(@Param("topicId") Integer topicId, @Param("topicTypeId") Integer topicTypeId);

    public List<TestLabel> showTestLabelList(TestLabel testLabel);

    public int addTestType(TestLabel testLabel);

    public int updateTestTypeInfo(TestLabel testLabel);

    public int deleteLabel(@Param("testLabelId") Integer testLabelId);

    public TestLabel finDefault(@Param("testId") Integer testId);

    public int moveLabel(@Param("testId") Integer testId, @Param("testLabelId") Integer testLabelId);

    public List<Integer> have(Integer testLabelId);

    public int testGuide(QTestTopic qTestTopic);

    public int addTest(TestPaper testPaper);

    public List<QTestTopic> showTestTypeId(Integer testId);

    public Integer showTestTopicList(@Param("testId") Integer testId, @Param("topicTypeId") Integer topicTypeId);

    public InfoBase queryTestBaseJ(TestPaper testPaper);

    public List<TestPointInfo> queryBaseScore(QTestTopic qTestTopic);

    public void addScore(@Param("qTestTopicId") Integer qTestTopicId, @Param("testPointNumber") Integer testPointNumber, @Param("testPointScore") Integer testPointScore);
}
