package cn.jsu.oj.parsing.pack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:39
 * describe:
 * 注解类，加在包之前用于唯一确定这个包的实体类
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface PackType
{

    /**
     * @return 实体类包的数字，用于唯一确定一个包
     */
    public short typeNo();

}