package cn.jsu.oj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author: suixuexue
 * @date: 2020/12/18 17:07
 * describe:
 */
@CrossOrigin
@Configuration
public class SpringmvcConfig implements WebMvcConfigurer
{

    //@Bean
    //public Filter FilterConfig(){
    //    return new FilterConfig();
    //}

    // 设置setFilter类去
    //@Bean
    //public FilterRegistrationBean setFilter1() {
    //    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
    //    filterRegistrationBean.setFilter(FilterConfig());
    //    filterRegistrationBean.addUrlPatterns("/*");
    //    filterRegistrationBean.setOrder(1);   //order的数值越小，在所有的filter中优先级越高
    //    return filterRegistrationBean;
    //}

    /**
     * @Description: 拦截器配置
     * @Params:
     * @Return
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        // 注册拦截器对指定内容进行拦截
        // 指定拦截器要拦截的请求(支持*通配符)
        // 指定拦截器不需要拦截的请求(支持*通配符)
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/user/test")
                //.addPathPatterns("/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/verificationCode");
    }

    /**
     * @Description: 静态资源处理
     * @Params:
     * @Return
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        //registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /**
     * @Description: 视图跳转控制器
     * @Params:
     * @Return
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        //registry.addViewController("/").setViewName("/index");
    }

    /**
     * @Description: 跨域配置
     * @Params:
     * @Return
     */
    @Override
    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/**").
                //allowedOrigins("http://10.6.3.99:8080"). //允许跨域的域名，可以用*表示允许任何域名使用
                allowedOrigins("*"). //允许跨域的域名，可以用*表示允许任何域名使用
                allowedMethods("*"). //允许任何方法（post、get等）
                allowedHeaders("*"). //允许任何请求头
                allowCredentials(true). //带上cookie信息
                exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L); //maxAge(3600)表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
    }
}
