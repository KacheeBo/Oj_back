package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.dto.QTopicSetTest;
import cn.jsu.oj.pojo.web.dto.TestLabel;
import cn.jsu.oj.pojo.web.dto.TestPaper;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TestService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/17 10:57
 * describe:
 * 试卷
 */
@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController
{
    @Autowired
    TestService testService;

    @PostMapping("/showTestList")
    @ApiOperation("获取试卷列表")
    public CommonResult showTestList(@RequestBody Integer teacherId)
    {
        List<TestPaper> testPapers = testService.showTestList(teacherId);
        return new CommonResult(200, "查询成功!", testPapers);
    }

    @PostMapping("/quoteTestToTopicSet")
    @ApiModelProperty("引用试卷到题目集")
    public CommonResult quoteTestToTopicSet(@RequestBody QTopicSetTest qTopicSetTest)
    {
        int i = testService.quoteTestToTopicSet(qTopicSetTest);
        if (i > 0)
        {
            return new CommonResult(200, "引用成功!");
        }
        else
        {
            return new CommonResult(444, "引用失败!");
        }
    }

    @PostMapping("/updateTestBaseInfo")
    @ApiModelProperty("通过试卷id和试卷名称修改试卷信息")
    public CommonResult updateTestBaseInfo(@RequestBody TestPaper testPaper)
    {
        int i = testService.updateTestBaseInfo(testPaper);
        if (i > 0)
        {
            return new CommonResult(200, "修改成功!");
        }
        else
        {
            return new CommonResult(444, "修改失败!");
        }
    }

    //@PostMapping("/queryTestByTopicSetId")
    //@ApiModelProperty("查询题目集下引用的试卷")
    //public CommonResult queryTestByTopicSetId()
    //{
    //
    //    return new CommonResult(200, "");
    //}

    @PostMapping("/queryTopicByShareCode")
    @ApiModelProperty("根据分享码获取试卷下的题目")
    public CommonResult queryTopicByShareCode(@RequestBody String shareCode)
    {
        ArrayList<BaseTopic> baseTopics = testService.queryTopicByShareCode(shareCode);
        return new CommonResult(200, "查询成功!", baseTopics);
    }

    @PostMapping("/queryExamineList")
    @ApiModelProperty("显示考生列表")
    public CommonResult queryExamineList(@RequestBody Integer topicSetId)
    {
        List<ExamineList> studentInfos = testService.queryExamineList(topicSetId);
        return new CommonResult(200, "查询成功!", studentInfos);
    }

    @PostMapping("/showTestLabelList")
    @ApiModelProperty("通过教师Id查询分类标签")
    public CommonResult showTestLabelList(@RequestBody TestLabel testLabel)
    {
        List<TestLabel> testLabels = testService.showTestLabelList(testLabel);
        return new CommonResult(200, "查询成功!", testLabels);
    }

    @PostMapping("/addTestType")
    @ApiModelProperty("通过教师Id增加分类")
    public CommonResult addTestType(@RequestBody TestLabel testLabel)
    {
        int i = testService.addTestType(testLabel);
        if (i > 0)
        {
            return new CommonResult(200, "增加成功!");
        }
        else
        {
            return new CommonResult(444, "增加失败!");
        }
    }

    @PostMapping("/updateTestTypeInfo")
    @ApiModelProperty("通过教师Id修改分类")
    public CommonResult updateTestTypeInfo(@RequestBody TestLabel testLabel)
    {
        int i = testService.updateTestTypeInfo(testLabel);
        if (i > 0)
        {
            return new CommonResult(200, "修改成功!");
        }
        else
        {
            return new CommonResult(444, "修改失败!");
        }
    }

    @PostMapping("/deleteLabel")
    @ApiModelProperty("删除试卷分类标签")//依据id删除`test_label`移动到默认分类标签中
    public CommonResult deleteLabel(@RequestBody MoveLabel moveLabel)
    {
        int i = testService.deleteLabel(moveLabel);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/moveLabel")
    @ApiModelProperty("移动试卷所在分类标签")//依据id删除`test_label`移动到默认分类标签中
    public CommonResult moveLabel(@RequestBody MoveLabel moveLabel)
    {
        int i = testService.moveLabel(moveLabel);
        if (i > 0)
        {
            return new CommonResult(200, "修改成功!");
        }
        else
        {
            return new CommonResult(444, "修改失败!");
        }
    }

    @PostMapping("/testGuide")
    @ApiModelProperty("批量导题")//相当于插入List<QTestTopic>
    public CommonResult testGuide(@RequestBody Guide guide)
    {
        int i = testService.testGuide(guide);
        if (i > 0)
        {
            return new CommonResult(200, "导题成功!");
        }
        else
        {
            return new CommonResult(444, "导题失败!");
        }
    }

    @PostMapping("/addTest")
    @ApiModelProperty("增加试卷")
    public CommonResult addTest(@RequestBody TestPaper testPaper)
    {
        int i = testService.addTest(testPaper);
        if (i > 0)
        {
            return new CommonResult(200, "增加成功!");
        }
        else
        {
            return new CommonResult(444, "增加失败!");
        }
    }

    @PostMapping("/showTestTopicList")
    @ApiModelProperty("查询试卷下所有题型的最后一个题目的标号")
    public CommonResult showTestTopicList(@RequestBody TestPaper testPaper)
    {
        HashMap<Integer, Integer> map = testService.showTestTopicList(testPaper);
        return new CommonResult(200, "查询成功!", map);
    }

    @PostMapping("/queryTestBaseJ")
    @ApiModelProperty("依据试卷id查询")
    public CommonResult queryTestBaseJ(@RequestBody TestPaper testPaper)
    {
        InfoBase infoBase = testService.queryTestBaseJ(testPaper);
        return new CommonResult(200, "查询成功!", infoBase);
    }


    //@PostMapping("/deleteTestTopicJ")
    //@ApiModelProperty("依据试卷id查询")
    //public CommonResult deleteTestTopicJ(@RequestBody TestPaper testPaper)
    //{
    //    //testService.deleteTestTopicJ(testPaper);
    //    return new CommonResult(200, "查询成功!");
    //}

    @PostMapping("/deleteTopic")
    @ApiModelProperty("删除试卷中的题目")
    public CommonResult deleteTopic(@RequestBody QTestTopic qTestTopic)
    {
        //topicService.de
        return new CommonResult(200, "获取完成!");
    }
}
