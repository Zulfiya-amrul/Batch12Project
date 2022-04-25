package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
        // inside property fiels we store username pass or configuration data
        // urls that we want to test, we store it all in properties files
        // inside the project we will have configuration or property files
        // property fiels store simple parameters as key value pairs


        //first step locating the file that we want to read
        String path = "/Users/zulfiyaa/Desktop/batch12/Config.properties";
        // navigating to that location
        FileInputStream fileInputStream = new FileInputStream(path);
        // that special class which knows how to read the .properties files
        Properties properties= new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));



    }
}
