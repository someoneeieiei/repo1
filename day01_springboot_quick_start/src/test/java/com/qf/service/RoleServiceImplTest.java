package com.qf.service;

import com.qf.QuickStarterApplication;
import com.qf.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = QuickStarterApplication.class)
public class RoleServiceImplTest {

    @Resource
    private RoleServiceImpl roleService;

    @Test
    public void test01FindAll(){
        List<Role> roles = roleService.findAll();
        for (Role role : roles) {
            System.out.println(role);
        }
    }

}