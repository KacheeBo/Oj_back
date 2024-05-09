package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 *
 * @Author: wws
 * @Date: 2020/12/25 15:49
 * describe:
 * 用户组引用表
 */
public class UserGroupReference implements Serializable {
    private Integer referenceId;
    private Integer userGroupId;
    private Integer teacherId;

    public UserGroupReference() {
    }

    public UserGroupReference(Integer referenceId, Integer userGroupId, Integer teacherId) {
        this.referenceId = referenceId;
        this.userGroupId = userGroupId;
        this.teacherId = teacherId;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "UserGroupReference{" +
                "referenceId=" + referenceId +
                ", userGroupId=" + userGroupId +
                ", teacherId=" + teacherId +
                '}';
    }
}

