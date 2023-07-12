package com.out.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class NiftiController {

    @GetMapping(value = "/api/nifti", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<InputStreamResource> getNiftiFile() throws IOException {
        // 读取 NIFTI.GZ 文件内容
        Resource resource = new ClassPathResource("D:\\21016\\Desktop\\outsourcing\\spring-out\\src\\main\\resources\\static\\nifti\\test.nii.gz");
        InputStream inputStream = resource.getInputStream();

        // 设置响应头信息
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=file.nii.gz");

        // 返回文件内容
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(new InputStreamResource(inputStream));
    }
}


