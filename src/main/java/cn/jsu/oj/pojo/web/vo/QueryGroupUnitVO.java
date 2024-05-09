package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 *
 * @Author: wws
 * @Date: 2020/12/26 21:00
 * describe: 查询同一单位下的共享用户组
 *
 */
public class QueryGroupUnitVO implements Serializable {
    private Integer userGroupId;
    private String userGroupName;

    public QueryGroupUnitVO() {
    }

    public QueryGroupUnitVO(Integer userGroupId, String userGroupName) {
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
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

    @Override
    public String toString() {
        return "QueryGroupUnitVO{" +
                "userGroupId=" + userGroupId +
                ", userGroupName='" + userGroupName + '\'' +
                '}';
    }
}
