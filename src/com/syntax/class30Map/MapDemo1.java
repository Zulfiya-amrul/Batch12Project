package com.syntax.class30Map;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap <String, Double > fruitMap = new HashMap<>();
       // fruitMap.put("Apple", 20); auto casting does not happen in collections and in maps
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 10.23);
        fruitMap.put("Mango", 1244.45);
        fruitMap.put("Banana", 23.45);// duplicate values are overwritten last value is retained
        System.out.println(fruitMap);

        System.out.println(fruitMap.get("KiWi")); // case sensitive will not give the value in this form
        System.out.println(fruitMap.get("Kiwi")); // must be identical key writen form

        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("kiwi"));
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana", 50.0);
        System.out.println(fruitMap);
        System.out.println(fruitMap);



    }
}
