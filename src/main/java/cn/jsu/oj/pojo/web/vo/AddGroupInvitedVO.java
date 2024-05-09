package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 *
 * @Author: wws
 * @Date: 2020/12/26 10:36
 * describe:
 *    接收 添加用户组受邀用户信息功能 参数
 */
public class AddGroupInvitedVO implements Serializable {
    private Integer userGroupId;
    private String emailValue;

    public AddGroupInvitedVO() {
    }

    public AddGroupInvitedVO(Integer userGroupId, String emailValue) {
        this.userGroupId = userGroupId;
        this.emailValue = emailValue;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    @Override
    public String toString() {
        return "AddGroupInvitedVO{" +
                "userGroupId=" + userGroupId +
                ", emailValue='" + emailValue + '\'' +
                '}';
    }
}
