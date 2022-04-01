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

        for ( int i=0; i<drinks.size(); i++) {
            if(drinks.get(i).contains("e")|| drinks.get(i).contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
