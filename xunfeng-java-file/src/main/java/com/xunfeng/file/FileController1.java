package com.xunfeng.file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileController1 {
    public void createFileDir(){
        List<String> strings = Files.readAllLines("D:/test1.xlsx");

    }
}
