package cn.jsu.oj.parsing.pack;


import cn.jsu.oj.parsing.colum.ColumnProperty;
import cn.jsu.oj.parsing.colum.ColumnType;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:39
 * describe:
 * 抽象类用于编码节码的主要业务逻辑的调控
 */
@Slf4j
public abstract class Pack
{

    /**
     * 使用final修饰属性，表示该属性一旦被初始化后便不可改变，对于基础类型来说其值是不可以改变的
     * 而对于对象属性来说其引用是不可再变的，其初始化可以在两个地方1.是定义处，2.是构造函数中，二选一
     */
    static final ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;//字节序，指定传递的字节数组为大端序
    final int packMaxSize = 31457280;//当前包的允许的最大长度

    /**
     * 获取包类型号，包类型号不允许重复，每一个实体类对应一个包的序列号，
     *
     * @return 返回值为short类型的序列号
     */
    public final short getTypeNo()
    {
        @SuppressWarnings("rawtypes")
        Class clazz = this.getClass();//通过反射获得当前这个对象的类对象
        @SuppressWarnings("unchecked")
        PackType packType = (PackType) clazz.getAnnotation(PackType.class);

        //System.out.println(packType);//包类型的打印
        //System.out.println(packType.typeNo());//包序列号的打印

        return packType.typeNo();
    }

    /**
     * 序列化，将包对象转化为字节数组
     * 序列化一共分为三步，首先对这个实体类上一个属性字段进行序列化
     * 第二步对整个实体类每个字段进行序列化
     * 第三步对整个实体类序列化后的内容添加整个字节数组的长度
     * 第四步对序列化后的包头添加包头唯一标识符
     */
    public byte[] serialize() throws Exception
    {
        ByteBuffer byteBuffer = ByteBuffer.allocate(packMaxSize);//分配指定大小的字节缓冲区，缓冲区在被创建时就分配内存，这块内存一直被重用
        byteBuffer.order(byteOrder);//指定序列化的字节序列是大端序

        /**
         * 添加额外信息之实体类的包头信息
         */
        byteBuffer.putShort(this.getTypeNo());//this对象指当前这个调用serialize方法的对象

        Field[] fields = this.getClass().getDeclaredFields();//获得某个类的所有声明的字段，即包括public、private和protected
        // ，但是不包括父类的申明字段。
        //通过这个foreach来对这个实体类上的每一个属性字段进行序列化
        for (Field field : fields)
        {
            field.setAccessible(true);
            ColumnProperty cp = field.getAnnotation(ColumnProperty.class);
            Object obj = field.get(this);
            try
            {
                final ColumnType type = cp.type();//通过反射加载属性字段的注解表明这个属性类型
                //调用实际的序列化方法，这里的序列化实际上是对属性字段上的内容进行序列化

                //System.out.println(type);

                type.serialize(byteBuffer, obj);
            }
            catch (Exception e)
            {
                throw new Exception("序列化异常" + field + " " + obj + " " + cp + " " + e, e);
            }
        }

        //对已经序列化好的字节数组添加额外的附加内容
        /**
         * 计算之前已经存放的大小往前面添加相应的内容
         * 这里的7表示jsu+int一共七个字节
         */
        byte[] result = new byte[byteBuffer.position() + 7];
        ByteBuffer nbf = ByteBuffer.allocate(4);
        nbf.order(byteOrder);
        nbf.putInt((result.length - 7));//包的长度(每个字段)+实体类包的TypeNo(short)+包长(int)
        /**
         *    Object src : 原数组
         *    int srcPos : 从元数据的起始位置开始
         * 　　Object dest : 目标数组
         * 　　int destPos : 目标数组的开始起始位置
         * 　　int length  : 要copy的数组的长度
         */
        System.arraycopy(nbf.array(), 0, result, 3, nbf.array().length);

        System.arraycopy(byteBuffer.array(), 0, result, 7, result.length - 7);

        /**
         * 存放头信息，直接将jsu转换成字节数组，存放到最开始的地方
         */
        ByteBuffer nnbf = ByteBuffer.allocate(4);
        nnbf.order(byteOrder);
        String jsu = "jsu";
        byte[] bs = jsu.toString().getBytes("UTF-8");
        nnbf.put(bs);
        System.arraycopy(bs, 0, result, 0, 3);

        return result;
    }

    /**
     * 反序列化将字节数组转化为包对象
     * 使用final修饰这个类的方法，说明这个方法提供的功能已经满足当前的要求，不需要进行扩展。并且也不允许任何
     * 从此类继承的类来重写这种方法，但是继承任可以继承这个方法，也就是说可以直接使用，在声明类中，一个final
     * 方法只被实现一次
     */
    public static final Pack
    deserialize(byte[] datas) throws Exception
    {
        ByteBuffer byteBuffer = ByteBuffer.wrap(datas);
        byteBuffer.order(byteOrder);
        return deserialize(byteBuffer);
    }

    public static final Pack
    deserialize(ByteBuffer byteBuffer) throws Exception
    {
        short typeNo = byteBuffer.getShort();//从byteBuffer中读取实体类的包号
        //System.out.println("\ntypeNo="+typeNo);//tyNo值的打印
        Class<?> clazz = PackAuthorize.getInstance().getTypeNoAndPackMap().get(typeNo);//获得单例中从ConCurrentHashMap中获得已注册的实体类,加载对应已注册的类对象
        //System.out.println("clazz"+clazz);//类对象的打印
        Pack pack = getPack(byteBuffer, clazz);
        return pack;
    }

    private static final Pack getPack(ByteBuffer byteBuffer, Class<?> clazz) throws Exception
    {
        Pack pack = (Pack) clazz.newInstance();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
        {
            field.setAccessible(true);//字段private修饰时isAccessible()得到的值是false,必须要改成true才可以访问
            ColumnProperty annotation = field.getAnnotation(ColumnProperty.class);
            try
            {
                final ColumnType type = annotation.type();//获得字段类型的枚举类型
                field.set(pack, type.deserialize(byteBuffer));//set值
            }
            catch (Exception e)
            {
                throw new Exception("序列化错误" + fields + " " + annotation + " " + e, e);
            }
        }
        return pack;
    }

}