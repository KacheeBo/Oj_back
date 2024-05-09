package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/28 17:13
 * describe:查询用户组学生用户信息
 */
public class QueryGroupStudentRequestVO implements Serializable {
    private Integer userGroupId;
    private String queryInput;
    private String queryType;

    public QueryGroupStudentRequestVO() {
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getQueryInput() {
        return queryInput;
    }

    public void setQueryInput(String queryInput) {
        this.queryInput = queryInput;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public QueryGroupStudentRequestVO(Integer userGroupId, String queryInput, String queryType) {
        this.userGroupId = userGroupId;
        this.queryInput = queryInput;
        this.queryType = queryType;
    }

    @Override
    public String toString() {
        return "QueryGroupStudentRequestVO{" +
                "userGroupId=" + userGroupId +
                ", queryInput='" + queryInput + '\'' +
                ", queryType='" + queryType + '\'' +
                '}';
    }
}
