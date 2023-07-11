package com.out.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {

    @GetMapping("/files")
    @ResponseBody
    public List<String> getFilesInFolder() {
        String folderPath = "/home/lht/Code/pycharm/outsourcing/PaddleSeg/contrib/MedicalSeg/inference_model/output/"; // 替换为指定的本地文件夹路径

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        List<String> fileList = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && !isExcluded(file)) {
                    fileList.add(file.getName());
                }
            }
        }

        return fileList;
    }

    private boolean isExcluded(File file) {
        String extension = FilenameUtils.getExtension(file.getName());
        return extension.equalsIgnoreCase("json") || extension.equalsIgnoreCase("pkl");
    }
}
