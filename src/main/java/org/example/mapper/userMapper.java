package org.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface userMapper {

    @Select("select password from user where username=#{username}")
    String getPassword(String username);

}
