package com.haha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= "com.haha.dao")  //找到所有的dao接口
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
