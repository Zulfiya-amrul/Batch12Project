package com.syntax.class16;

public class Task5again {
    public static void main(String[] args) {


        Task5again task = new Task5again();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abc"));


    }

    boolean isPalindrome(String inputStr) {
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);


    }

    String reverseString(String inputString) {
        // converting s to stringbuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
