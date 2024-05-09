package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/26 22:18
 * describe:查询同一单位下的共享用户组的用户
 *
 */
public class QueryGroupUnitUserVO implements Serializable {

    private Integer studentId;
    private String studentName;
    private String studentNumber;

    public QueryGroupUnitUserVO() {
    }

    public QueryGroupUnitUserVO(Integer studentId, String studentName, String studentNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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
        return "QueryGroupUnitUserVO{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
