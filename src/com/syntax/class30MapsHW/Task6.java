package com.syntax.class30MapsHW;

import java.util.LinkedHashSet;

public class Task6 {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //a. Write a logic to concatenate all string from the collection.

        LinkedHashSet<String> values = new LinkedHashSet<>();
        values.add("There");
        values.add("is");
        values.add("so");
        values.add("much");
        values.add("homework");
        values.add("to");
        values.add("catch");
        values.add("up");
        values.add("on!");

        StringBuilder allValues = new StringBuilder();
        for(String value:values){
            allValues.append(value).append(" ");
        }
        System.out.println(allValues);


        //teacher version//
        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka");
        drinks.add("tequila");
        drinks.add("margarita");
        drinks.add("Link");
        StringBuilder allDrinks = new StringBuilder();
        for(String drink:drinks){
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);

    }
}
