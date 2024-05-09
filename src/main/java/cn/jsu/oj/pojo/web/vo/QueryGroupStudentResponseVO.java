package cn.jsu.oj.pojo.web.vo;

/**
<<<<<<< HEAD
 *
 * @Author: wws
 * @Date: 2020/12/28 17:18
 * describe:
 *
 */
public class QueryGroupStudentResponseVO {
    private Integer bindId;
    private String studentNumber;
    private String studentName;
    private String studentEmail;

    public QueryGroupStudentResponseVO(Integer bindId) {
        this.bindId = bindId;
    }

    public QueryGroupStudentResponseVO(Integer bindId, String studentNumber, String studentName, String studentEmail) {
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
        return "QueryGroupStudentResponseVO{" +
                "bindId=" + bindId +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
