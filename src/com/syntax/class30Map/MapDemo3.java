package com.syntax.class30Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 10.23);
        fruitMap.put("Mango", 1244.45);
        System.out.println(fruitMap);
        // want to remove items based on values
        // getting all values from the map
        // can't use Set-- to store values inside, because set doesnt allow duplicate values,
        // //but in map we can have duplicate values
        // if we store the values inside the set we will lose duplicate values.

        //because of those reasons we use Collection, we can also store values in a list
        //  is the grandfather interface of the collections framework
        Collection<Double>values =  fruitMap.values();
        System.out.println(values);

       Iterator <Double> iterator = values.iterator();
       while (iterator.hasNext()) {
           if (iterator.next()>=20) {
               iterator.remove();
           }
       }
        System.out.println(fruitMap);
    }
}
