package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/25 21:04
 * describe:
 */
public class UserGroupBind implements Serializable
{
    private Integer bindId;
    private Integer userGroupId;
    private Integer studentId;

    public UserGroupBind()
    {
    }

    public UserGroupBind(Integer userGroupId, Integer studentId) {
        this.userGroupId = userGroupId;
        this.studentId = studentId;
    }

    public UserGroupBind(Integer bindId, Integer userGroupId, Integer studentId) {
        this.bindId = bindId;
        this.userGroupId = userGroupId;
        this.studentId = studentId;
    }

    public Integer getBindId() {
        return bindId;
    }

    public void setBindId(Integer bindId) {
        this.bindId = bindId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "UserGroupBind{" +
                "bindId=" + bindId +
                ", userGroupId=" + userGroupId +
                ", studentId=" + studentId +
                '}';
    }
}