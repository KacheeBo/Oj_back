package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @Author: wws
 * @Date: 2020/12/31 16:58
 * describe:
 */
public class ShowBindInfoVO implements Serializable {
    private String unitSchool;
    private String unitCollege;
    private String unitLogo;
    private String studentName;
    private String studentNumber;

    public ShowBindInfoVO() {
    }

    public ShowBindInfoVO(String unitSchool, String unitCollege, String unitLogo, String studentName, String studentNumber) {
        this.unitSchool = unitSchool;
        this.unitCollege = unitCollege;
        this.unitLogo = unitLogo;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
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

    public String getUnitLogo() {
        return unitLogo;
    }

    public void setUnitLogo(String unitLogo) {
        this.unitLogo = unitLogo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "ShowBindInfoVO{" +
                "unitSchool='" + unitSchool + '\'' +
                ", unitCollege='" + unitCollege + '\'' +
                ", unitLogo='" + unitLogo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
