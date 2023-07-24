package com.out.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.out.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

     User queryUser(String userName, String password);
     int addUser(User user);

}
