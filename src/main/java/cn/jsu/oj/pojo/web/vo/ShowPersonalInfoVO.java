package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wws
 * @Date: 2020/12/29 19:29
 * describe:
 */
public class ShowPersonalInfoVO implements Serializable {
    private String accountEmail;
    private Integer iId;
    private String iHead;
    private String iSex;
    private Date iBirthday;
    private String iPhone;
    private String iName;
    private String iAddress;
    private Integer iPostCode;

    public ShowPersonalInfoVO() {
    }

    public ShowPersonalInfoVO(String accountEmail, Integer iId, String iHead, String iSex, Date iBirthday, String iPhone, String iName, String iAddress, Integer iPostCode) {
        this.accountEmail = accountEmail;
        this.iId = iId;
        this.iHead = iHead;
        this.iSex = iSex;
        this.iBirthday = iBirthday;
        this.iPhone = iPhone;
        this.iName = iName;
        this.iAddress = iAddress;
        this.iPostCode = iPostCode;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiHead() {
        return iHead;
    }

    public void setiHead(String iHead) {
        this.iHead = iHead;
    }

    public String getiSex() {
        return iSex;
    }

    public void setiSex(String iSex) {
        this.iSex = iSex;
    }

    public Date getiBirthday() {
        return iBirthday;
    }

    public void setiBirthday(Date iBirthday) {
        this.iBirthday = iBirthday;
    }

    public String getiPhone() {
        return iPhone;
    }

    public void setiPhone(String iPhone) {
        this.iPhone = iPhone;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getiAddress() {
        return iAddress;
    }

    public void setiAddress(String iAddress) {
        this.iAddress = iAddress;
    }

    public Integer getiPostCode() {
        return iPostCode;
    }

    public void setiPostCode(Integer iPostCode) {
        this.iPostCode = iPostCode;
    }

    @Override
    public String toString() {
        return "ShowPersonalInfoVO{" +
                "accountEmail='" + accountEmail + '\'' +
                ", iId=" + iId +
                ", iHead='" + iHead + '\'' +
                ", iSex='" + iSex + '\'' +
                ", iBirthday=" + iBirthday +
                ", iPhone='" + iPhone + '\'' +
                ", iName='" + iName + '\'' +
                ", iAddress='" + iAddress + '\'' +
                ", iPostCode=" + iPostCode +
                '}';
    }
}
