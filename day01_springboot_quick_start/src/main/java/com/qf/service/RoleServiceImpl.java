package com.qf.service;

import com.qf.dao.IRoleDao;
import com.qf.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl {

    @Resource
    private IRoleDao roleDao;

    public List<Role> findAll(){
        //TODO 未处理完毕
        List<Role> roles = roleDao.findAll();
        return roles;
    }
}
