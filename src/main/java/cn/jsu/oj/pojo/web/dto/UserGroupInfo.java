package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wws
 * @Date: 2020/12/25 15:46
 * describe:
 * 用户组信息表
 */
public class UserGroupInfo implements Serializable {

    private Integer userGroupId;
    private String userGroupName;
    private Boolean userGroupPermission;
    private Date userGroupTime;
    private String userGroupDescribe;
    private String userGroupBindCode;
    private Integer teacherId;
    private Integer unitId;
    private String userGroupShareCode;
    private Boolean userGroupRecycled;
    private Integer userGroupNum;

    public UserGroupInfo() {
    }

    public UserGroupInfo(Integer userGroupId, String userGroupName, Boolean userGroupPermission, Date userGroupTime, String userGroupDescribe, String userGroupBindCode, Integer teacherId, Integer unitId, String userGroupShareCode, Boolean userGroupRecycled, Integer userGroupNum) {
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
        this.userGroupPermission = userGroupPermission;
        this.userGroupTime = userGroupTime;
        this.userGroupDescribe = userGroupDescribe;
        this.userGroupBindCode = userGroupBindCode;
        this.teacherId = teacherId;
        this.unitId = unitId;
        this.userGroupShareCode = userGroupShareCode;
        this.userGroupRecycled = userGroupRecycled;
        this.userGroupNum = userGroupNum;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public Boolean getUserGroupPermission() {
        return userGroupPermission;
    }

    public void setUserGroupPermission(Boolean userGroupPermission) {
        this.userGroupPermission = userGroupPermission;
    }

    public Date getUserGroupTime() {
        return userGroupTime;
    }

    public void setUserGroupTime(Date userGroupTime) {
        this.userGroupTime = userGroupTime;
    }

    public String getUserGroupDescribe() {
        return userGroupDescribe;
    }

    public void setUserGroupDescribe(String userGroupDescribe) {
        this.userGroupDescribe = userGroupDescribe;
    }

    public String getUserGroupBindCode() {
        return userGroupBindCode;
    }

    public void setUserGroupBindCode(String userGroupBindCode) {
        this.userGroupBindCode = userGroupBindCode;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUserGroupShareCode() {
        return userGroupShareCode;
    }

    public void setUserGroupShareCode(String userGroupShareCode) {
        this.userGroupShareCode = userGroupShareCode;
    }

    public Boolean getUserGroupRecycled() {
        return userGroupRecycled;
    }

    public void setUserGroupRecycled(Boolean userGroupRecycled) {
        this.userGroupRecycled = userGroupRecycled;
    }

    public Integer getUserGroupNum() {
        return userGroupNum;
    }

    public void setUserGroupNum(Integer userGroupNum) {
        this.userGroupNum = userGroupNum;
    }

    @Override
    public String toString() {
        return "UserGroupInfo{" +
                "userGroupId=" + userGroupId +
                ", userGroupName='" + userGroupName + '\'' +
                ", userGroupPermission=" + userGroupPermission +
                ", userGroupTime=" + userGroupTime +
                ", userGroupDescribe='" + userGroupDescribe + '\'' +
                ", userGroupBindCode='" + userGroupBindCode + '\'' +
                ", teacherId=" + teacherId +
                ", unitId=" + unitId +
                ", userGroupShareCode='" + userGroupShareCode + '\'' +
                ", userGroupRecycled=" + userGroupRecycled +
                ", userGroupNum=" + userGroupNum +
                '}';
    }
}

