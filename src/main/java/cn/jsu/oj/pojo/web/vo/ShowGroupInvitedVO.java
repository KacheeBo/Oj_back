package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/26 17:40
 * describe:
 *
 */
public class ShowGroupInvitedVO implements Serializable {
    private Integer bindId;
    private String studentNumber;
    private String studentName;
    private String studentEmail;

    public ShowGroupInvitedVO() {
    }

    public ShowGroupInvitedVO(Integer bindId, String studentNumber, String studentName, String studentEmail) {
        this.bindId = bindId;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Integer getBindId() {
        return bindId;
    }

    public void setBindId(Integer bindId) {
        this.bindId = bindId;
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

    @Override
    public String toString() {
        return "ShowGroupInvitedVO{" +
                "bindId=" + bindId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
