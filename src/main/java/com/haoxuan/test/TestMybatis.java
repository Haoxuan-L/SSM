package com.haoxuan.test;

import com.haoxuan.dao.UserDao;
import com.haoxuan.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


public class TestMybatis extends BaseTest {

    @Autowired
    UserDao userDao;

    @Test
    public void testMybqtis(){
        List<User> list = new ArrayList<User>();
        list = userDao.findAll();
        for(User user : list){
            System.out.println(user);
        }
    }
}
