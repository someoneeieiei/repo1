package com.qf.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
//@ResponseBody
//@Controller
@RestController
@ConfigurationProperties(prefix = "student")
public class HelloController {

    @Value("${uname}")
    private String username;

    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @RequestMapping("/sayHello")
    public String sayHello(){

        return "hello springboot!!! i am goodBoy --- >" + name + "----" +address +"------"+age;
    }
}
