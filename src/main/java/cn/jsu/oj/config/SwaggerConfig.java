package cn.jsu.oj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author: suixuexue
 * @date: 2020/12/17 11:04
 * describe:
 * Swagger的配置
 */
@Configuration
@EnableSwagger2  //开启Swagger
//http://localhost:8080/swagger-ui.html
public class SwaggerConfig
{

    //配置SwaggerBean的实例
    @Bean
    //获取项目环境
    public Docket getDocket(Environment environment)
    {
        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        //判断是否处在自己设定的环境
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)//是否启用Swagger
                .groupName("suixuexue")
                .select()
                //Request Handler Selectors，配置要扫描的接口的方式
                //basePackage:指定要扫描的包
                //any():扫描全部
                //none()都不扫描
                //withClassAnnotation：扫描类上的注解，参数是一个注解的反射对象
                //withMethodAnnotation：扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("cn.jsu.oj.controller"))
                //.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                //过滤什么路径
                //.paths(PathSelectors.ant("/suixuexue"))
                .build();
    }

    @Bean
    public Docket getDocket1(Environment environment)
    {
        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        //判断是否处在自己设定的环境
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)//是否启用Swagger
                .groupName("B")
                .select()
                //Request Handler Selectors，配置要扫描的接口的方式
                //basePackage:指定要扫描的包
                //any():扫描全部
                //none()都不扫描
                //withClassAnnotation：扫描类上的注解，参数是一个注解的反射对象
                //withMethodAnnotation：扫描方法上的注解
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                //过滤什么路径
                //.paths(PathSelectors.ant("/suixuexue"))
                .build();
    }

    //配置Swagger信息 apiInfo
    private ApiInfo apiInfo()
    {
        //作者信息
        Contact contact = new Contact("OJ", "OJ", "OJ");
        return new ApiInfo(
                "OJ Swagger Info",
                "OJ Web Api Info",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}
