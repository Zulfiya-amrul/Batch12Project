package com.syntax.class31;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        //Create the collection that will store single unique Objects of a String type
        // in which order is preserved.
        //Write a logic to concatenate all string from the collection.


        LinkedHashSet <String> drinks = new LinkedHashSet<>();
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("sprite");
        drinks.add("milk");
        drinks.add("water");

        StringBuilder allDrinks= new StringBuilder();
        for (String drink:drinks
        ){
            allDrinks.append(drink+" ");
        }
        System.out.println(allDrinks);

    }
}
