package com.outsourcing.service.impl;

import com.outsourcing.mapper.UserMapper;
import com.outsourcing.pojo.User;
import com.outsourcing.service.UserService;
import com.outsourcing.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserServiceImpl implements UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    public User login(String userName, String password) {
        SqlSession sqlSession = factory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User userLogin = userMapper.login(userName, password);

        sqlSession.close();

        return userLogin;

    }

}
