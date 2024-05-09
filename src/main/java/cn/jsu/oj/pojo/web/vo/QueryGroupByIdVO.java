package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 *
 * @Author: wws
 * @Date: 2020/12/28 11:23
 * describe:
 *
 */
public class QueryGroupByIdVO implements Serializable {
    private Integer userGroupId;
    private String userGroupName;
    private String userGroupShareCode;
    private String userGroupBindCode;
    private String userGroupDescribe;

    public QueryGroupByIdVO() {
    }

    public QueryGroupByIdVO(Integer userGroupId, String userGroupName, String userGroupShareCode, String userGroupBindCode, String userGroupDescribe) {
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
        this.userGroupShareCode = userGroupShareCode;
        this.userGroupBindCode = userGroupBindCode;
        this.userGroupDescribe = userGroupDescribe;
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

    public String getUserGroupShareCode() {
        return userGroupShareCode;
    }

    public void setUserGroupShareCode(String userGroupShareCode) {
        this.userGroupShareCode = userGroupShareCode;
    }

    public String getUserGroupBindCode() {
        return userGroupBindCode;
    }

    public void setUserGroupBindCode(String userGroupBindCode) {
        this.userGroupBindCode = userGroupBindCode;
    }

    public String getUserGroupDescribe() {
        return userGroupDescribe;
    }

    public void setUserGroupDescribe(String userGroupDescribe) {
        this.userGroupDescribe = userGroupDescribe;
    }

    @Override
    public String toString() {
        return "QueryGroupByIdVO{" +
                "userGroupId=" + userGroupId +
                ", userGroupName='" + userGroupName + '\'' +
                ", userGroupShareCode='" + userGroupShareCode + '\'' +
                ", userGroupBindCode='" + userGroupBindCode + '\'' +
                ", userGroupDescribe='" + userGroupDescribe + '\'' +
                '}';
    }
}
