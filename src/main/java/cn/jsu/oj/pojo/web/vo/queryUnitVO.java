package cn.jsu.oj.pojo.web.vo;
/**
 * @Author: wws
 * @Date: 2021/1/4 21:57
 * describe:
<<<<<<< HEAD
*/
public class queryUnitVO {
    private Integer unitId;
    private String unitAbbreviation;
    private String unitSchool;
    private String unitCollege;
    private String unitTypeName;
    private String unitLogo;
    private String unitSName;
    private String unitRemarks;

    public queryUnitVO() {
    }

    public queryUnitVO(Integer unitId, String unitAbbreviation, String unitSchool, String unitCollege, String unitTypeName, String unitLogo, String unitSName, String unitRemarks) {
        this.unitId = unitId;
        this.unitAbbreviation = unitAbbreviation;
        this.unitSchool = unitSchool;
        this.unitCollege = unitCollege;
        this.unitTypeName = unitTypeName;
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

    public String getUnitTypeName() {
        return unitTypeName;
    }

    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
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
        return "queryUnitVO{" +
                "unitId=" + unitId +
                ", unitAbbreviation='" + unitAbbreviation + '\'' +
                ", unitSchool='" + unitSchool + '\'' +
                ", unitCollege='" + unitCollege + '\'' +
                ", unitTypeName='" + unitTypeName + '\'' +
                ", unitLogo='" + unitLogo + '\'' +
                ", unitSName='" + unitSName + '\'' +
                ", unitRemarks='" + unitRemarks + '\'' +
                '}';
    }
}