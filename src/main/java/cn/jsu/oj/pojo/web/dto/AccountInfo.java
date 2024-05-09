package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @Author: wws
 * @Date: 2020/12/29 16:17
 * describe:
 */
public class AccountInfo implements Serializable
{
    private Integer accountId;
    private String  accountEmail;
    private String  accountPassWord;
    private String  accountNickName;
    private Integer accountTypeId;

    public AccountInfo()
    {
    }

    public AccountInfo(Integer accountId, String accountEmail, String accountPassWord, String accountNickName, Integer accountTypeId)
    {
        this.accountId = accountId;
        this.accountEmail = accountEmail;
        this.accountPassWord = accountPassWord;
        this.accountNickName = accountNickName;
        this.accountTypeId = accountTypeId;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    public String getAccountEmail()
    {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail)
    {
        this.accountEmail = accountEmail;
    }

    public String getAccountPassWord()
    {
        return accountPassWord;
    }

    public void setAccountPassWord(String accountPassWord)
    {
        this.accountPassWord = accountPassWord;
    }

    public String getAccountNickName()
    {
        return accountNickName;
    }

    public void setAccountNickName(String accountNickName)
    {
        this.accountNickName = accountNickName;
    }

    public Integer getAccountTypeId()
    {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId)
    {
        this.accountTypeId = accountTypeId;
    }

    @Override
    public String toString()
    {
        return "AccountInfo{" +
                "accountId=" + accountId +
                ", accountEmail='" + accountEmail + '\'' +
                ", accountPassWord='" + accountPassWord + '\'' +
                ", accountNickName='" + accountNickName + '\'' +

                ", accountTypeId=" + accountTypeId +
                '}';
    }
}
