package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
@EnableTransactionManagement
public class QuickStarterApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(QuickStarterApplication.class);
        Object bean = context.getBean("helloController");
        System.out.println(bean);
        Object dataSource = context.getBean("dataSource");
        System.out.println(dataSource);
        //context.getBeansOfType(DataSource.class);
    }
}
