package com.out.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {

    @RequestMapping("/redirect")
    @ResponseBody
    public String redirect(@RequestParam String imageId ) {
        return "success";
    }

    @GetMapping("/files")
    @ResponseBody
    public List<String> getFilesInFolder() {
        String folderPath = "/home/lht/Code/idea/outsourcing/spring-out/src/main/resources/static/nifti/";
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
