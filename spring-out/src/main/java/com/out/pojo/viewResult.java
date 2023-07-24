package com.out.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class viewResult {
    private int id;
    private String name;
    private String fileName;
    private String date;
    private String describe;
}
