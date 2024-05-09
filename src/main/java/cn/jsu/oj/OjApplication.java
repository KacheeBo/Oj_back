package cn.jsu.oj;

import cn.jsu.oj.net.NettyServerApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class OjApplication implements CommandLineRunner {

    @Autowired
    private NettyServerApplication nettyServerApplication;

    public static void main(String[] args) {
        SpringApplication.run(OjApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        nettyServerApplication.run();
    }
}
