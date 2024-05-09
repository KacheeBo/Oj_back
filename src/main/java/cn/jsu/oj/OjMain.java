//package cn.jsu.oj;
//
//import cn.jsu.oj.net.NettyServerApplication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @author: suixuexue
// * @date: 2020/12/17 11:35
// * describe:
// *  去除内置tomcat后的启动类
// */
//@EnableSwagger2
//@SpringBootApplication
//public class OjMain extends SpringBootServletInitializer implements CommandLineRunner
//{
//    @Autowired
//    private NettyServerApplication nettyServerApplication;
//
//    public static void main(String[] args)
//    {
//        SpringApplication.run(OjMain.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
//    {
//        return builder.sources(this.getClass());
//    }
//
//    @Override
//    public void run(String... args) throws Exception
//    {
//        nettyServerApplication.run();
//    }
//}
