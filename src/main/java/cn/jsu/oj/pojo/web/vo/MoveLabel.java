package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/28 15:49
 * describe:
 */
public class MoveLabel implements Serializable
{
    private Integer testLabelId;
    private List<Integer> testId;

    public MoveLabel()
    {
    }

    public MoveLabel(Integer testLabelId, List<Integer> testId)
    {
        this.testLabelId = testLabelId;
        this.testId = testId;
    }

    public Integer getTestLabelId()
    {
        return testLabelId;
    }

    public void setTestLabelId(Integer testLabelId)
    {
        this.testLabelId = testLabelId;
    }

    public List<Integer> getTestId()
    {
        return testId;
    }

    public void setTestId(List<Integer> testId)
    {
        this.testId = testId;
    }

    @Override
    public String toString()
    {
        return "MoveLabel{" +
                "testLabelId=" + testLabelId +
                ", testId=" + testId +
                '}';
    }
}