package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.TopicSetService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/17 15:06
 * describe:
 * 关于题目集的所有的操作
 */
@CrossOrigin
@RestController
@RequestMapping("/topicSet")
public class TopicSetController
{
    @Autowired
    public TopicSetService topicSetService;

    @PostMapping("/createTopicSet")
    @ApiOperation("增加题目集信息")
     public CommonResult createTopicSet(@RequestBody TopicSetInfo topicSetInfo)
    {
        topicSetInfo.setTopicSetShareCode(Long.toHexString(System.currentTimeMillis()));
        int topicSet = topicSetService.createTopicSet(topicSetInfo);
        if (topicSet > 0)
        {
            return new CommonResult(200, "添加题目集成功!");
        }
        else
        {
            return new CommonResult(404, "添加题目集失败!");
        }
    }

    @PostMapping("/showTopicSet")
    @ApiOperation("题目集类型")
    public CommonResult showTopicSet(@RequestBody TopicSetInfo topicSetInfo)
    {
        Integer teacherId = topicSetInfo.getTeacherId();
        boolean topicSetRecycled = topicSetInfo.isTopicSetRecycled();
        List<TopicSetBaseInfo> topicSetInfos = topicSetService.showTopicSet(teacherId, topicSetRecycled);
        return new CommonResult(200, "返回结果成功!", topicSetInfos);
    }

    @PostMapping("/queryLanguage")
    @ApiModelProperty("查询语言及对应版本还有多选题及判分规则")
    public CommonResult queryLanguage()
    {
        HashMap hashMap = topicSetService.queryLanguage();
        return new CommonResult(200, "返回结果成功!", hashMap);
    }

    @PostMapping("/queryTopicSetType")
    @ApiModelProperty("获取题目集类型")
    public CommonResult queryTopicSetType()
    {
        List<TopicSetType> topicSetTypes = topicSetService.queryTopicSetType();
        return new CommonResult(200, "返回结果成功!", topicSetTypes);
    }

    @PostMapping("/queryTopicSetSort")
    @ApiModelProperty("查询题目集分类")
    public CommonResult queryTopicSetSort(@RequestBody Integer teacherId)
    {
        List<TopicSetLabel> topicSetLabels = topicSetService.queryTopicSetSort(teacherId);
        return new CommonResult(200, "返回结果成功!", topicSetLabels);
    }

    @PostMapping("/queryTopicSetInfoById")
    @ApiModelProperty("通过题目集以及教师id查询题目及基本信息")
    public CommonResult queryTopicSetInfoById(@RequestBody TopicSetInfo topicSetInfo)
    {
        Integer teacherId = topicSetInfo.getTeacherId();
        Integer topicSetId = topicSetInfo.getTopicSetId();
        TopicSetSpecific topicSetSpecific = topicSetService.queryTopicSetInfoById(teacherId, topicSetId);
        return new CommonResult(200, "返回结果成功!", topicSetSpecific);
    }

    @PostMapping("/updateTopicSetInfo")
    @ApiModelProperty("更新题目集信息")
    public CommonResult updateTopicSetInfo(@RequestBody TopicSetInfo topicSetInfo)
    {
        int result = topicSetService.updateTopicSetInfo(topicSetInfo);
        if (result > 0)
        {
            return new CommonResult(200, "修改题目集成功!");
        }
        else
        {
            return new CommonResult(404, "修改题目集失败!");
        }
    }

    @PostMapping("/moveTopicSet")
    @ApiModelProperty("移动题目集到回收站或者是移动回收站的题目到相应的页面")
    public CommonResult moveTopicSet(@RequestBody int[] ints)
    {
        topicSetService.moveTopicSet(ints);
        return new CommonResult(200, "移动题目集成功!");
    }

    @PostMapping("/addTopicSetEmpower")
    @ApiModelProperty("增加用户组授权")
    public CommonResult addTopicSetEmpower(@RequestBody AddUserGroupAuthority groupAuthority)
    {
        topicSetService.addTopicSetEmpower(groupAuthority);
        return new CommonResult(200, "增加成功!");
    }

    @PostMapping("/queryUnEmpowerGroup")
    @ApiModelProperty("获取未授权用户组信息")
    public CommonResult queryUnEmpowerGroup(@RequestBody TopicSetInfo topicSetInfo)
    {
        Integer teacherId = topicSetInfo.getTeacherId();
        Integer topicSetId = topicSetInfo.getTopicSetId();
        List<UserGroupInfo> userGroupInfos = topicSetService.queryUnEmpowerGroup(teacherId, topicSetId);
        return new CommonResult(200, "查询完成!", userGroupInfos);
    }

    @PostMapping("/queryGroupByTopicSetId")
    @ApiModelProperty("获取已授权用户组列表")
    public CommonResult queryGroupByTopicSetId(@RequestBody Integer topicSetId)
    {
        List<AuthorityUserGroup> authorityUserGroups = topicSetService.queryGroupByTopicSetId(topicSetId);
        return new CommonResult(200, "查询完成!", authorityUserGroups);
    }

    @PostMapping("/updateByAuthorityId")
    @ApiModelProperty("修改权限信息")
    public CommonResult updateByAuthorityId(@RequestBody UserGroupAuthority userGroupAuthority)
    {
        int i = topicSetService.updateByAuthorityId(userGroupAuthority);
        if (i > 0)
        {
            return new CommonResult(200, "修改成功!");
        }
        else
        {
            return new CommonResult(444, "修改失败!");
        }
    }

    @PostMapping("/deleteAuthorityId")
    @ApiModelProperty("删除用户组权限")
    public CommonResult deleteAuthorityId(@RequestBody Integer authorityId)
    {
        int i = topicSetService.deleteAuthorityId(authorityId);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/addTopicSetSort")
    @ApiModelProperty("增加题目集分类标签")
    public CommonResult addTopicSetSort(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.addTopicSetSort(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "增加成功!");
        }
        else
        {
            return new CommonResult(444, "增加失败!");
        }
    }

    @PostMapping("/updateTopicSetSort")
    @ApiModelProperty("修改题目集分类标签")
    public CommonResult updateTopicSetSort(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.updateTopicSetSort(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "修改成功!");
        }
        else
        {
            return new CommonResult(444, "修改失败!");
        }
    }

    @PostMapping("/deleteTopicSetSortById")
    @ApiModelProperty("删除题目集分类标签")
    public CommonResult deleteTopicSetSortById(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.deleteTopicSetSortById(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/queryExamineById")
    @ApiModelProperty("根据用户组id或用户id和题目集id获取考生列表")
    public CommonResult queryExamineById(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.deleteTopicSetSortById(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/moveSortByTopicSetId")
    @ApiModelProperty("移动到分类标签下")
    public CommonResult moveSortByTopicSetId(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.deleteTopicSetSortById(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/likeTopicSetById")
    @ApiModelProperty("移动到分类标签下")
    public CommonResult likeTopicSetById(@RequestBody TopicSetLabel topicSetLabel)
    {
        int i = topicSetService.deleteTopicSetSortById(topicSetLabel);
        if (i > 0)
        {
            return new CommonResult(200, "删除成功!");
        }
        else
        {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/queryTopicByTopicSetIdX")
    @ApiModelProperty("查询")
    public CommonResult queryTopicByTopicSetIdX(@RequestBody QTopicSetTest qTopicSetTest)
    {
        List<Object> objects = topicSetService.queryTopicByTopicSetIdX(qTopicSetTest);
        return new CommonResult(200, "查询成功!", objects);
    }

    @PostMapping("/queryStudentTopicSet")
    @ApiModelProperty("查询")
    public CommonResult queryStudentTopicSet(@RequestBody AccountInfo accountInfo)
    {
        ArrayList<TopicSetBaseInfo> topicSetBaseInfos = topicSetService.queryStudentTopicSet(accountInfo);
        return new CommonResult(200, "查询成功!", topicSetBaseInfos);
    }

    @PostMapping("/queryStudentTopicSetX")
    @ApiModelProperty("查询")
    public CommonResult queryStudentTopicSetX(@RequestBody TopicSetInfo topicSetInfo)
    {
        TopicSetSpecific topicSetSpecific = topicSetService.queryStudentTopicSetX(topicSetInfo);
        return new CommonResult(200, "查询成功!", topicSetSpecific);
    }
}