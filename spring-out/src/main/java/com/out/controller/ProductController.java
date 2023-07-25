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
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private viewResultMapper viewResultMapper;

    @GetMapping("/api/products")
    public String getProductsByPage1(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "7") int size) {
        int totalCount1 = viewResultMapper.getTotalCount1();
        int totalPages1 = (int) Math.ceil((double) totalCount1 / size);
        int offset = (page - 1) * size;

        List<viewResult> products1 = viewResultMapper.getProductsByPage1(offset, size);

        PageResult<viewResult> pageResult1 = new PageResult<>();
        pageResult1.setTotalPages(totalPages1);
        pageResult1.setRows(products1);

        return JSON.toJSONString(pageResult1);
    }
    @GetMapping("/api/products1")
    public String getProductsByPage2(@RequestParam(defaultValue = "1") int page,
                                    @RequestParam(defaultValue = "7") int size) {
        int totalCount2 = viewResultMapper.getTotalCount2();
        int totalPages2 = (int) Math.ceil((double) totalCount2 / size);
        int offset = (page - 1) * size;

        List<viewResult> products2 = viewResultMapper.getProductsByPage2(offset, size);

        PageResult<viewResult> pageResult2 = new PageResult<>();
        pageResult2.setTotalPages(totalPages2);
        pageResult2.setRows(products2);

        return JSON.toJSONString(pageResult2);
    }

    @PostMapping("/api/add")
    public String addViewResult(@RequestBody viewResult viewResult) {
        int result= viewResultMapper.addViewResult(viewResult);
        if (result == 1){
            return "success";
        }else {
            return "fail";
        }
    }
    @PostMapping("/api/add1")
    public String addViewOriginal(@RequestBody viewResult viewResult) {
        int result= viewResultMapper.addViewOriginal(viewResult);
        if (result == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping("/api/delete")
    @ResponseBody
    public String deleteViewResult(@RequestParam int id) {
        int result = viewResultMapper.deleteViewResult(id);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/api/delete1")
    @ResponseBody
    public String deleteOriginal(@RequestParam int id) {
        int result = viewResultMapper.deleteOriginal(id);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
    @RequestMapping("/api/search")
    public String search(@RequestParam String name) {
        List<viewResult> viewResults = viewResultMapper.searchViewResult(name);
        String jsonString = JSON.toJSONString(viewResults);
        return jsonString;
    }

    @RequestMapping("/api/search1")
    public String search1(@RequestParam String name) {
        List<viewResult> viewResults = viewResultMapper.searchOriginal(name);
        String jsonString = JSON.toJSONString(viewResults);
        return jsonString;
    }


}


