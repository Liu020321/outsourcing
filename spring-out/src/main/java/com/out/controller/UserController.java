package com.out.controller;

import com.out.pojo.User;
import com.out.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public String queryUser(@RequestParam String userName, @RequestParam String password) {
        int user1 = userMapper.queryUser(userName, password).getId();
        if(user1 == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        int flag = userMapper.addUser(user);
        if (flag == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
