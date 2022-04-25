package com.syntax.class30Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit206 {
    public static void main(String[] args) {
        /*
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"    "FOUR"
Using entry set print key and values pairs using loop
 */

        HashMap <String, String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        System.out.println("------------------");
        System.out.println( "HashMap After Remove :");

        Iterator< String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value= map.get(key);
            if (key.contains("ONE") || key.contains("FOUR")) {
                iterator.remove();
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


/*
        Map<String,String> myMap=new HashMap<>();
        myMap.put("ONE","AAA");
        myMap.put("TWO","BBB");
        myMap.put("THREE","CCC");
        myMap.put("FOUR","DDD");
        myMap.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        myMap.forEach((X,Y)-> System.out.println(X+" : "+Y));
        System.out.println("------------------");
        myMap.remove("ONE");
        myMap.remove("FOUR");
        System.out.println("HashMap After Remove :");
        myMap.forEach((key, value) -> System.out.println(key + " : " + value));*/
    }
}
