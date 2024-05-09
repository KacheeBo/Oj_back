package cn.jsu.oj.pojo.web.vo;

/**
 * @Author: wws
 * @Date: 2020/12/30 11:25
 * describe:
 */
public class StudentAuthenticationVO {
    private Integer accountId;
    private Integer unitId;
    private String userGroupBindCode;
    private String studentNumber;

    public StudentAuthenticationVO() {
    }

    public StudentAuthenticationVO(Integer accountId, Integer unitId, String userGroupBindCode, String studentNumber) {
        this.accountId = accountId;
        this.unitId = unitId;
        this.userGroupBindCode = userGroupBindCode;
        this.studentNumber = studentNumber;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUserGroupBindCode() {
        return userGroupBindCode;
    }

    public void setUserGroupBindCode(String userGroupBindCode) {
        this.userGroupBindCode = userGroupBindCode;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "StudentAuthenticationVO{" +
                "accountId=" + accountId +
                ", unitId=" + unitId +
                ", userGroupBindCode='" + userGroupBindCode + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }
}
