package com.syntax.class16;

public class Recap {
    public static void main(String[] args) {

       String str = "This is my #0345685967 Tarik";
        System.out.println(str.charAt(0)); // it does include the spaces as a character
        System.out.println(str.charAt(3));
        System.out.println(str.length());
    // if you always want to get the last character no matter the size of the string
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.indexOf('A')); // case sensitive doesnt recoginize this letter
        System.out.println(str.indexOf('a')); // it recognizes the first character
        System.out.println(str.lastIndexOf('a')); // how to get the last index value
        // ch is the implementation of the parameter

        // using substring method
        System.out.println(str.indexOf("#"));
        System.out.println(str.substring(12,23));
        System.out.println(str.substring(str.indexOf("#")+1, str.indexOf("#")+1+11));



        //System.out.println(str.substring(str.indexOf("#")+1), str.indexOf("#")+1+11));
// using this method we call all till last character



    }
}
