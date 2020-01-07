package com.example.dream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dream.mapper")
public class DreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamApplication.class, args);
    }

}
