package cn.jsu.oj.controller;

import cn.jsu.oj.dao.UserGroupDao;
import cn.jsu.oj.pojo.web.dto.*;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.UserGroupService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/25 16:02
 * describe:
 * 关于用户组的所有操作
 */
@CrossOrigin
@RestController
@RequestMapping("/group")
public class UserGroupController {

    @Autowired
    UserGroupService userGroupService;


    @PostMapping("/createGroup")
    @ApiOperation("创建用户组")
    public CommonResult createUserGroup(@RequestBody UserGroupInfo userGroupInfo) {
        userGroupInfo.setUserGroupBindCode(Long.toHexString(System.currentTimeMillis()));
        userGroupInfo.setUserGroupShareCode(Long.toHexString(System.currentTimeMillis()));
        userGroupInfo.setUserGroupTime(new Date());
        Integer userGroup = userGroupService.createGroup(userGroupInfo);
        if (userGroup > 0) {
            return new CommonResult(200, "创建用户组成功!");
        } else {
            return new CommonResult(444, "创建用户组失败!");
        }
    }

    @PostMapping("/showGroupBasic")
    @ApiOperation("显示用户组基本信息")
    public CommonResult showGroupBasic(@RequestBody UserGroupInfo userGroupInfo) {
        List<UserGroupInfo> userGroupInfoList = userGroupService.showGroupBasic(userGroupInfo);
        return new CommonResult(200, "显示用户组基本信息", userGroupInfoList);
    }

    @PostMapping("/queryGroupById")
    @ApiOperation("查询当个用户组信息")
    public CommonResult queryGroupById(@RequestBody Integer userGroupId) {
        QueryGroupByIdVO queryGroupByIdVO = userGroupService.queryGroupById(userGroupId);
        return new CommonResult(200, "查询当个用户组信息", queryGroupByIdVO);
    }

    @PostMapping("/showGroupInvited")
    @ApiOperation("显示受邀用户信息")
    public CommonResult showGroupInvited(@RequestBody Integer userGroupId) {
        List<ShowUserGroupInvitedInfo> list = userGroupService.showGroupInvited(userGroupId);
        return new CommonResult(200, "显示受邀用户信息成功!", list);
    }

    @PostMapping("/showGroupStudent")
    @ApiOperation("显示学生用户信息")
    public CommonResult showGroupStudent(@RequestBody Integer userGroupId) {
        List<ShowGroupInvitedVO> list = userGroupService.showGroupStudent(userGroupId);
        return new CommonResult(200, "显示学生用户信息成功!", list);
    }

    @PostMapping("/showGroupEmpower")
    @ApiOperation("显示用户组授权信息")
    public CommonResult showGroupEmpower(@RequestBody Integer userGroupId) {
        List<UserGroupAuthority> userGroupAuthority = userGroupService.showGroupEmpower(userGroupId);
        return new CommonResult(200, "显示学生用户信息成功!", userGroupAuthority);
    }

    @PostMapping("/showGroupInvitedCode")
    @ApiOperation("显示用户组应邀做题信息")
    public CommonResult showGroupInvitedCode(@RequestBody Integer userGroupId) {
        List<UserGroupInviteCode> list = userGroupService.showGroupInvitedCode(userGroupId);
        return new CommonResult(200, "显示用户组应邀做题信息!", list);
    }

    /**
     * 该方法逻辑很怪，用户交互不友善，日后可以修改
     * @param addGroupInvitedVO
     * @return
     */
    @PostMapping("/addGroupInvited")
    @ApiOperation("添加用户组受邀用户信息")
    public CommonResult addGroupInvited(@RequestBody AddGroupInvitedVO addGroupInvitedVO) {
        Boolean aBoolean = userGroupService.addGroupInvited(addGroupInvitedVO);
        if (aBoolean) {
            return new CommonResult(200, "添加用户组受邀用户信息成功!");
        } else {
            return new CommonResult(444, "添加用户组受邀用户信息失败!");
        }
    }

    @PostMapping("/addGroupStudent")
    @ApiOperation("添加用户组学生用户信息")
    public CommonResult addGroupStudent(@RequestBody AddGroupStudentVO addGroupStudentVO) {
        Boolean aBoolean = userGroupService.addGroupStudent(addGroupStudentVO);
        if (aBoolean) {
            return new CommonResult(200, "添加用户组学生用户成功!");
        } else {
            return new CommonResult(444, "添加用户组学生用户失败!");
        }
    }

    @PostMapping("/addGroupEmpower")
    @ApiOperation("添加用户组授权信息")
    public CommonResult addGroupEmpower(@RequestBody AddGroupEmpowerVO addGroupEmpowerVO) {
        Boolean aBoolean = userGroupService.addGroupEmpower(addGroupEmpowerVO);
        if (aBoolean) {
            return new CommonResult(200, "添加用户组授权信息成功!");
        } else {
            return new CommonResult(444, "添加用户组授权信息失败!");
        }
    }

    @PostMapping("/showGroupTopicSet")
    @ApiOperation("显示用户组添加授权时选择的题目集信息")
    public CommonResult showGroupTopicSet(@RequestBody UserGroupInfo userGroupInfo) {
        List<ShowGroupTopicSetVO> list = userGroupService.showGroupTopicSet(userGroupInfo);
        return new CommonResult(444, "显示用户组添加授权时选择的题目集信息!", list);
    }

    @PostMapping("/addGroupInvitedCode")
    @ApiOperation("添加用户组应邀做题的邀请码")
    public CommonResult addGroupInvitedCode(@RequestBody UserGroupInviteCode userGroupInviteCode) {
        userGroupInviteCode.setInviteCodeContent(Long.toHexString(System.currentTimeMillis()));
        userGroupInviteCode.setInviteCodeTime(new Date());
        int i = userGroupService.addGroupInvitedCode(userGroupInviteCode);
        if (i > 0) {
            return new CommonResult(200, "添加用户组应邀做题的邀请码成功!");
        } else {
            return new CommonResult(444, "添加用户组应邀做题的邀请码失败!");
        }
    }

    @PostMapping("/queryGroupUnit")
    @ApiOperation("查询同一单位下的共享用户组")
    public CommonResult queryGroupUnit(@RequestBody Integer teacherId) {
        List<QueryGroupUnitVO> list = userGroupService.queryGroupUnit(teacherId);
        return new CommonResult(200, "查询用户组学生用户信息!", list);
    }

    @PostMapping("/queryGroupUnitUser")
    @ApiOperation("查询同一单位下的共享用户组的用户")
    public CommonResult queryGroupUnitUser(@RequestBody Integer userGroupId) {
        List<QueryGroupUnitUserVO> list = userGroupService.queryGroupUnitUser(userGroupId);
        return new CommonResult(200, "查询同一单位下的共享用户组的用户!", list);
    }

    @PostMapping("/exportGroupGrades")
    @ApiOperation("导出用户组成绩单")
    public CommonResult exportGroupGrades(@RequestBody Integer userGroupId) {
        return null;
    }

    @PostMapping("/deleteGroupStudent")
    @ApiOperation("删除用户组下的某个学生用户")
    public CommonResult deleteGroupStudent(@RequestBody UserGroupBind userGroupBind) {
        Integer i = userGroupService.deleteGroupStudent(userGroupBind);
        if (i > 0) {
            return new CommonResult(200, "删除成功!");
        } else {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/deleteGroupInvitedUser")
    @ApiOperation("删除用户组受邀用户")
    public CommonResult deleteGroupInvitedUser(@RequestBody UserGroupInvite userGroupInvite) {
        Integer i = userGroupService.deleteGroupInvitedUser(userGroupInvite);
        if (i > 0) {
            return new CommonResult(200, "删除成功!");
        } else {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/queryGroupStudent")
    @ApiOperation("查询用户组学生用户信息")
    public CommonResult queryGroupStudent(@RequestBody QueryGroupStudentRequestVO queryGroupStudentRequestVO) {
        List<QueryGroupStudentResponseVO> list = userGroupService.queryGroupStudent(queryGroupStudentRequestVO);
        return new CommonResult(200, "查询用户组学生用户信息成功!",list);
    }

    @PostMapping("/deleteGroupInvitedCode")
    @ApiOperation("删除用户组邀请码信息")
    public CommonResult deleteGroupInvitedCode(@RequestBody Integer inviteCodeId) {
        Integer i = userGroupService.deleteGroupInvitedCode(inviteCodeId);
        if (i > 0) {
            return new CommonResult(200, "删除成功!");
        } else {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/deleteGroupEmpower")
    @ApiOperation("删除用户组授权信息")
    public CommonResult deleteGroupEmpower(@RequestBody Integer authorityId) {
        Integer i = userGroupService.deleteGroupEmpower(authorityId);
        if (i > 0) {
            return new CommonResult(200, "删除用户组授权信息成功!");
        } else {
            return new CommonResult(444, "删除用户组授权信息失败!");
        }
    }

    @PostMapping("/removeGroup")
    @ApiOperation("将用户组移动到回收站")
    public CommonResult removeGroup(@RequestBody Integer[] userGroupId) {
        boolean b = userGroupService.removeGroup(userGroupId);

        if (b) {
            return new CommonResult(200, "将用户组移动到回收站成功!");
        } else {
            return new CommonResult(444, "将用户组移动到回收站失败!");
        }
    }

    @PostMapping("/recoverGroup")
    @ApiOperation("恢复用户组")
    public CommonResult recoverGroup(@RequestBody Integer[] userGroupId) {
        boolean b = userGroupService.recoverGroup(userGroupId);
        if (b) {
            return new CommonResult(200, "恢复用户组成功!");
        } else {
            return new CommonResult(444, "恢复用户组失败!");
        }
    }

    @PostMapping("/deleteGroup")
    @ApiOperation("彻底删除用户组")
    public CommonResult deleteGroup(@RequestBody Integer[] userGroupId) {
        Boolean b = userGroupService.deleteGroup(userGroupId);
        if (b) {
            return new CommonResult(200, "彻底删除用户组成功!");
        } else {
            return new CommonResult(444, "彻底删除用户组失败!");
        }
    }

    @PostMapping("/updateGroupBasic")
    @ApiOperation("修改用户组基本信息")
    public CommonResult updateGroupBasic(@RequestBody UserGroupInfo userGroupInfo) {
        Integer i = userGroupService.updateGroupBasic(userGroupInfo);
        if (i > 0) {
            return new CommonResult(200, "修改成功!");
        } else {
            return new CommonResult(444, "删除失败!");
        }
    }

    @PostMapping("/queryGroupBasic")
    @ApiOperation("查询用户组基本信息")
    public CommonResult queryGroupBasic(@RequestBody UserGroupInfo userGroupInfo) {
        List<UserGroupInfo> list = userGroupService.queryGroupBasic(userGroupInfo);
        return new CommonResult(200, "查询用户组基本信息!",list);
    }

    @PostMapping("/updateGroupEmpower")
    @ApiOperation("修改用户组权限信息")
    public CommonResult updateGroupEmpower(@RequestBody UserGroupAuthority userGroupAuthority) {
        Integer i = userGroupService.updateGroupEmpower(userGroupAuthority);
        if (i > 0) {
            return new CommonResult(200, "修改用户组权限信息成功!");
        } else {
            return new CommonResult(444, "修改用户组权限信息失败!");
        }
    }
}
