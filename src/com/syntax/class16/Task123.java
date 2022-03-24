package com.syntax.class16;

public class Task123 {
    public static void main(String[] args) {
       // task 1
        String task1= "This is my sentence.";
        String newTask1= task1.replace(" ", "");
        System.out.println(newTask1);
      // task 2
     // Find out how many Alphanumeric characters are there in the String.
        String task2= "This IS MY string 123@#!+)";
        System.out.println(task2.replaceAll("[^A-Za-z0-9]","").length());

    //task 3
    //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
    // How would you find out how many sentences are in that String?
        String task3= "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(task3.split("[?]").length);






    }
}
