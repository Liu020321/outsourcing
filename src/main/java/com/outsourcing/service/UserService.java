package com.outsourcing.service;

import com.outsourcing.pojo.User;
import com.outsourcing.pojo.patient;

import java.util.List;

public interface UserService {


    User login(String userName,String password);

    boolean register(User user);

    List<patient> getPatientByStatus(String status);

    boolean changeStatus(int id);
}
