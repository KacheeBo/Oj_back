package cn.jsu.oj.pojo.net;

import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.parsing.pack.PackType;

/**
 * @author: suixuexue
 * @date: 2020/11/4 21:16
 * describe:
 * 指令信息
 * 1.关闭指令
 * 2.重启指令
 * 3.获取信息指令(这里的获取信息之获取服务器的状态信息)
 * 4.没有任务信息
 * 5.获取当前有多少台判题机正常运行
 * 6.当前暂存任务大队列已满
 */
@PackType(typeNo = 2)
public class CmdInformation extends Pack
{

    @ColumnProperty(type = ColumnType.BYTE)
    private byte cmdType;

    public CmdInformation()
    {
    }

    public CmdInformation(byte cmdType)
    {
        this.cmdType = cmdType;
    }

    public byte getCmdType()
    {
        return cmdType;
    }

    public void setCmdType(byte cmdType)
    {
        this.cmdType = cmdType;
    }

    @Override
    public String toString()
    {
        return "CmdInformation{" +
                "cmdType=" + cmdType +
                '}';
    }
}