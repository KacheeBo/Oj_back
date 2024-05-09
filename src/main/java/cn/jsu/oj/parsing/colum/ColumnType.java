package cn.jsu.oj.parsing.colum;

import java.nio.ByteBuffer;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:36
 * describe:
 * 具体针对每一个不同类型的属性的序列化和反序列化的方法，不同类型的属性有着不同的序列化和反序列化的方法
 * byte、short、int、long、float、double、char、boolean、string、STRINGS、       STRINGI、                STRINGB
 * 字节数   1     2      4    8     4     8       2      1      加int  int+string[int+string]、int+int[]、int+byte[]
 */
public enum ColumnType
{

    /**
     * 针对BYTE类型字段序列化的方法、没有所谓的大小端的概念
     */
    BYTE
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    byte n = (byte) obj;
                    bf.put(n);
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.get();
                }
            },

    SHORT
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    Number n = (Number) obj;
                    bf.putShort(n.shortValue());
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.getShort();
                }
            },

    INT
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    Number n = (Number) obj;
                    bf.putInt(n.intValue());
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.getInt();
                }
            },

    LONG
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    Number n = (Number) obj;
                    bf.putLong(n.longValue());
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.getLong();
                }
            },

    BOOLEAN
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    byte b = 0;
                    if ((boolean) obj)
                    {
                        b = 1;
                    }
                    bf.put(b);
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    byte b = bf.get();
                    boolean flag = false;
                    if (b == 1)
                    {
                        flag = true;
                    }
                    return flag;
                }
            },

    FLOAT
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    Number n = (Number) obj;
                    bf.putFloat(n.floatValue());
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.getFloat();
                }
            },

    DOUBLE
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    Number n = (Number) obj;
                    bf.putDouble(n.doubleValue());
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    return bf.getDouble();
                }
            },

    STRING
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    if (obj != null)
                    {//如果这个字段不等于null，表示这个字段是有值的
                        byte[] bs = obj.toString().getBytes("UTF-8");
                        //这里需要注意，如果获得的字节数组长度超过int那么将是灾难性的情况，因为肯定放不下
                        //接踵而起的是放不下的内容将会怎么办？后续一系列的内容都将会出现很大的问题
                        bf.putInt((int) bs.length);
                        bf.put(bs);
                    }
                    else
                    {//如果这个字段等于null，不对这个进行处理那么就会报空指针异常，对于指定字段为null的属性来说，
                        // 不需要直接对这个字段进行字节数组的转换只需要直接将这个为null的长度放在指定的位置
                        bf.putInt((int) 0);
                    }
                }

                @Override
                public String deserialize(ByteBuffer bf) throws Exception
                {
                    String s;
                    int len = bf.getInt();//这是这个字符串的总长度
                    //如果这个长度大于0，表示这个字符串是有长度的
                    if (len > 0)
                    {
                        byte[] bytes = new byte[len];
                        bf.get(bytes);
                        s = new String(bytes, "UTF-8");
                    }
                    else
                    {//如果长度小于0表示这个字符串是没有值的
                        s = null;
                    }

                    return s;
                }
            },

    STRINGS
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    if (obj != null)
                    {
                        String[] strings = (String[]) obj;
                        int length = strings.length;
                        bf.putInt((int) length);

                        for (String string : strings)
                        {
                            byte[] bs = string.toString().getBytes("UTF-8");
                            bf.putInt((int) bs.length);
                            bf.put(bs);
                        }
                    }
                    else
                    {
                        bf.putInt((int) 0);
                    }
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    int anInt = bf.getInt();
                    String[] strings = null;
                    if (anInt != 0)
                    {
                        strings = new String[anInt];
                        for (int i = 0; i < anInt; i++)
                        {
                            int anInt1 = bf.getInt();
                            byte[] bytes = new byte[anInt1];
                            bf.get(bytes);
                            strings[i] = new String(bytes, "UTF-8");
                        }
                    }
                    return strings;
                }
            },

    /**
     * 这是序列化int类型的数组，那么传递过来的就是一个int类型的数组，本质就是
     */
    STRINGI
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    if (obj != null)
                    {
                        int[] ints = (int[]) obj;
                        int length = ints.length;
                        Number n = (Number) length;
                        bf.putInt(n.intValue());
                        for (int anInt : ints)
                        {
                            Number n1 = (Number) anInt;
                            bf.putInt(n1.intValue());
                        }
                    }
                    else
                    {
                        bf.putInt((int) 0);
                    }
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    int anInt = bf.getInt();
                    int[] ints = null;
                    if (anInt != 0)
                    {
                        ints = new int[anInt];
                        for (int i = 0; i < anInt; i++)
                        {
                            ints[i] = bf.getInt();
                        }
                    }
                    return ints;
                }
            },

    /**
     * 序列化byte数组
     */
    STRINGB
            {
                @Override
                public void serialize(ByteBuffer bf, Object obj) throws Exception
                {
                    if (obj != null)
                    {
                        byte[] bytes = (byte[]) obj;
                        int length = bytes.length;
                        Number n = (Number) length;
                        bf.putInt(n.byteValue());
                        for (byte aByte : bytes)
                        {
                            bf.put(aByte);
                        }
                    }
                    else
                    {
                        bf.putInt((int) 0);
                    }
                }

                @Override
                public Object deserialize(ByteBuffer bf) throws Exception
                {
                    int anInt = bf.getInt();
                    byte[] bytes = null;
                    if (anInt != 0)
                    {
                        bytes = new byte[anInt];
                        for (int i = 0; i < anInt; i++)
                        {
                            bytes[i] = bf.get();
                        }
                    }
                    return bytes;
                }
            };

    public abstract void serialize(ByteBuffer bf, Object obj) throws Exception;

    public abstract Object deserialize(ByteBuffer bf) throws Exception;

}