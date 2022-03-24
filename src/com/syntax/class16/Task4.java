package com.syntax.class16;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
        //		// input=>This is sentence i want to reverse
        //		// output=>sihT si ecnetnes i tnaw ot esrever


        StringBuilder stringB= new StringBuilder("Sunday is great");
        System.out.println(stringB.reverse());


        String s= "Sunday"; // how to reverse this string

        StringBuilder str= new StringBuilder(s); // s becomes a string builder
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr= "";
        String s2= stringB.toString();
        String [] strArr= s2.split(" ");

        System.out.println(Arrays.toString (strArr));

        for (int i = strArr.length-1; i>=0; i--) {
            newStr+= strArr[i]+ " ";

        }



    }
}
