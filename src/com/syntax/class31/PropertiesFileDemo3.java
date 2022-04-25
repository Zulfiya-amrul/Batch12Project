package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

public class PropertiesFileDemo3 {
    public static void main(String[] args) throws IOException {

        String Path= "/Users/zulfiyaa/Desktop/batch12/Trump.properties";

        FileOutputStream fileOutputStream= new FileOutputStream(Path);

        Properties properties = new Properties();
        properties.put("isCrazy","False");
        properties.put("isRich", "True");
        properties.store(fileOutputStream, "added some new fields");






    }
}
