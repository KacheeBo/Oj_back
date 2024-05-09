package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:30
 * describe:
 */
public class TeacherInfo implements Serializable
{
    private Integer teacherId;
    private String teacherName;
    private Integer unitId;
    private Integer accountId;

    public TeacherInfo()
    {
    }

    public TeacherInfo(Integer teacherId, String teacherName, Integer unitId, Integer accountId)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.unitId = unitId;
        this.accountId = accountId;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public Integer getUnitId()
    {
        return unitId;
    }

    public void setUnitId(Integer unitId)
    {
        this.unitId = unitId;
    }

    public Integer getAccountId()
    {
        return accountId;
    }

    public void setAccountId(Integer accountId)
    {
        this.accountId = accountId;
    }

    @Override
    public String toString()
    {
        return "TeacherInfo{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", unitId=" + unitId +
                ", accountId=" + accountId +
                '}';
    }
}