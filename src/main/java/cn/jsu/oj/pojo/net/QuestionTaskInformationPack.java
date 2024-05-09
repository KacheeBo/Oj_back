package cn.jsu.oj.pojo.net;

import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.parsing.pack.PackType;

import java.util.Arrays;

/**
 * @author: suixuexue
 * @date: 2020/11/11 11:06
 * describe:
 * 判题任务信息包装类，最全从任务调度服务器发送给判题机的判题任务
 */
@PackType(typeNo = 10)
public class QuestionTaskInformationPack extends Pack
{

    @ColumnProperty(type = ColumnType.BYTE)
    private byte languageType;//语言类型

    @ColumnProperty(type = ColumnType.BYTE)
    private byte judgeModel;//判题类型

    @ColumnProperty(type = ColumnType.INT)
    private int subjectID;//题目ID

    @ColumnProperty(type = ColumnType.LONG)
    private long serialNumber;//流水号

    @ColumnProperty(type = ColumnType.STRING)
    private String sourceCode;//源代码

    @ColumnProperty(type = ColumnType.INT)
    private int maxRunningTime;//最大运行时间

    @ColumnProperty(type = ColumnType.INT)
    private int maxRunningMemory;//最大运行内存kb

    @ColumnProperty(type = ColumnType.STRINGS)
    private String[] inPutTestCase;//输入测试用例

    @ColumnProperty(type = ColumnType.STRINGS)
    private String[] outPutTestCase;//输出测试用例

    public QuestionTaskInformationPack()
    {
    }

    public QuestionTaskInformationPack(byte languageType, byte judgeModel, int subjectID, long serialNumber, String sourceCode, int maxRunningTime, int maxRunningMemory, String[] inPutTestCase, String[] outPutTestCase)
    {
        this.languageType = languageType;
        this.judgeModel = judgeModel;
        this.subjectID = subjectID;
        this.serialNumber = serialNumber;
        this.sourceCode = sourceCode;
        this.maxRunningTime = maxRunningTime;
        this.maxRunningMemory = maxRunningMemory;
        this.inPutTestCase = inPutTestCase;
        this.outPutTestCase = outPutTestCase;
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

    public int getSubjectID()
    {
        return subjectID;
    }

    public void setSubjectID(int subjectID)
    {
        this.subjectID = subjectID;
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

    public String[] getInPutTestCase()
    {
        return inPutTestCase;
    }

    public void setInPutTestCase(String[] inPutTestCase)
    {
        this.inPutTestCase = inPutTestCase;
    }

    public String[] getOutPutTestCase()
    {
        return outPutTestCase;
    }

    public void setOutPutTestCase(String[] outPutTestCase)
    {
        this.outPutTestCase = outPutTestCase;
    }

    @Override
    public String toString()
    {
        return "QuestionTaskInformationPack{" +
                "languageType=" + languageType +
                ", judgeModel=" + judgeModel +
                ", subjectID=" + subjectID +
                ", serialNumber=" + serialNumber +
                ", sourceCode='" + sourceCode + '\'' +
                ", maxRunningTime=" + maxRunningTime +
                ", maxRunningMemory=" + maxRunningMemory +
                ", inPutTestCase=" + Arrays.toString(inPutTestCase) +
                ", outPutTestCase=" + Arrays.toString(outPutTestCase) +
                '}';
    }
}
