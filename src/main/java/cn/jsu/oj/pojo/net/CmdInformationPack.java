package cn.jsu.oj.pojo.net;

import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import cn.jsu.oj.parsing.pack.Pack;
import cn.jsu.oj.parsing.pack.PackType;

/**
 * @author: suixuexue
 * @date: 2020/11/8 17:37
 * describe:
 * 封装了IP的指令信息
 */
@PackType(typeNo = 4)
public class CmdInformationPack extends Pack
{

    @ColumnProperty(type = ColumnType.STRING)
    private String ip;

    @ColumnProperty(type = ColumnType.BYTE)
    private byte cmdType;

    public CmdInformationPack()
    {
    }

    public CmdInformationPack(String ip, byte cmdType)
    {
        this.ip = ip;
        this.cmdType = cmdType;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
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
        return "CmdInformationPack{" +
                "ip='" + ip + '\'' +
                ", cmdType=" + cmdType +
                '}';
    }
}
