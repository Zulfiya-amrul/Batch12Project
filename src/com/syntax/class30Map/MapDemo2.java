package com.syntax.class30Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 10.23);
        fruitMap.put("Mango", 1244.45);


        Set<String> keys = fruitMap.keySet(); // returns a set with only the Key values
        System.out.println(keys);

        Iterator<String> iterator = keys.iterator(); // if we want to remove something from the set we use iterator instead of loop
        while (iterator.hasNext()) {
            if (iterator.next().contains("e")) {
                iterator.remove();
            }
        }
        //keys.removeIf(s -> s.contains("e"));
        System.out.println(fruitMap);
    }
}
