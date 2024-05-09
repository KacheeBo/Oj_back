package cn.jsu.oj.net.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author: suixuexue
 * @date: 2020/12/17 11:45
 * describe:
 */
public class OutBoundHandler extends MessageToByteEncoder<Object>
{
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception
    {
        byte[] data = (byte[]) o;
        //for (byte datum : data) {
        //    System.out.print(datum+" ");
        //}
        //System.out.println();
        byteBuf.writeBytes((byte[]) o);
    }
}
