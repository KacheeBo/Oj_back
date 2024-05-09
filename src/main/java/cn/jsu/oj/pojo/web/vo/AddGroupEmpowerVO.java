package cn.jsu.oj.pojo.web.vo;

import cn.jsu.oj.pojo.web.dto.UserGroupAuthority;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @Author: wws
 * @Date: 2020/12/28 16:17
 * describe:添加用户组授权信息
 *
 */
public class AddGroupEmpowerVO implements Serializable {
    private Integer userGroupId;
    private List<Integer> topicSetId;
    private UserGroupAuthority userGroupAuthority;

    public AddGroupEmpowerVO() {
    }

    public AddGroupEmpowerVO(Integer userGroupId, List<Integer> topicSetId, UserGroupAuthority userGroupAuthority) {
        this.userGroupId = userGroupId;
        this.topicSetId = topicSetId;
        this.userGroupAuthority = userGroupAuthority;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public List<Integer> getTopicSetId() {
        return topicSetId;
    }

    public void setTopicSetId(List<Integer> topicSetId) {
        this.topicSetId = topicSetId;
    }

    public UserGroupAuthority getUserGroupAuthority() {
        return userGroupAuthority;
    }

    public void setUserGroupAuthority(UserGroupAuthority userGroupAuthority) {
        this.userGroupAuthority = userGroupAuthority;
    }

    @Override
    public String toString() {
        return "AddGroupEmpowerVO{" +
                "userGroupId=" + userGroupId +
                ", topicSetId=" + topicSetId +
                ", userGroupAuthority=" + userGroupAuthority +
                '}';
    }
}
