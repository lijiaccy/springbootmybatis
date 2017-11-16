package com.lijia.service;

import com.lijia.bean.User;
import com.lijia.dao.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class HelloService {

    @Autowired
    private HelloMapper helloMapper;


    public User get(String username) {

        return  helloMapper.findUserByName(username);
    }
}
