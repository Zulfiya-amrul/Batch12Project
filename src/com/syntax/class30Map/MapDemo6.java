package com.syntax.class30Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
//fruitMap.put("Apple",20); auto casting does not work in collections and maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);



        System.out.println(fruitMap.keySet());// want to get only the keys
        System.out.println(fruitMap.values()); // want to get only the values
        System.out.println(fruitMap.entrySet()); // want to get keys and values combined in a single set
        // getting keys and values in the form of an entry
        Iterator<Map.Entry<String, Double>> iterator = fruitMap.entrySet().iterator();
        // 1- wrap the individual key and value inside the entry
        // then you can get the iterator

        while (iterator.hasNext()) {
           // System.out.println(iterator.next()); // all the key and value combined together
          //  System.out.println(iterator.next().getKey());
            System.out.println(iterator.next().getValue());
        }
    }
}
