package com.qf.dao;

import com.qf.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IRoleDao {

    @Select("select * from role")
    public List<Role> findAll();
}
