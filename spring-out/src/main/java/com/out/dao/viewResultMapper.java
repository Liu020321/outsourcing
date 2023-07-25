package com.out.dao;

import com.out.pojo.viewResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface viewResultMapper {
    List<viewResult> getProductsByPage1(@Param("offset") int offset, @Param("pageSize") int pageSize);
    int getTotalCount1();

    List<viewResult> getProductsByPage2(@Param("offset") int offset, @Param("pageSize") int pageSize);
    int getTotalCount2();

    int addViewResult(viewResult viewResult);
    int addViewOriginal(viewResult viewResult);

    int deleteViewResult(int id);
    int deleteOriginal(int id);

    List<viewResult> searchViewResult(String name);
    List<viewResult> searchOriginal(String name);
}
