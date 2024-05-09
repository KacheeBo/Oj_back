package cn.jsu.oj.pojo.net;

import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.parsing.pack.PackType;

import java.util.Arrays;

/**
 * @author: suixuexue
 * @date: 2020/11/8 17:12
 * describe:
 * 判题结果
 */
@PackType(typeNo = 8)
public class JudgeResult extends Pack
{

    @ColumnProperty(type = ColumnType.LONG)
    private long serialNumber;//流水号

    @ColumnProperty(type = ColumnType.STRING)
    private String compilationInformation;//编译信息

    @ColumnProperty(type = ColumnType.STRINGI)
    private int[] runTime;//运行时间(ms)

    @ColumnProperty(type = ColumnType.STRINGI)
    private int[] runMemory;//运行内存(kb)

    @ColumnProperty(type = ColumnType.STRINGI)
    private int[] pointResult;//测试点结果

    @ColumnProperty(type = ColumnType.STRING)
    private String ip;

    public JudgeResult()
    {
    }

    public JudgeResult(long serialNumber, String compilationInformation, int[] runTime, int[] runMemory, int[] pointResult, String ip)
    {
        this.serialNumber = serialNumber;
        this.compilationInformation = compilationInformation;
        this.runTime = runTime;
        this.runMemory = runMemory;
        this.pointResult = pointResult;
        this.ip = ip;
    }

    public long getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getCompilationInformation()
    {
        return compilationInformation;
    }

    public void setCompilationInformation(String compilationInformation)
    {
        this.compilationInformation = compilationInformation;
    }

    public int[] getRunTime()
    {
        return runTime;
    }

    public void setRunTime(int[] runTime)
    {
        this.runTime = runTime;
    }

    public int[] getRunMemory()
    {
        return runMemory;
    }

    public void setRunMemory(int[] runMemory)
    {
        this.runMemory = runMemory;
    }

    public int[] getPointResult()
    {
        return pointResult;
    }

    public void setPointResult(int[] pointResult)
    {
        this.pointResult = pointResult;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    @Override
    public String toString()
    {
        return "JudgeResult{" +
                "serialNumber=" + serialNumber +
                ", compilationInformation='" + compilationInformation + '\'' +
                ", runTime=" + Arrays.toString(runTime) +
                ", runMemory=" + Arrays.toString(runMemory) +
                ", pointResult=" + Arrays.toString(pointResult) +
                ", ip='" + ip + '\'' +
                '}';
    }
}