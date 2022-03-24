package com.syntax.class16;

public class StringDemo1 {

    public static void main(String[] args) {
        String str = "Batch 12 is good";
        System.out.println(str.replace("good", "Great"));
        System.out.println(str.replace("o", "0"));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("12", "")); // removal
        System.out.println(str.replace("12", "13"));
    }
}
