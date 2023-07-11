package com.out.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
@RequestMapping("/api")
public class CommandController {

    @GetMapping("/execute")
    public ResponseEntity<String> executeCommand() {
        try {
            String scriptPath = "/home/lht/Code/idea/outsourcing/spring-out/src/main/resources/soft.sh";

            ProcessBuilder processBuilder = new ProcessBuilder("/bin/sh", scriptPath);
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println(output.toString());
                return ResponseEntity.ok(output.toString());
            } else {
                return ResponseEntity.status(500).body("Command execution failed with exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            return ResponseEntity.status(500).body("Error executing command: " + e.getMessage());
        }
    }
}
