package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: wws
 * @Date: 2020/12/29 10:07
 * describe:账号信息
 */
public class UserInfo implements Serializable
{
    Integer iId;
    byte[] iHead;
    String iSex;
    Date iBirthday;
    String iPhone;
    String iName;
    String iAddress;
    Integer iPostCode;
    Integer accountId;

    public UserInfo()
    {
    }

    public UserInfo(Integer iId, byte[] iHead, String iSex, Date iBirthday, String iPhone, String iName, String iAddress, Integer iPostCode, Integer accountId)
    {
        this.iId = iId;
        this.iHead = iHead;
        this.iSex = iSex;
        this.iBirthday = iBirthday;
        this.iPhone = iPhone;
        this.iName = iName;
        this.iAddress = iAddress;
        this.iPostCode = iPostCode;
        this.accountId = accountId;
    }

    public Integer getiId()
    {
        return iId;
    }

    public void setiId(Integer iId)
    {
        this.iId = iId;
    }

    public byte[] getiHead()
    {
        return iHead;
    }

    public void setiHead(byte[] iHead)
    {
        this.iHead = iHead;
    }

    public String getiSex()
    {
        return iSex;
    }

    public void setiSex(String iSex)
    {
        this.iSex = iSex;
    }

    public Date getiBirthday()
    {
        return iBirthday;
    }

    public void setiBirthday(Date iBirthday)
    {
        this.iBirthday = iBirthday;
    }

    public String getiPhone()
    {
        return iPhone;
    }

    public void setiPhone(String iPhone)
    {
        this.iPhone = iPhone;
    }

    public String getiName()
    {
        return iName;
    }

    public void setiName(String iName)
    {
        this.iName = iName;
    }

    public String getiAddress()
    {
        return iAddress;
    }

    public void setiAddress(String iAddress)
    {
        this.iAddress = iAddress;
    }

    public Integer getiPostCode()
    {
        return iPostCode;
    }

    public void setiPostCode(Integer iPostCode)
    {
        this.iPostCode = iPostCode;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    @Override
    public String toString()
    {
        return "UserInfo{" +
                "iId=" + iId +
                ", iHead=" + Arrays.toString(iHead) +
                ", iSex='" + iSex + '\'' +
                ", iBirthday=" + iBirthday +
                ", iPhone='" + iPhone + '\'' +
                ", iName='" + iName + '\'' +
                ", iAddress='" + iAddress + '\'' +
                ", iPostCode=" + iPostCode +
                ", accountId=" + accountId +
                '}';
    }
}
