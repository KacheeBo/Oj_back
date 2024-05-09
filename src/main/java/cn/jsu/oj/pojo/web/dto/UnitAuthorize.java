package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wws
 * @Date: 2020/12/30 16:46
 * describe:
 */
public class UnitAuthorize implements Serializable {
    private Integer authorizeId;
    private String authorizeContent;
    private Date authorizeStartTime;
    private Date authorizeStopTime;
    private Integer unitId;

    public UnitAuthorize() {
    }

    public UnitAuthorize(Integer authorizeId, String authorizeContent, Date authorizeStartTime, Date authorizeStopTime, Integer unitId) {
        this.authorizeId = authorizeId;
        this.authorizeContent = authorizeContent;
        this.authorizeStartTime = authorizeStartTime;
        this.authorizeStopTime = authorizeStopTime;
        this.unitId = unitId;
    }

    public Integer getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(Integer authorizeId) {
        this.authorizeId = authorizeId;
    }

    public String getAuthorizeContent() {
        return authorizeContent;
    }

    public void setAuthorizeContent(String authorizeContent) {
        this.authorizeContent = authorizeContent;
    }

    public Date getAuthorizeStartTime() {
        return authorizeStartTime;
    }

    public void setAuthorizeStartTime(Date authorizeStartTime) {
        this.authorizeStartTime = authorizeStartTime;
    }

    public Date getAuthorizeStopTime() {
        return authorizeStopTime;
    }

    public void setAuthorizeStopTime(Date authorizeStopTime) {
        this.authorizeStopTime = authorizeStopTime;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    @Override
    public String toString() {
        return "UnitAuthorize{" +
                "authorizeId=" + authorizeId +
                ", authorizeContent='" + authorizeContent + '\'' +
                ", authorizeStartTime=" + authorizeStartTime +
                ", authorizeStopTime=" + authorizeStopTime +
                ", unitId=" + unitId +
                '}';
    }
}
