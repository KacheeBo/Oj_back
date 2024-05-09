package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/29 12:27
 * describe:
 */
public class InfoBase implements Serializable
{
    private Integer testTopicNumber;
    private Integer testDifficulty;
    private Integer testFraction;
    private String testName;
    private Date testTime;
    private String unitSchool;
    private String teacherName;

    public InfoBase()
    {
    }

    public InfoBase(Integer testTopicNumber, Integer testDifficulty, Integer testFraction, String testName, Date testTime, String unitSchool, String teacherName)
    {
        this.testTopicNumber = testTopicNumber;
        this.testDifficulty = testDifficulty;
        this.testFraction = testFraction;
        this.testName = testName;
        this.testTime = testTime;
        this.unitSchool = unitSchool;
        this.teacherName = teacherName;
    }

    public Integer getTestTopicNumber()
    {
        return testTopicNumber;
    }

    public void setTestTopicNumber(Integer testTopicNumber)
    {
        this.testTopicNumber = testTopicNumber;
    }

    public Integer getTestDifficulty()
    {
        return testDifficulty;
    }

    public void setTestDifficulty(Integer testDifficulty)
    {
        this.testDifficulty = testDifficulty;
    }

    public Integer getTestFraction()
    {
        return testFraction;
    }

    public void setTestFraction(Integer testFraction)
    {
        this.testFraction = testFraction;
    }

    public String getTestName()
    {
        return testName;
    }

    public void setTestName(String testName)
    {
        this.testName = testName;
    }

    public Date getTestTime()
    {
        return testTime;
    }

    public void setTestTime(Date testTime)
    {
        this.testTime = testTime;
    }

    public String getUnitSchool()
    {
        return unitSchool;
    }

    public void setUnitSchool(String unitSchool)
    {
        this.unitSchool = unitSchool;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    @Override
    public String toString()
    {
        return "InfoBase{" +
                "testTopicNumber=" + testTopicNumber +
                ", testDifficulty=" + testDifficulty +
                ", testFraction=" + testFraction +
                ", testName='" + testName + '\'' +
                ", testTime=" + testTime +
                ", unitSchool='" + unitSchool + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}