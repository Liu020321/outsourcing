package com.out.controller;

import com.alibaba.fastjson.JSON;
import com.out.dao.viewResultMapper;
import com.out.pojo.PageResult;
import com.out.pojo.viewResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private viewResultMapper viewResultMapper;

    @GetMapping("/api/products")
    public String getProductsByPage(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "7") int size) {
        int totalCount = viewResultMapper.getTotalCount();
        int totalPages = (int) Math.ceil((double) totalCount / size);
        int offset = (page - 1) * size;

        List<viewResult> products = viewResultMapper.getProductsByPage(offset, size);

        PageResult<viewResult> pageResult = new PageResult<>();
        pageResult.setTotalPages(totalPages);
        pageResult.setRows(products);

        return JSON.toJSONString(pageResult);
    }

}


