package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyConditionalApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyConditionalApplication.class);
        Object user = context.getBean("createUser");
        System.out.println(user);
    }
}
