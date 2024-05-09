//package cn.jsu.oj.config;
//
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.unit.DataSize;
//
//import javax.servlet.MultipartConfigElement;
//
///**
// * @author: suixuexue
// * @date: 2020/12/29 17:39
// * describe:
// */
//
//@Configuration
//public class UploadConfig
//{
//    @Bean
//    public MultipartConfigElement multipartConfigElement()
//    {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //单个文件最大
//        factory.setMaxFileSize(DataSize.parse("80MB")); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize(DataSize.parse("100MB"));
//        return factory.createMultipartConfig();
//    }
//}