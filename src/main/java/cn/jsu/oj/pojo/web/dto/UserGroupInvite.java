package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

public class UserGroupInvite implements Serializable {
    private Integer inviteId;
    private Integer userGroupId;
    private Integer accountId;

    public UserGroupInvite() {
    }

    public UserGroupInvite(Integer inviteId, Integer userGroupId, Integer accountId) {
        this.inviteId = inviteId;
        this.userGroupId = userGroupId;
        this.accountId = accountId;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "UserGroupInvite{" +
                "inviteId=" + inviteId +
                ", userGroupId=" + userGroupId +
                ", accountId=" + accountId +
                '}';
    }
}