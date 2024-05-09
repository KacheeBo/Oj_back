package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @Author: wws
 * @Date: 2020/12/26 17:36
 * describe:学生信息表
 */
public class StudentInfo implements Serializable {
    private Integer studentId;
    private String studentNumber;
    private String studentName;
    private String studentEmail;
    private Integer unitId;
    private Integer accountId;

    public StudentInfo() {
    }

    public StudentInfo(String studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public StudentInfo(Integer studentId, String studentNumber, String studentName, String studentEmail, Integer unitId, Integer accountId) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.unitId = unitId;
        this.accountId = accountId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", unitId=" + unitId +
                ", accountId=" + accountId +
                '}';
    }
}

