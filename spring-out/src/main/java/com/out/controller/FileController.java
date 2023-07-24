package com.out.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class FileController {

    @RequestMapping("/redirect")
    @ResponseBody
    public String redirect(@RequestParam String imageId) {
        return "success";
    }

    @GetMapping("/files")
    @ResponseBody
    public List<String> getFilesInFolder() {
        String folderPath = "src\\main\\resources\\static\\Files\\Nifti";
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

    private static final String FILES_DIRECTORY = "/home/lht/Code/idea/outsourcing/spring-out/src/main/resources/static/Files/Nifti/";
    private static final String SECOND_DIRECTORY = "/home/lht/Code/pycharm/outsourcing/PaddleSeg/contrib/MedicalSeg/inference_model/submit/";

    @RequestMapping("/api/deleteFile")
    @ResponseBody
    public void deleteFiles(@RequestParam String fileName) {
        // Construct the full path of the file to be deleted
        String fullPath = FILES_DIRECTORY + fileName;

        // Here, implement the logic to delete the file using Java file handling
        // libraries
        // For example, you can use java.io.File or java.nio.file.Files to delete the
        // file
        // Remember to handle exceptions appropriately in a real-world application.
        // For this example, we'll just use the basic delete method of java.io.File.
        java.io.File fileToDelete = new java.io.File(fullPath);
        if (fileToDelete.exists()) {
            fileToDelete.delete();
        }

        // Construct the new file name with "_0000" suffix
        String newFileName = fileName.replace(".nii.gz", "") + "_0000.nii.gz";

        // Update the file path for the second file
        String secondFilePath = SECOND_DIRECTORY + newFileName;

        // Here, implement the logic to move/rename the second file using Java file
        // handling libraries
        // For example, you can use java.io.File or java.nio.file.Files to move/rename
        // the file
        // Remember to handle exceptions appropriately in a real-world application.
        // For this example, we'll just use the basic rename method of java.io.File.
        java.io.File secondFile = new java.io.File(secondFilePath);
        if (secondFile.exists()) {
            // Delete the second file
            secondFile.delete();
        }
    }
}
