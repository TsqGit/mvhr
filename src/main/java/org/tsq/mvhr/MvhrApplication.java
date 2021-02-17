package org.tsq.mvhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.tsq.mvhr.mapper")
public class MvhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvhrApplication.class, args);
    }
}
