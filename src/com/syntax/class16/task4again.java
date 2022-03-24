package com.syntax.class16;

public class task4again {
    public static void main(String[] args) {

        String s = "Sunday";
        task4again task4 = new task4again();
        System.out.println(task4.reverseString(s));
        String[] strArray = s.split(" ");
        System.out.println(strArray[2]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(task4.reverseString(strArray[i] + " "));

        }


    }

    String reverseString(String inputString) {
        // converting s to stringbuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();


    }
}

