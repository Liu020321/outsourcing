package com.outsourcing.mapper;

import com.outsourcing.pojo.User;
import com.outsourcing.pojo.patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {


    /**
     * 查询所有用户信息
     *
     * @return
     */

    @Select("select * from tb_user where user_name=#{userName} and password=#{password} ")
    @ResultMap("userResultMap")
    User login(@Param("userName") String userName, @Param("password") String password);

    @Select("select * from tb_user where user_name = #{userName}")
    User selectByUserName(String userName);

    @Insert("insert into tb_user values(null,#{userName},#{password},#{status})")
    void add(User user);

    @Select("select * from patient where status=#{status}")
    List<patient> getPatientByStatus(String status);

    @Update("update patient set status where id=#{id}")
    boolean changeStatus(int id);

}



























