package com.outsourcing.mapper;

import com.outsourcing.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    /**
     * 查询所有用户信息
     *
     * @return
     */

    @Select("select * from tb_user where user_name=#{userName} and password=#{password} ")
    @ResultMap("userResultMap")
    User login(@Param("userName") String userName, @Param("password") String password);
}
