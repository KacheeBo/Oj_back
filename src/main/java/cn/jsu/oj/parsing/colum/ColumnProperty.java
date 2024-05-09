package cn.jsu.oj.parsing.colum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: suixuexue
 * @date: 2020/11/4 20:35
 * describe:
 * 注解类，用于注解表示实体类的属性的数据类型，作用于实体类的属性上，在运行时有效
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
public @interface ColumnProperty
{
    /**
     * @return 实体类属性的数据类型
     */
    public ColumnType type();

}