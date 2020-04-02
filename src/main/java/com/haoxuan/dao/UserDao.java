package com.haoxuan.dao;

import com.haoxuan.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User findById(Integer id);

    @Select(value = "select* from user")
    public List<User> findAll();
}
