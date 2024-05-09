package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.QTopicSetTest;
import cn.jsu.oj.pojo.web.dto.TestLabel;
import cn.jsu.oj.pojo.web.dto.TestPaper;
import cn.jsu.oj.pojo.web.vo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/26 15:58
 * describe:
 */
public interface TestService
{
    public List<TestPaper> showTestList(Integer teacherId);

    public int quoteTestToTopicSet(QTopicSetTest qTopicSetTest);

    public int updateTestBaseInfo(TestPaper testPaper);

    public List<ExamineList> queryExamineList(Integer topicSetId);

    public ArrayList<BaseTopic> queryTopicByShareCode(String shareCode);

    public List<TestLabel> showTestLabelList(TestLabel testLabel);

    public int addTestType(TestLabel testLabel);

    public int updateTestTypeInfo(TestLabel testLabel);

    public int deleteLabel(MoveLabel moveLabel);

    public int moveLabel(MoveLabel moveLabel);

    public int testGuide(Guide guide);

    public int addTest(TestPaper testPaper);

    public HashMap<Integer, Integer> showTestTopicList(TestPaper testPaper);

    public InfoBase queryTestBaseJ(TestPaper testPaper);

}
