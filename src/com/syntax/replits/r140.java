package com.syntax.replits;

public class r140 {
//Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//Method should visible only within same package


       static String maxLength (String [] arr) {
           int max = 0;
           String longestString = null;
           for (String s : arr) {
               if (s.length() > max) {
                   max = s.length();
                   longestString = s;
               }
           }
           return longestString;
        }


    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
