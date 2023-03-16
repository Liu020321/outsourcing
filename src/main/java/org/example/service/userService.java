package org.example.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.Util.SqlSessionFactoryUtil;
import org.example.mapper.userMapper;

public class userService {

    SqlSessionFactory sf= SqlSessionFactoryUtil.getSqlSessionFactory();


    public String getPassword(String username){
        SqlSession sqlSession=sf.openSession();

        userMapper us=sqlSession.getMapper(userMapper.class);

        String password=us.getPassword(username);

        sqlSession.close();

        return password;
    }
}
