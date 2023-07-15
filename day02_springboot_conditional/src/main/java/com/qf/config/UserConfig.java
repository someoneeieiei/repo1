package com.qf.config;

import com.qf.anno.MyConditional;
import com.qf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
//    @Conditional(MyConditionalClass.class)
    @MyConditional(value = "com.mysql.cj.jdbc.Driver")
    public User createUser(){
        return new User();
    }
}
