package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/25 10:22
 * describe:
 * 单位信息表
 */
public class UnitInfo implements Serializable {
    private Integer unitId;
    private String unitAbbreviation;
    private String unitSchool;
    private String unitCollege;
    private Integer unitTypeId;
    private String unitLogo;
    private String unitSName;
    private String unitRemarks;

    public UnitInfo() {
    }

    public UnitInfo(Integer unitId, String unitAbbreviation, String unitSchool, String unitCollege, Integer unitTypeId, String unitLogo, String unitSName, String unitRemarks) {
        this.unitId = unitId;
        this.unitAbbreviation = unitAbbreviation;
        this.unitSchool = unitSchool;
        this.unitCollege = unitCollege;
        this.unitTypeId = unitTypeId;
        this.unitLogo = unitLogo;
        this.unitSName = unitSName;
        this.unitRemarks = unitRemarks;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitAbbreviation() {
        return unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    public String getUnitSchool() {
        return unitSchool;
    }

    public void setUnitSchool(String unitSchool) {
        this.unitSchool = unitSchool;
    }

    public String getUnitCollege() {
        return unitCollege;
    }

    public void setUnitCollege(String unitCollege) {
        this.unitCollege = unitCollege;
    }

    public Integer getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Integer unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitLogo() {
        return unitLogo;
    }

    public void setUnitLogo(String unitLogo) {
        this.unitLogo = unitLogo;
    }

    public String getUnitSName() {
        return unitSName;
    }

    public void setUnitSName(String unitSName) {
        this.unitSName = unitSName;
    }

    public String getUnitRemarks() {
        return unitRemarks;
    }

    public void setUnitRemarks(String unitRemarks) {
        this.unitRemarks = unitRemarks;
    }

    @Override
    public String toString() {
        return "UnitInfo{" +
                "unitId=" + unitId +
                ", unitAbbreviation='" + unitAbbreviation + '\'' +
                ", unitSchool='" + unitSchool + '\'' +
                ", unitCollege='" + unitCollege + '\'' +
                ", unitTypeId=" + unitTypeId +
                ", unitLogo='" + unitLogo + '\'' +
                ", unitSName='" + unitSName + '\'' +
                ", unitRemarks='" + unitRemarks + '\'' +
                '}';
    }
}