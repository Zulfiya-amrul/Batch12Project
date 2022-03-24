package com.syntax.class16;

public class StringDemo2 {
    public static void main(String[] args) {

        String str= "12345610!#$#%#&asdnkaASGJSXU";
        System.out.println(str.replaceAll("[0-9]", "")); // java removes the values replacement is empty
        System.out.println(str.replaceAll("[a-z]", ""));
        System.out.println(str.replaceAll("[A-Z]", ""));
        System.out.println(str.replaceAll("[!-/]", ""));
        System.out.println(str.replaceAll("[A-z0-9]", ""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "")); // not expressions ^ replaces everything except the values after ^

    }
}
