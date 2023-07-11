package com.out.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api")
public class NiftiController {

    @GetMapping(value = "/nifti", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> getNiftiFile() throws IOException {
        String filePath = "/home/lht/Code/pycharm/outsourcing/PaddleSeg/contrib/MedicalSeg/inference_model/output/test.nii.gz"; // 替换为你NIfTI文件的路径
        Path path = Paths.get(filePath);
        byte[] fileContent = Files.readAllBytes(path);
        return ResponseEntity.ok().body(fileContent);
    }
}

