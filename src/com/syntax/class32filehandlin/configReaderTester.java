package com.syntax.class32filehandlin;

import java.io.IOException;

public class configReaderTester {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("url"));
    }
}
