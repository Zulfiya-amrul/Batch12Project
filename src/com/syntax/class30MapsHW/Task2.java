package com.syntax.class30MapsHW;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */
        TreeMap <String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("Turkiye", "Ankara");
        countries.put("Mexico", "Mexico City");
        countries.put("Canada", "Ottawa");
        // print all keys and values using for each loop

        for (Map.Entry <String, String> entry: countries.entrySet()){
            System.out.print(entry.getKey()+ " ");
            System.out.println(entry.getValue());

        }
        // print all key and values from map using iterator
        System.out.println("print all key and values from map using iterator");
        Iterator <Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
           Map.Entry<String,String> entry =  iterator.next();
            System.out.println(entry);
        }
        // Print all values from a country map using for each loop and iterator.

        for (String value: countries.values()) {
            System.out.println(value);
        }

        Iterator <String> iterator1= countries.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
