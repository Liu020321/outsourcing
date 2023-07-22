package com.out.dao;

import com.out.pojo.viewResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface viewResultMapper {
    List<viewResult> getProductsByPage(@Param("offset") int offset, @Param("pageSize") int pageSize);
    int getTotalCount();
}
