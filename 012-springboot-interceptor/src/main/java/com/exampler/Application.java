package com.exampler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Application.class, args);

        String a = (String) run.getBean("a");
        System.out.println(a);
    }

}
