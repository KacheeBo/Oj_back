package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TopicService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:12
 * describe:
 */
@CrossOrigin
@RestController
@RequestMapping("/topic")
public class TopicController
{
    @Autowired
    TopicService topicService;

    @PostMapping("/queryTopicType")
    @ApiModelProperty("获取题目类型")
    public CommonResult queryTopicType()
    {
        List<TopicType> topicTypes = topicService.queryTopicType();
        return new CommonResult(200, "获取成功!", topicTypes);
    }

    @PostMapping("/queryUserInfo")
    @ApiModelProperty("检索用户及单位")
    public CommonResult queryUserInfo(@RequestBody TeacherInfo teacherInfo)
    {
        TeacherBaseInfo teacherBaseInfo = topicService.queryUserInfo(teacherInfo);
        return new CommonResult(200, "检索完成!", teacherBaseInfo);
    }

    @PostMapping("/queryTopicKnowLedge")
    @ApiModelProperty("获取知识点")
    public CommonResult queryTopicKnowLedge(@RequestBody KnowledgePoints knowledgePoints)
    {
        List<KnowledgePoints> knowledgePointsL = topicService.queryTopicKnowLedge(knowledgePoints);
        return new CommonResult(200, "获取完成!", knowledgePointsL);
    }

    @PostMapping("/addTopicProgram")
    @ApiModelProperty("增加题目")
    public CommonResult addTopicProgram(@RequestBody AddTopicInfo addTopicInfo)
    {
        int i = topicService.addTopicProgram(addTopicInfo);
        if (i > 0)
        {
            return new CommonResult(200, "增加成功!");
        }
        else
        {
            return new CommonResult(444, "增加失败!");
        }
    }

    @PostMapping("/showTopicList")
    @ApiModelProperty("获取教师的题目列表")
    public CommonResult showTopicList(@RequestBody QueryTopic queryTopic)
    {
        List<BaseTopic> baseTopics = topicService.showTopicList(queryTopic);
        return new CommonResult(200, "获取完成!", baseTopics);
    }

    @PostMapping("/queryTopicById")
    @ApiModelProperty("获取题目基本信息")
    public CommonResult queryTopicById(@RequestBody QTestTopic qTestTopic)
    {
        HashMap hashMap = topicService.queryTopicById(qTestTopic);
        return new CommonResult(200, "获取完成!", hashMap);
    }

    @PostMapping("/queryByTopicType")
    @ApiModelProperty("根据题目类型查表")
    public CommonResult queryByTopicType(@RequestBody TopicType topicType)
    {
        List<BaseTopic> baseTopics = topicService.queryByTopicType(topicType.getTopicTypeId());
        return new CommonResult(200, "获取完成!", baseTopics);
    }

    //@PostMapping("/updateTopic")
    //@ApiModelProperty("修改题目")
    //public CommonResult updateTopic(@RequestBody AddTopicInfo addTopicInfo)
    //{
    //    return new CommonResult(200, "获取完成!");
    //}

    @PostMapping("/queryTestCaseByIdX")
    @ApiModelProperty("根据题目id和题目类型id获取测试用例")
    public CommonResult queryTestCaseByIdX(@RequestBody TestPointInfo testPointInfo)
    {
        List<TestPointInfo> testPointInfos = topicService.queryTestCaseByIdX(testPointInfo);
        return new CommonResult(200, "获取成功!", testPointInfos);
    }
}
