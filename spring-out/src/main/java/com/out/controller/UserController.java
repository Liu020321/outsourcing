package com.out.controller;

import com.out.pojo.User;
import com.out.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    public String queryUser(@RequestBody User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        User user1 = userMapper.queryUser(userName, password);
        if (user1 != null) {
            return "success";
        } else {
            return "fail";
        }

    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        int flag = userMapper.addUser(user);
        if (flag == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        int flag = userMapper.updateUser(user);
        if (flag == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/deleteUserById")
    public String deleteUserById(int id) {
        int flag = userMapper.deleteUserById(id);
        if (flag == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
