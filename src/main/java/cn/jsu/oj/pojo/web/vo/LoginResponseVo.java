package cn.jsu.oj.pojo.web.vo;

/**
 * @author xiaxia
 * @title: LoginResponseVo
 * @projectName oj
 * @description: TODO
 * @Version 1.0
 * @date 2021/1/516:39
 */
public class LoginResponseVo
{
    private Integer accountId;
    private String accountEmail;
    private String accountNickName;
    private Integer accountTypeId;
    private String token;
    private String accountTypeName;
    private Integer teacherId;
    private String teacherName;
    private String iHead;

    public LoginResponseVo()
    {
    }

    public LoginResponseVo(Integer accountId, String accountEmail, String accountNickName, Integer accountTypeId, String token, String accountTypeName, Integer teacherId, String teacherName, String iHead)
    {
        this.accountId = accountId;
        this.accountEmail = accountEmail;
        this.accountNickName = accountNickName;
        this.accountTypeId = accountTypeId;
        this.token = token;
        this.accountTypeName = accountTypeName;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.iHead = iHead;
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

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getAccountTypeName()
    {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName)
    {
        this.accountTypeName = accountTypeName;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public String getiHead()
    {
        return iHead;
    }

    public void setiHead(String iHead)
    {
        this.iHead = iHead;
    }

    @Override
    public String toString()
    {
        return "LoginResponseVo{" +
                "accountId=" + accountId +
                ", accountEmail='" + accountEmail + '\'' +
                ", accountNickName='" + accountNickName + '\'' +
                ", accountTypeId=" + accountTypeId +
                ", token='" + token + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", iHead='" + iHead + '\'' +
                '}';
    }
}
