package cn.jsu.oj.pojo.web.vo;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2021/1/4 23:58
 * describe:
 */
public class PointResult implements Serializable
{
    private long SerialNumber;
    private String situationName;
    private Integer testPointNumber;
    private Integer judgePointScore;
    private Integer runTime;
    private Integer runMemory;

    public PointResult()
    {
    }

    public PointResult(long serialNumber, String situationName, Integer testPointNumber, Integer judgePointScore, Integer runTime, Integer runMemory)
    {
        SerialNumber = serialNumber;
        this.situationName = situationName;
        this.testPointNumber = testPointNumber;
        this.judgePointScore = judgePointScore;
        this.runTime = runTime;
        this.runMemory = runMemory;
    }

    public long getSerialNumber()
    {
        return SerialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        SerialNumber = serialNumber;
    }

    public String getSituationName()
    {
        return situationName;
    }

    public void setSituationName(String situationName)
    {
        this.situationName = situationName;
    }

    public Integer getTestPointNumber()
    {
        return testPointNumber;
    }

    public void setTestPointNumber(Integer testPointNumber)
    {
        this.testPointNumber = testPointNumber;
    }

    public Integer getJudgePointScore()
    {
        return judgePointScore;
    }

    public void setJudgePointScore(Integer judgePointScore)
    {
        this.judgePointScore = judgePointScore;
    }

    public Integer getRunTime()
    {
        return runTime;
    }

    public void setRunTime(Integer runTime)
    {
        this.runTime = runTime;
    }

    public Integer getRunMemory()
    {
        return runMemory;
    }

    public void setRunMemory(Integer runMemory)
    {
        this.runMemory = runMemory;
    }

    @Override
    public String toString()
    {
        return "PointResult{" +
                "SerialNumber=" + SerialNumber +
                ", situationName='" + situationName + '\'' +
                ", testPointNumber=" + testPointNumber +
                ", judgePointScore=" + judgePointScore +
                ", runTime=" + runTime +
                ", runMemory=" + runMemory +
                '}';
    }
}