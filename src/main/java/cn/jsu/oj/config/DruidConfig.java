package cn.jsu.oj.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author: suixuexue
 * @date: 2020/12/17 11:26
 * describe:
 * Druid数据源的配置
 * 配置Druid监控管理后台的Servlet;
 * 内置Servlet容器时没有Web.xml文件所以使用SpringBoot的注册Servlet方式
 */
@Configuration
public class DruidConfig
{

    //配置ConfigurationProperties使得yml中能为相应的属性进行设值
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource DruidDataSource()
    {
        return new DruidDataSource();
    }

    //后台监控：web.xml ServletRegistrationBean
    //因为SpringBoot内置了servlet容器，所以没有web.xml替代方法ServletRegistrationBean
    //设置后台登录的权限
    @Bean
    public ServletRegistrationBean Registration()
    {
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //后台需要有人登录
        HashMap<String, String> initParameters = new HashMap<>();
        initParameters.put("resetEnable", "false");//禁用HTML页面上的"Rest All"功能
        initParameters.put("loginUsername", "SxxAdmin");
        initParameters.put("loginPassword", "Sxx123456");
        //后台允许谁可以访问
        //initParams.put("allow", "localhost")：表示只有本机可以访问
        //initParams.put("allow", "")：为空或者为null时，表示允许所有访问
        initParameters.put("allow", "127.0.0.1");
        //禁止谁能访问
        //initParameters.put("123","192.168.11.123");
        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    //filter
    @Bean
    public FilterRegistrationBean webStatFilter()
    {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //可以过滤那些请求？
        HashMap<Object, Object> hashMap = new HashMap<>();
        //这些东西不进行统计
        hashMap.put("exclusions", "*.js,*.css,/druid/*");
        return bean;
    }
}


