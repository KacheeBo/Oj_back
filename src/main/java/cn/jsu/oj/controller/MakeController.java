package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.SubmitTopic;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.MakeService;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/30 17:05
 * describe:
 */
@CrossOrigin
@RestController
@RequestMapping("/make")
public class MakeController
{
    @Autowired
    MakeService makeService;

    @PostMapping("makeTopic")
    @ApiModelProperty("用户提交做题信息")
    public CommonResult makeTopic(@RequestBody TopicMake topicMake, HttpServletResponse response)
    {
        //System.out.println(topicMake.toString());
        //System.out.println((response==null)+"::::::::::::::::::::::::::::::::::::::::::::::");
        makeService.makeTopic(topicMake, response);
        return new CommonResult(200, "提交成功!");
    }

    @PostMapping("/queryTopicBaseInfoX")
    @ApiModelProperty("做题页面显示题目具体信息")
    public CommonResult queryTopicBaseInfoX(@RequestBody MakeRequest makeRequest)
    {
        MakeRequest make = makeService.queryTopicBaseInfoX(makeRequest);
        return new CommonResult(200, "获取成功!", make);
    }

    @PostMapping("/querySerialNumber")
    @ApiModelProperty("查看上一次提交的流水号")
    public CommonResult querySerialNumber(@RequestBody SubmitTopic submitTopic)
    {
        Long serialNumber = makeService.querySerialNumber(submitTopic);
        return new CommonResult(200, "获取成功!", serialNumber);
    }

    @PostMapping("/showTopicSubmit")
    @ApiModelProperty("通过流水号查看提交结果")
    public CommonResult showTopicSubmit(@RequestBody SubmitTopic submitTopic)
    {
        MakeResult makeResult = makeService.showTopicSubmit(submitTopic);
        return new CommonResult(200, "获取成功!", makeResult);
    }

    @PostMapping("/showTopicSubmitList")
    @ApiModelProperty("查看单道题提交列表")
    public CommonResult showTopicSubmitList(@RequestBody SubmitTopic submitTopic)
    {
        List<ListOfResult> listOfResults = makeService.showTopicSubmitList(submitTopic);
        return new CommonResult(200, "获取成功!", listOfResults);
    }

    @PostMapping("/submitAllResult")
    @ApiModelProperty("提交一次试卷中的所有的题目")
    public CommonResult submitAllResult(@RequestBody List<TopicMake> topicMakes)
    {
        for (TopicMake topicMake : topicMakes)
        {
            System.out.println(topicMake);
        }
        makeService.submitAllResult(topicMakes);
        return new CommonResult(200, "提交成功!");
    }
}
