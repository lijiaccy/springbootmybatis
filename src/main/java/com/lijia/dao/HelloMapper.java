package com.lijia.dao;

import com.lijia.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {

    @Select("select * from user where username = #{username}")
    public User findUserByName(String username);
}

//用xml,什么都不用加

//public interface HelloMapper {
//
//    public User findUserByName(String username);
//}