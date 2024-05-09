package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.QTestTopic;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.service.QuestionService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/28 9:25
 * describe:
 */
@CrossOrigin
@RestController
@RequestMapping("/makeQuestion")
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @PostMapping("/showTopicBaseInfo")
    @ApiModelProperty("获取单个题目信息(做题界面)")
    public CommonResult showTopicBaseInfo(@RequestBody QTestTopic qTestTopic)
    {
        HashMap hashMap = questionService.showTopicBaseInfo(qTestTopic);
        return new CommonResult(200, "获取完成!", hashMap);
    }

    @PostMapping("/makeTopic")
    @ApiModelProperty("用户提交做题信息")//参数待定
    public CommonResult makeTopic(@RequestBody QTestTopic qTestTopic)
    {
        return new CommonResult(200, "获取完成!");
    }

    @PostMapping("/showLastTopicSubmit")
    @ApiModelProperty("查看上次提交结果")
    public CommonResult showLastTopicSubmit(@RequestBody QTestTopic qTestTopic)
    {
        return new CommonResult(200, "获取完成!");
    }

    @PostMapping("/showTopicSetTopicList")
    @ApiModelProperty("查看题目列表")//QTestTopic有三个不同的地方需要调同样的接口
    public CommonResult showTopicSetTopicList(@RequestBody QTestTopic qTestTopic)
    {
        return new CommonResult(200, "获取完成!");
    }

    @PostMapping("/showTopicSubmitList")
    @ApiModelProperty("查看提交列表")//QTestTopic
    public CommonResult showTopicSubmitList(@RequestBody QTestTopic qTestTopic)
    {
        return new CommonResult(200, "获取完成!");
    }

    @PostMapping("/queryTopicSetOneSubmitList")
    @ApiModelProperty("更具id获取提交详情")
    public CommonResult queryTopicSetOneSubmitList(@RequestBody QTestTopic qTestTopic)
    {
        return new CommonResult(200, "获取完成!");
    }
}
