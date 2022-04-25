package com.syntax.class30Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 10.23);
        fruitMap.put("Mango", 1244.45);

        System.out.println(  fruitMap.size());
// fruitMap.entrySet( ) - the entry is the box that has keys and values inside
        // entry is a separate entity like an object
        // entrySet is a method that returns an object

        System.out.println(fruitMap.entrySet());
        for (Map.Entry<String, Double> entry : fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getKey() +" : "+ entry.getValue());

        }

    }

}
