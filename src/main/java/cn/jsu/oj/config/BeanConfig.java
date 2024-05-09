package cn.jsu.oj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/25 11:23
 * describe:
 * 额外需要的bean注入
 */
@Configuration
public class BeanConfig
{

    @Bean
    public ConcurrentHashMap getRespond()
    {
        return new ConcurrentHashMap<Long, HttpServletResponse>();
    }
}
