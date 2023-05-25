package com.out.controller;

import com.out.pojo.User;
import com.out.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUser")
    public String queryUser(String userName, String password) {
        int flag = userMapper.queryUser(userName, password);
        if (flag == 1) {
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
