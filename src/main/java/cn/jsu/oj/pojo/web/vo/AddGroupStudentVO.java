package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.StudentInfo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @Author: wws
 * @Date: 2020/12/27 15:56
 * describe:
 *
 */
public class AddGroupStudentVO implements Serializable {
    private Integer userGroupId;
    private List<StudentInfo> selectUserInfo;
    private String userInfo;

    public AddGroupStudentVO() {
    }

    public AddGroupStudentVO(Integer userGroupId, List<StudentInfo> selectUserInfo, String userInfo) {
        this.userGroupId = userGroupId;
        this.selectUserInfo = selectUserInfo;
        this.userInfo = userInfo;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public List<StudentInfo> getSelectUserInfo() {
        return selectUserInfo;
    }

    public void setSelectUserInfo(List<StudentInfo> selectUserInfo) {
        this.selectUserInfo = selectUserInfo;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "AddGroupStudentVO{" +
                "userGroupId=" + userGroupId +
                ", selectUserInfo=" + selectUserInfo +
                ", userInfo='" + userInfo + '\'' +
                '}';
    }
}

