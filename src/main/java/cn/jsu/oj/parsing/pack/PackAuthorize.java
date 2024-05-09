package cn.jsu.oj.parsing.pack;

import cn.jsu.oj.pojo.net.*;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:39
 * describe:
 * 实体类包的注册，方便以后依靠这个类来寻找具体的某一个实体类
 * 包授权管理
 */
public class PackAuthorize
{

    /**
     * 存放实体类包的类型号和实体类的对应的关系
     * Class对象 泛型
     */
    private static final ConcurrentHashMap<Short, Class<?>> typeNoAndPackMap;

    static
    {
        typeNoAndPackMap = new ConcurrentHashMap<Short, Class<?>>();

        registerPack(
                CmdInformation.class,
                CmdInformationPack.class,
                JudgeResult.class,
                QuestionTaskInformation.class,
                QuestionTaskInformationPack.class
        );
    }

    private PackAuthorize()
    {
    }

    private static PackAuthorize instance;

    public static PackAuthorize getInstance()
    {
        if (instance == null)
        {
            synchronized (PackAuthorize.class)
            {
                if (instance == null)
                {
                    instance = new PackAuthorize();
                }
            }
        }
        return instance;
    }

    /**
     * 注册实体类通讯包使实体类通讯包和实体类包类型号相对应
     * 有多个参数需要注册
     */
    private static void registerPack(Class<?>... classes)
    {
        //遍历所有的已写入的参数
        for (Class<?> clazz : classes)
        {
            PackType packType = clazz.getAnnotation(PackType.class);
            //System.out.println(clazz+" "+packType.typeNo());
            typeNoAndPackMap.put(packType.typeNo(), clazz);
        }
    }

    public ConcurrentHashMap<Short, Class<?>> getTypeNoAndPackMap()
    {
        return typeNoAndPackMap;
    }
}