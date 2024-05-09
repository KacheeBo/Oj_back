package cn.jsu.oj.pojo.web.vo;

/**
 * @author xiaxia
 * @title: LoginVo
 * @projectName oj
 * @description: TODO
 * @Version 1.0
 * @date 2021/1/514:20
 */
public class LoginVo
{
    private String accountEmail;
    private String accountPassWord;
    private String code;
    private String data;

    public LoginVo()
    {
    }

    public LoginVo(String accountEmail, String accountPassWord, String code, String data)
    {
        this.accountEmail = accountEmail;
        this.accountPassWord = accountPassWord;
        this.code = code;
        this.data = data;
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

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "LoginVo{" +
                "accountEmail='" + accountEmail + '\'' +
                ", accountPassWord='" + accountPassWord + '\'' +
                ", code='" + code + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
