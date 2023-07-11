package com.out.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/api/files")
public class FileUploadController {

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        // 检查文件是否为空
        if (file.isEmpty()) {
            return "上传文件不能为空";
        }

        try {
            // 获取文件名
            String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());

            // 设置目标文件夹路径
            String targetDirectory = "/home/lht/Code/pycharm/outsourcing/PaddleSeg/contrib/MedicalSeg/inference_model/submit/";

            // 生成新的文件名
            String newFilename = generateNewFilename(originalFilename);

            // 创建目标文件对象
            File targetFile = new File(targetDirectory + newFilename);

            // 复制文件到目标位置
            Path targetPath = targetFile.toPath();
            Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);

            return newFilename;
        } catch (IOException e) {
            e.printStackTrace();
            return "文件上传失败";
        }
    }

    // 生成新的文件名
    private String generateNewFilename(String originalFilename) {
        int dotIndex = originalFilename.indexOf(".");
        if (dotIndex != -1) {
            String nameWithoutExtension = originalFilename.substring(0, dotIndex); // 文件名（不包含扩展名）
            String extension = originalFilename.substring(dotIndex); // 扩展名

            // 在文件名和扩展名之间添加指定的文本
            String newFilename = nameWithoutExtension + "_0000" + extension;
            return newFilename;
        }
        return originalFilename + "_0000"; // 如果没有扩展名，则直接在文件名前添加指定的文本
    }
}

