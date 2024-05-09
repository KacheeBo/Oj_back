package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/27 15:34
 * describe:
 */
public class TeacherBaseInfo implements Serializable
{
    private String teacherName;
    private String unitSchool;
    private Integer teacherId;

    public TeacherBaseInfo()
    {
    }

    public TeacherBaseInfo(String teacherName, String unitSchool, Integer teacherId)
    {
        this.teacherName = teacherName;
        this.unitSchool = unitSchool;
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

    public String getUnitSchool()
    {
        return unitSchool;
    }

    public void setUnitSchool(String unitSchool)
    {
        this.unitSchool = unitSchool;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    @Override
    public String toString()
    {
        return "TeacherBaseInfo{" +
                "teacherName='" + teacherName + '\'' +
                ", unitSchool='" + unitSchool + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
