package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @Author: wws
 * @Date: 2020/12/31 16:32
 * describe:
 */
public class InvitedMakeQuestionVO implements Serializable {
    private Integer accountId;
    private String inviteCodeContent;

    public InvitedMakeQuestionVO() {
    }

    public InvitedMakeQuestionVO(Integer accountId, String inviteCodeContent) {
        this.accountId = accountId;
        this.inviteCodeContent = inviteCodeContent;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getInviteCodeContent() {
        return inviteCodeContent;
    }

    public void setInviteCodeContent(String inviteCodeContent) {
        this.inviteCodeContent = inviteCodeContent;
    }

    @Override
    public String toString() {
        return "InvitedMakeQuestionVO{" +
                "accountId=" + accountId +
                ", inviteCodeContent='" + inviteCodeContent + '\'' +
                '}';
    }
}
