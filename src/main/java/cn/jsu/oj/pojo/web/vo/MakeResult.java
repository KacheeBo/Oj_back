package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2021/1/4 22:59
 * describe:
 */
public class MakeResult implements Serializable
{
    private Integer serialNumber;
    private String languageName;
    private String submitCode;
    private String compilationInfo;
    private List<PointResult> pointResults;
    private Date submitTime;
    private String accountNickName;

    public MakeResult()
    {
    }

    public MakeResult(Integer serialNumber, String languageName, String submitCode, String compilationInfo, List<PointResult> pointResults, Date submitTime, String accountNickName)
    {
        this.serialNumber = serialNumber;
        this.languageName = languageName;
        this.submitCode = submitCode;
        this.compilationInfo = compilationInfo;
        this.pointResults = pointResults;
        this.submitTime = submitTime;
        this.accountNickName = accountNickName;
    }

    public Integer getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getLanguageName()
    {
        return languageName;
    }

    public void setLanguageName(String languageName)
    {
        this.languageName = languageName;
    }

    public String getSubmitCode()
    {
        return submitCode;
    }

    public void setSubmitCode(String submitCode)
    {
        this.submitCode = submitCode;
    }

    public String getCompilationInfo()
    {
        return compilationInfo;
    }

    public void setCompilationInfo(String compilationInfo)
    {
        this.compilationInfo = compilationInfo;
    }

    public List<PointResult> getPointResults()
    {
        return pointResults;
    }

    public void setPointResults(List<PointResult> pointResults)
    {
        this.pointResults = pointResults;
    }

    public Date getSubmitTime()
    {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime)
    {
        this.submitTime = submitTime;
    }

    public String getAccountNickName()
    {
        return accountNickName;
    }

    public void setAccountNickName(String accountNickName)
    {
        this.accountNickName = accountNickName;
    }

    @Override
    public String toString()
    {
        return "MakeResult{" +
                "serialNumber=" + serialNumber +
                ", languageName='" + languageName + '\'' +
                ", submitCode='" + submitCode + '\'' +
                ", compilationInfo='" + compilationInfo + '\'' +
                ", pointResults=" + pointResults +
                ", submitTime=" + submitTime +
                ", accountNickName='" + accountNickName + '\'' +
                '}';
    }
}