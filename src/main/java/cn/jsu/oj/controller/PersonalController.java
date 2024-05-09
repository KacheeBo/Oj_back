package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.dto.AccountInfo;
import cn.jsu.oj.pojo.web.dto.StudentInfo;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.pojo.web.dto.UserInfo;
import cn.jsu.oj.pojo.web.vo.*;
import cn.jsu.oj.service.PersonalService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/28 21:45
 * describe:关于个人中心管理的所有操作
 */

@CrossOrigin
@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    PersonalService personalService;

    @PostMapping("/updateUserNickname")
    @ApiOperation("修改昵称")
    public CommonResult updateUserNickname(@RequestBody AccountInfo accountInfo) {
        Integer i = personalService.updateUserNickname(accountInfo);
        if (i > 0) {
            return new CommonResult(200, "修改昵称成功!");
        } else {
            return new CommonResult(444, "修改昵称失败!");
        }
    }

    @PostMapping("/updateUserEmail")
    @ApiOperation("修改邮箱")
    public CommonResult updateUserEmail(@RequestBody AccountInfo accountInfo) {
        Integer i = personalService.updateUserEmail(accountInfo);
        switch (i) {
            case 1:
                return new CommonResult(444, "该邮箱已被使用!");
            case 2:
                return new CommonResult(444, "密码输入错误!");
            case 3:
                return new CommonResult(200, "修改邮箱成功!");
            default:
                return new CommonResult(444, "修改邮箱失败!");
        }
    }

    @PostMapping("/updateUserPassword")
    @ApiOperation("修改密码")
    public CommonResult updateUserPassword(@RequestBody UpdateUserPasswordVO vo) {

        Integer i = personalService.updateUserPassword(vo);
        switch (i) {
            case 1:
                return new CommonResult(444, "两次输入密码错误!");
            case 2:
                return new CommonResult(444, "原密码输入错误!");
            case 3:
                return new CommonResult(200, "修改密码成功!");
            default:
                return new CommonResult(444, "修改密码失败!");
        }
    }

    @PostMapping("/invitedMakeQuestion")
    @ApiOperation("应邀做题")
    public CommonResult invitedMakeQuestion(@RequestBody InvitedMakeQuestionVO vo) {
        Integer i = personalService.invitedMakeQuestion(vo);
        switch (i) {
            case 1:
                return new CommonResult(444, "邀请码不存在!");
            case 2:
                return new CommonResult(444, "已存在该用户组!");
            case 3:
                return new CommonResult(200, "成功!");
            default:
                return new CommonResult(200, "失败!");
        }
    }

    @PostMapping("/showTeacherUnit")
    @ApiOperation("显示教师的单位信息")
    public CommonResult showTeacherUnit(@RequestBody Integer accountId) {
        UnitInfo unitInfo = personalService.showTeacherUnit(accountId);
        return new CommonResult(200, "成功!", unitInfo);
    }

    @PostMapping("/showPersonalInfo")
    @ApiOperation("显示个人信息")
    public CommonResult showPersonalInfo(@RequestBody Integer accountId) {
        ShowPersonalInfoVO ShowPersonalInfoVO = personalService.showPersonalInfo(accountId);
        return new CommonResult(200, "成功!", ShowPersonalInfoVO);
    }

    @PostMapping("/updatePersonalInfo")
    @ApiOperation("修改个人信息")
    public CommonResult updatePersonalInfo(@RequestBody UserInfo userInfo) {
        Integer i = personalService.updatePersonalInfo(userInfo);
        if (i > 0) {
            return new CommonResult(200, "修改个人信息成功!");
        } else {
            return new CommonResult(444, "修改个人信息失败!");
        }
    }

//    @PostMapping("/updatePersonalImg")
//    @ApiOperation("修改图像信息")
//    public CommonResult updatePersonalImg() {
//        Integer i = 0;
//        if (i>0) {
//            return new CommonResult(200, "修改个人信息成功!");
//        }else{
//            return new CommonResult(444, "修改个人信息失败!");
//        }
//    }

    @PostMapping("/showBindInfo")
    @ApiOperation("显示绑定信息")
    public CommonResult showBindInfo(@RequestBody Integer accountId) {
        List<UnitInfo> unitInfo = personalService.showBindInfo(accountId);

        return new CommonResult(200, "成功!", unitInfo);
    }

    @PostMapping("/studentAuthentication")
    @ApiOperation("学生认证")
    public CommonResult studentAuthentication(@RequestBody StudentAuthenticationVO vo) {
        Integer i = personalService.studentAuthentication(vo);
        switch (i){
            case 1:
                return new CommonResult(444, "绑定码不存在!");
            case 2:
                return new CommonResult(444, "学籍信息不存在!");
            case 3:
                return new CommonResult(444, "学生信息不在该用户组!");
            case 4:
                return new CommonResult(200, "学生认证成功!");
            default:
                return new CommonResult(444, "学生认证失败!");
        }
    }

    @PostMapping("/queryStudentName")
    @ApiOperation("查询学生认证时的学生姓名")
    public CommonResult queryStudentName(@RequestBody StudentInfo studentInfo) {
        String studentName = personalService.queryStudentName(studentInfo);
        if (null==studentName) {
            return new CommonResult(444, "不存在该学生!",studentName);
        }
        return new CommonResult(200, "成功!",studentName);
    }




}
