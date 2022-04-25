package com.syntax.BiggestHW;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("milk");
        drinks.add("juice");
        drinks.add("soda");
        drinks.add("tea");
        drinks.add("coke");
        System.out.println(drinks);
        // wer are using for loop because we are not removing any elements
        // if we were to remove elemnts instead of replacing like we are doing here then we would prefer to use iterator
        // also im really sure if iterator allows us to use contains method since it only has 3 build it methods i wasnt able to use contains



        for ( int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("e")|| drinks.get(i).contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
