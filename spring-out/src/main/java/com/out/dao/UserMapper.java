package com.out.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.out.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

     int queryUser(String userName, String password);

    int addUser(User user);

    int updateUser(User user);

    int deleteUserById(int id);
}
