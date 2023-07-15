package com.qf.web.controller;

import com.qf.pojo.Role;
import com.qf.service.RoleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/word")
@RestController
public class WordController {

    @Resource
    private RoleServiceImpl roleServiceImpl;

    @RequestMapping("/findAll")
    public List<Role> findAll(){
        List<Role> roles = roleServiceImpl.findAll();
        return roles;
    }
}
