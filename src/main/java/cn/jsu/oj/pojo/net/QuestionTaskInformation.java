package cn.jsu.oj.pojo.net;

import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.parsing.pack.PackType;

/**
 * @author: suixuexue
 * @date: 2020/11/4 21:04
 * describe:
 * 判题任务信息实体类，最全的判题任务，这是教师端第一次提交题目时做的题目
 */
@PackType(typeNo = 11)
public class QuestionTaskInformation extends Pack
{

    @ColumnProperty(type = ColumnType.BOOLEAN)
    private boolean taskPriority;//是否是优先任务

    @ColumnProperty(type = ColumnType.BYTE)
    private byte languageType;//语言类型

    @ColumnProperty(type = ColumnType.BYTE)
    private byte judgeModel;//判题模式

    @ColumnProperty(type = ColumnType.STRING)
    private String subjectId;//题目id

    @ColumnProperty(type = ColumnType.LONG)
    private long serialNumber;//流水号

    @ColumnProperty(type = ColumnType.STRING)
    private String sourceCode;//源代码

    @ColumnProperty(type = ColumnType.INT)
    private int taskWeight;//任务权值

    @ColumnProperty(type = ColumnType.INT)
    private int maxRunningTime;//最大运行时间

    @ColumnProperty(type = ColumnType.INT)
    private int maxRunningMemory;//最大运行内存kb

    public QuestionTaskInformation()
    {
    }

    public QuestionTaskInformation(boolean taskPriority, byte languageType, byte judgeModel, String subjectId, long serialNumber, String sourceCode, int taskWeight, int maxRunningTime, int maxRunningMemory)
    {
        this.taskPriority = taskPriority;
        this.languageType = languageType;
        this.judgeModel = judgeModel;
        this.subjectId = subjectId;
        this.serialNumber = serialNumber;
        this.sourceCode = sourceCode;
        this.taskWeight = taskWeight;
        this.maxRunningTime = maxRunningTime;
        this.maxRunningMemory = maxRunningMemory;
    }

    public boolean isTaskPriority()
    {
        return taskPriority;
    }

    public void setTaskPriority(boolean taskPriority)
    {
        this.taskPriority = taskPriority;
    }

    public byte getLanguageType()
    {
        return languageType;
    }

    public void setLanguageType(byte languageType)
    {
        this.languageType = languageType;
    }

    public byte getJudgeModel()
    {
        return judgeModel;
    }

    public void setJudgeModel(byte judgeModel)
    {
        this.judgeModel = judgeModel;
    }

    public String getSubjectId()
    {
        return subjectId;
    }

    public void setSubjectId(String subjectId)
    {
        this.subjectId = subjectId;
    }

    public long getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getSourceCode()
    {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode)
    {
        this.sourceCode = sourceCode;
    }

    public int getTaskWeight()
    {
        return taskWeight;
    }

    public void setTaskWeight(int taskWeight)
    {
        this.taskWeight = taskWeight;
    }

    public int getMaxRunningTime()
    {
        return maxRunningTime;
    }

    public void setMaxRunningTime(int maxRunningTime)
    {
        this.maxRunningTime = maxRunningTime;
    }

    public int getMaxRunningMemory()
    {
        return maxRunningMemory;
    }

    public void setMaxRunningMemory(int maxRunningMemory)
    {
        this.maxRunningMemory = maxRunningMemory;
    }

    @Override
    public String toString()
    {
        return "QuestionTaskInformation{" +
                "taskPriority=" + taskPriority +
                ", languageType=" + languageType +
                ", judgeModel=" + judgeModel +
                ", subjectId='" + subjectId + '\'' +
                ", serialNumber=" + serialNumber +
                ", sourceCode='" + sourceCode + '\'' +
                ", taskWeight=" + taskWeight +
                ", maxRunningTime=" + maxRunningTime +
                ", maxRunningMemory=" + maxRunningMemory +
                '}';
    }
}