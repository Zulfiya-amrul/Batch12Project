package com.syntax.class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class InclassTask {
    public static void main(String[] args) throws IOException {
        //browser=chrome
        //url=https://facebook.com
        //username
        //password
        String path = "/Users/zulfiyaa/Desktop/batch12/facebook.properties";


        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("browser", "chrome");
        properties.put("url", "https://facebook.com");
        properties.put("username", "User123");
        properties.put("password", "password456");
        properties.store(fileOutputStream,"facebook login info file");

    }
}
