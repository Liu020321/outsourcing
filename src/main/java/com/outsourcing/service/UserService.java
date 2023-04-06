package com.outsourcing.service;

import com.outsourcing.pojo.User;

import java.util.List;

public interface UserService {


    User login(String userName,String password);

    boolean register(User user);
}
