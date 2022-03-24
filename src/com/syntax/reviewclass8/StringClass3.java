package com.syntax.reviewclass8;

public class StringClass3 {
    public static void main(String[] args) {

        String batch= "Batch 12";
        String course= "sdet";
        if ("Batch 12".equals(batch)&& "SDET".equals(course)) {
            System.out.println("you will get the link to my lecture");
        }
        else {
            System.out.println("watch my youtube channel");
        }

        if ("Batch 12".equalsIgnoreCase(batch)&& "SDET".equalsIgnoreCase(course)){
            System.out.println("now all type of inputs are accepted");
        }
        String company = "         Syntax     Tech        ";
        System.out.println(company.trim()); // only removed the empty spaces in beginning of the string

        String name = "super duper long longest name in the world";
        System.out.println(name.replaceAll(" ", ""));
    }
}
