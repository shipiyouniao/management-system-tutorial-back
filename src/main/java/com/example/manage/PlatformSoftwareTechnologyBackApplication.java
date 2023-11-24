package com.example.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.manage.mapper")
public class PlatformSoftwareTechnologyBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformSoftwareTechnologyBackApplication.class, args);
    }

}
