package cn.jsu.oj.net.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * @author: suixuexue
 * @date: 2020/12/17 11:45
 * describe:
 */
public class InBoundHandler extends ByteToMessageDecoder
{
    public static int BASE_LENGTH = 4 + 3;//最基本的长度保证最少有长度有内容如果没有默认是不合格的数据(这里设置为7表示最少有一个int有一个jsu)
    public static String HEAD_DATA = "jsu";//包头信息
    public static int count;
    //public static int sum;

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception
    {
        ByteBuffer bf = ByteBuffer.allocate(1024 * 4);//分配字节缓冲区
        //可读长度必须大于基本长度
        if (byteBuf.readableBytes() >= BASE_LENGTH)
        {
            // 防止socket字节流攻击,防止，客户端传来的数据过大,因为，太大的数据，是不合理的
            //if (byteBuf.readableBytes() > 2048) {
            //    byteBuf.skipBytes(byteBuf.readableBytes());
            //}

            // 记录包头开始的index
            int beginReader;
            while (true)
            {
                // 获取包头开始的index
                beginReader = byteBuf.readerIndex();
                // 标记包头开始的index
                byteBuf.markReaderIndex();

                byte[] result = new byte[3];
                byteBuf.readBytes(result);

                // 读到了协议的开始标志，结束while循环
                if (HEAD_DATA.equals(new String(result, "UTF-8")))
                {
                    break;
                }
                // 未读到包头，略过一个字节,每次略过，一个字节，去读取，包头信息的开始标记
                byteBuf.resetReaderIndex();
                byteBuf.readByte();
                // 当略过，一个字节之后，数据包的长度，又变得不满足,此时，应该结束。等待后面的数据到达
                if (byteBuf.readableBytes() < BASE_LENGTH)
                {
                    return;
                }
            }
            // 消息的长度
            int length = byteBuf.readInt();
            //if (length < byteBuf.readableBytes()){
            //    System.out.println("出现粘包情况，接收到的数据的长度大于当前一个对象的数据的长度");
            //}
            // 判断请求数据包数据是否到齐
            if (byteBuf.readableBytes() < length)
            {
                byteBuf.readerIndex(beginReader);// 还原读指针
                return;
            }
            // 读取data数据
            byte[] data = new byte[length];
            byteBuf.readBytes(data);
            System.out.println();
            for (byte datum : data)
            {
                System.out.print(datum + " ");
            }
            System.out.println();
            //System.out.println("InBound内容次数"+sum++);
            list.add(data);
        }
    }
}
