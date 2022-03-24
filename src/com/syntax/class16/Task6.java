package com.syntax.class16;

import java.sql.SQLOutput;

public class Task6 {
    public static void main(String[] args) {

       String a= "This is confusing";
       String b = "This is hard";

    // append a and b

        a= a+b;
        b= a.substring(0, a.length()-b.length());
        a= a.substring(b.length());

        System.out.println(a);
        System.out.println(b);


    }
}
