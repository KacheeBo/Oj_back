package cn.jsu.oj.pojo.web.vo;

/**
 * @Author: wws
 * @Date: 2020/12/30 17:32
 * describe:
 */
public class ShowUnitTeacherVO {
    private String teacherName;
    private String accountEmail;

    public ShowUnitTeacherVO(String teacherName) {
        this.teacherName = teacherName;
    }

    public ShowUnitTeacherVO(String teacherName, String accountEmail) {
        this.teacherName = teacherName;
        this.accountEmail = accountEmail;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    @Override
    public String toString() {
        return "ShowUnitTeacherVO{" +
                "teacherName='" + teacherName + '\'' +
                ", accountEmail='" + accountEmail + '\'' +
                '}';
    }
}
