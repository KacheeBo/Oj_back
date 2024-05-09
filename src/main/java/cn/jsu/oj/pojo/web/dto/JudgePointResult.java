package cn.jsu.oj.pojo.web.dto;

import java.io.Serializable;

/**
 * @author: suixuexue
 * @date: 2021/1/4 22:47
 * describe:
 */
public class JudgePointResult implements Serializable
{
    private long judgePointId;
    private long SerialNumber;
    private Integer testPointNumber;
    private Integer situationId;
    private Integer judgePointScore;
    private Integer runTime;
    private Integer runMemory;

    public JudgePointResult()
    {
    }

    public JudgePointResult(long judgePointId, long serialNumber, Integer testPointNumber, Integer situationId, Integer judgePointScore, Integer runTime, Integer runMemory)
    {
        this.judgePointId = judgePointId;
        SerialNumber = serialNumber;
        this.testPointNumber = testPointNumber;
        this.situationId = situationId;
        this.judgePointScore = judgePointScore;
        this.runTime = runTime;
        this.runMemory = runMemory;
    }

    public long getJudgePointId()
    {
        return judgePointId;
    }

    public void setJudgePointId(long judgePointId)
    {
        this.judgePointId = judgePointId;
    }

    public long getSerialNumber()
    {
        return SerialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        SerialNumber = serialNumber;
    }

    public Integer getTestPointNumber()
    {
        return testPointNumber;
    }

    public void setTestPointNumber(Integer testPointNumber)
    {
        this.testPointNumber = testPointNumber;
    }

    public Integer getSituationId()
    {
        return situationId;
    }

    public void setSituationId(Integer situationId)
    {
        this.situationId = situationId;
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
        return "JudgePointResult{" +
                "judgePointId=" + judgePointId +
                ", SerialNumber=" + SerialNumber +
                ", testPointNumber=" + testPointNumber +
                ", situationId=" + situationId +
                ", judgePointScore=" + judgePointScore +
                ", runTime=" + runTime +
                ", runMemory=" + runMemory +
                '}';
    }
}