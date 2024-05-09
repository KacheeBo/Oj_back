package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2020/12/27 23:04
 * describe:
 */
public class TestLabel implements Serializable
{
    private Integer testLabelId;
    private String labelName;
    private Integer teacherId;

    public TestLabel()
    {
    }

    public TestLabel(Integer testLabelId, String labelName, Integer teacherId)
    {
        this.testLabelId = testLabelId;
        this.labelName = labelName;
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

    public String getLabelName()
    {
        return labelName;
    }

    public void setLabelName(String labelName)
    {
        this.labelName = labelName;
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
        return "TestLabel{" +
                "testLabelId=" + testLabelId +
                ", labelName='" + labelName + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}