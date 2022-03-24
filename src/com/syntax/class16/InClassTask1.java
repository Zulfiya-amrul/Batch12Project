package com.syntax.class16;

public class InClassTask1 {
    public static void main(String[] args) {

        //TASK1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String string1= "This is my sentence.";
        String newString1= string1.replace(" ", "");

        System.out.println(newString1);


        // TASK2. Create a String that should be combination of letters, numbers and special characters.
        // Find out how many alphanumeric characters are there in the String.

        String string2= "This is MY string 12$#&";

        System.out.println(string2.replaceAll("[^A-za-z0-9]", "").length());
        System.out.println(string2.replaceAll("[A-za-z0-9]", "").length());



       // string2.charAt();

        //TASK3 You have a String a=
        // ”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String s3= "Is it saturday? Is it raining? Do we have a Java Class today?";
        // string class method to count the number of characers in a class

        String []s3Arr= s3.split("[?]");
        System.out.println(s3Arr.length);
       // another way
        System.out.println(s3.split("[?]").length);
        // length property that we can use to check the number of elements in an array


    }
}
