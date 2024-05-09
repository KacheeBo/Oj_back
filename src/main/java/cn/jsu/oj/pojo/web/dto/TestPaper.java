package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: suixuexue
 * @date: 2020/12/26 15:52
 * describe:
 */
public class TestPaper implements Serializable
{
    private Integer testId;
    private String testName;
    private String testShareCode;
    private Date testTime;
    private Integer teacherId;
    private Integer testLabelId;
    private Integer testFraction;
    private Integer testTopicNumber;
    private Integer testDifficulty;

    public TestPaper()
    {
    }

    public TestPaper(Integer testId, String testName, String testShareCode, Date testTime, Integer teacherId, Integer testLabelId, Integer testFraction, Integer testTopicNumber, Integer testDifficulty)
    {
        this.testId = testId;
        this.testName = testName;
        this.testShareCode = testShareCode;
        this.testTime = testTime;
        this.teacherId = teacherId;
        this.testLabelId = testLabelId;
        this.testFraction = testFraction;
        this.testTopicNumber = testTopicNumber;
        this.testDifficulty = testDifficulty;
    }

    public Integer getTestId()
    {
        return testId;
    }

    public void setTestId(Integer testId)
    {
        this.testId = testId;
    }

    public String getTestName()
    {
        return testName;
    }

    public void setTestName(String testName)
    {
        this.testName = testName;
    }

    public String getTestShareCode()
    {
        return testShareCode;
    }

    public void setTestShareCode(String testShareCode)
    {
        this.testShareCode = testShareCode;
    }

    public Date getTestTime()
    {
        return testTime;
    }

    public void setTestTime(Date testTime)
    {
        this.testTime = testTime;
    }

    public Integer getTeacherId()
    {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId)
    {
        this.teacherId = teacherId;
    }

    public Integer getTestLabelId()
    {
        return testLabelId;
    }

    public void setTestLabelId(Integer testLabelId)
    {
        this.testLabelId = testLabelId;
    }

    public Integer getTestFraction()
    {
        return testFraction;
    }

    public void setTestFraction(Integer testFraction)
    {
        this.testFraction = testFraction;
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

    @Override
    public String toString()
    {
        return "TestPaper{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", testShareCode='" + testShareCode + '\'' +
                ", testTime=" + testTime +
                ", teacherId=" + teacherId +
                ", testLabelId=" + testLabelId +
                ", testFraction=" + testFraction +
                ", testTopicNumber=" + testTopicNumber +
                ", testDifficulty=" + testDifficulty +
                '}';
    }
}