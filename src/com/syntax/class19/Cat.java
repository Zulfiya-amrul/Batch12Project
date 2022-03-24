package com.syntax.class19;

public class Cat {
    //Write a java class that will have a constructor:
    // one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    String name = "Lilly";
    String color = "Black and white";
    int age = 6;
    int weight = 23;
    // constructor with parameters
    Cat(String catName, String catColor, int catAge, int catWeight) {
        name= catName;
        color= catColor;
        age= catAge;
        weight= catWeight;

        System.out.println("Cat's name " + name + " cat's color " +
                color + " cat's age " + age + " cats weight " + weight);
    }
    // constructor without parameters
    Cat() {
        System.out.println("Cat's name " + name + " cat's color " +
                color + " cat's age " + age + " cats weight " + weight);

    }



}
