package com.syntax.class16;

public class Task4RealOne {
    public static void main(String[] args) {
        //get the codes from syntax
        //reverse the words
        // append the words to get the sentence back

        String s= "Sunday is great";
        String []strArray= s.split(" ");

    //task4
    //how would you reverse a String word by word? for example

        String task4= "This is a sentence i want to reverse";

        String [] task4Array= task4.split(" ");

        for ( int i=0; i<task4Array.length; i++) {

           for (int k=task4Array[i].length()-1; k>=0; k--) {
               System.out.print(task4Array[i].charAt(k));
           }
            System.out.print(" ");

        }


    }
}
