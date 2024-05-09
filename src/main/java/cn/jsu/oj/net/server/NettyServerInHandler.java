package cn.jsu.oj.net.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:43
 * describe:
 * 服务端的主要业务逻辑
 */
public class NettyServerInHandler extends ChannelInboundHandlerAdapter
{
    private static final int HLENGTH = 10;//这是心跳包的序列化数组的长度long+short
    private static final int BLENGTH = 10;//基本信息；两个int+short
    private static final int ALENGTH = 4;//任务申请两个字节short + short
    private static final int AUTYPENO = 23;//核数的包类型号
    private static final int APTYPENO = 21;//核数的包类型号
    private ConcurrentHashMap<String, Channel> mapC;
    private LinkedBlockingQueue<Object> queueIn;

    public NettyServerInHandler(ConcurrentHashMap<String, Channel> mapC, LinkedBlockingQueue<Object> queueIn)
    {
        this.mapC = mapC;
        this.queueIn = queueIn;
    }

    /**
     * 每一个客户端与本地服务器建立连接的时候将客户端对应的IP地址作为K对应的通道Channel作为V存放到map当中
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception
    {
        addMap(ctx);
        ctx.fireChannelActive();//如果没有这句，读事件将不会触发
    }

    /**
     * 向map中添加K对应的V，K---->IP或者是IPP，V---->Channel,如果是其他的下位机，例如结果写回服务器的下位机，就不需要为这个下位机添加相应的映射队列
     * 如果不是额外的下位机，继续其他的业务逻辑的判断，这里的额外的服务器表示为结果写回服务器，结果写回服务器都需要在配置文件中写入，在这里将判断出是否是结果
     * 写回服务器，这里获得的仅仅只是ip地址，还没有获得端口号,如果不是心跳包信息，作为服务器就需要为建立连接的下位机添加一个对应的映射队列，判断指定的ip在
     * map中是否存在一旦存在就是额外的心跳通道，对于心跳通道需要使用ip+port来存放在map中，这里表示是第一次连接且不是结果写回服务器的连接，确定不是结果写
     * 回服务器，那么一定是判题机，就需要为对应的判题机创建,映射队列，创建映射队列并且唤醒任务分发的线程,如果map中不包含ip，就是说这个ip暂时不在查询的map中,
     * 则将这个ip存放在K中，如果在就将ip拼接为ip+port,表明这是一个心跳信息的通道，只要是心跳信息的通道全部加上端口号
     *
     * @param ctx 通过这个上下文获得相应的Channel
     */
    private void addMap(ChannelHandlerContext ctx)
    {
        Object[] ipAndPort = getIPAndPort(ctx);
        mapC.put((String) ipAndPort[0], ctx.channel());
    }

    /**
     * @Description: 通过这个方法从传递进来的参数中获得对应的ip地址以及端口号，并且保证ip地址存放在返回值位置为0的数组位置
     * @Params: ChannelHandler 和ChannelPipeline 之间的关联。
     * @Return ip地址以String形式，端口号也以String的形式存放，端口号存在位置为1的数组中
     */
    public Object[] getIPAndPort(ChannelHandlerContext ctx)
    {
        Object[] objects = new Object[2];
        InetSocketAddress inetSocketAddress = (InetSocketAddress) ctx.channel().remoteAddress();
        objects[0] = inetSocketAddress.getAddress().getHostAddress();//获取ip
        objects[1] = inetSocketAddress.getPort();//端口号
        return objects;
    }

    /**
     * 断开连接
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception
    {
        System.out.println("断开连接......");
    }

    /**
     * @Description: 当对应的通道接收到数据的时候就会触发这个函数，这里面会有一定的判断逻辑，因为对于部分数据类似于心跳信息、任务申请数据，
     * 这一类数据转化为字节数组之后的长度是固定的，当确定这一类信息的时候就可以交由对应的处理逻辑去处理相应的业务逻辑，将心跳信息传递给心跳
     * 需要处理的地方
     * @Params: 对应通道的上下文，从通道接收到的字节数组
     * @Return
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception
    {
        byte[] bytes = (byte[]) msg;
        queueIn.put(bytes);
    }

    /**
     * @Description: 向部分下位机发送的内容尾部追加字节数组，下位机发送的字节数组是不带下位机的ip的，在这里添加ip
     * 在这里添加ip的主要原因是因为下位机发送的ip如果不在同一网段那么就不能向指定的机器发送对应的确定存储信息，此外实
     * 体类最开始是按照a~z排序的，这里为了避免麻烦直接添加到最后的一个字段。
     * @Params: 下位机发送的字节数组的长度，对应这个通道的上下文，发送的字节数组
     * @Return 返回的内容为包含ip的字节数组
     */
    private byte[] addIpByte(int l, ChannelHandlerContext ctx, Object msg)
    {
        Object[] ipAndPort = getIPAndPort(ctx);
        byte[] bs = null;
        try
        {
            bs = ipAndPort[0].toString().getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        int length = bs.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(length + 4);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        byteBuffer.putInt(length);
        byteBuffer.put(bs);
        byte[] bytes = byteBuffer.array();

        ByteBuffer byteBuffer1 = ByteBuffer.allocate(l + length + 4);
        byteBuffer1.order(ByteOrder.BIG_ENDIAN);
        byteBuffer1.put((byte[]) msg);
        byteBuffer1.put(bytes);
        byte[] result = byteBuffer1.array();
        return result;
    }

    /**
     * 读完成事件处理
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception
    {

    }

    /**
     * 异常情况的处理，如果有一个连接断开，就需要跳到这个方法将map中对应这个IP的Channel以及对应的心跳信息取出，
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception
    {
        System.out.println("异常情况发生....，");
    }

}