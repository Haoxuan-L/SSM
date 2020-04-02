package com.haoxuan.controller;

import com.haoxuan.entity.User;
import com.haoxuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public String user(@PathVariable("id") Integer id){
        User user = new User();
        user=userService.findById(id);
        System.out.println(user);
        return "index";
    }

}
