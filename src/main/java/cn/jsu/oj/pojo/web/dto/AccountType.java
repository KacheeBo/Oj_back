package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author xiaxia
 * @title: AccountypeTypeinfo
 * @projectName oj
 * @description: TODO
 * @Version 1.0
 * @date 2021/1/514:41
 */
public class AccountType implements Serializable
{
    private Integer accountTypeId;
    private String accountTypeName;

    public AccountType()
    {
    }

    public AccountType(Integer accountTypeId, String accountTypeName)
    {
        this.accountTypeId = accountTypeId;
        this.accountTypeName = accountTypeName;
    }

    public Integer getAccountTypeId()
    {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId)
    {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName()
    {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName)
    {
        this.accountTypeName = accountTypeName;
    }

    @Override
    public String toString()
    {
        return "AccountypeTypeinfo{" +
                "accountTypeId=" + accountTypeId +
                ", accountTypeName='" + accountTypeName + '\'' +
                '}';
    }
}
