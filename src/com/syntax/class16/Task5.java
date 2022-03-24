package com.syntax.class16;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {
        String original = "ana";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
        boolean palindrome = true;

        for (int i = 0; i < original.length() - 1; i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
