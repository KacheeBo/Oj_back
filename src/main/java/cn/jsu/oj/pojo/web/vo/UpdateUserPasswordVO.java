package cn.jsu.oj.pojo.web.vo;

/**
 * @Author: wws
 * @Date: 2020/12/29 17:14
 * describe:
 */
public class UpdateUserPasswordVO {
    private Integer accountId;
    private String accountPassword;
    private String checkAccountPassword;
    private String oldPassword;

    public UpdateUserPasswordVO() {
    }

    public UpdateUserPasswordVO(Integer accountId, String accountPassword, String checkAccountPassword, String oldPassword) {
        this.accountId = accountId;
        this.accountPassword = accountPassword;
        this.checkAccountPassword = checkAccountPassword;
        this.oldPassword = oldPassword;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getCheckAccountPassword() {
        return checkAccountPassword;
    }

    public void setCheckAccountPassword(String checkAccountPassword) {
        this.checkAccountPassword = checkAccountPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    @Override
    public String toString() {
        return "UpdateUserPasswordVO{" +
                "accountId=" + accountId +
                ", accountPassword='" + accountPassword + '\'' +
                ", checkAccountPassword='" + checkAccountPassword + '\'' +
                ", oldPassword='" + oldPassword + '\'' +
                '}';
    }
}
