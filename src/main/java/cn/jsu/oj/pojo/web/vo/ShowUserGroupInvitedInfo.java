package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
<<<<<<< HEAD
 *
=======
>>>>>>> 186ed85f7aaf0b34201271361cf1fb5ca99fc1ce
 * @Author: wws
 * @Date: 2020/12/26 17:00
 * describe:显示受邀用户信息
 */
public class ShowUserGroupInvitedInfo implements Serializable {
    private Integer inviteId;
    private String iHead;
    private String accountNickName;
    private String accountEmail;

    public ShowUserGroupInvitedInfo() {
    }

    public ShowUserGroupInvitedInfo(Integer inviteId, String iHead, String accountNickName, String accountEmail) {
        this.inviteId = inviteId;
        this.iHead = iHead;
        this.accountNickName = accountNickName;
        this.accountEmail = accountEmail;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    public String getiHead() {
        return iHead;
    }

    public void setiHead(String iHead) {
        this.iHead = iHead;
    }

    public String getAccountNickName() {
        return accountNickName;
    }

    public void setAccountNickName(String accountNickName) {
        this.accountNickName = accountNickName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    @Override
    public String toString() {
        return "ShowUserGroupInvitedInfo{" +
                "inviteId=" + inviteId +
                ", iHead='" + iHead + '\'' +
                ", accountNickName='" + accountNickName + '\'' +
                ", accountEmail='" + accountEmail + '\'' +
                '}';
    }
}
