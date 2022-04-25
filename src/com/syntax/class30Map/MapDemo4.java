package com.syntax.class30Map;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 10.23);
        fruitMap.put("Mango", 1244.45);
        // getting the iterator from the map with the help of method chaining
        // if we want to use the iterator we need to first get the Set or Collection
        // first we are getting the set from the map
        // then we are getting the iterator on that set
        // Has.next checks if there are next elements left in the iterator
        // next gets the keys from the iterator
       Iterator<String> iterator= fruitMap.keySet().iterator();
       while (iterator.hasNext()) { // checks if there are still elements left in the iterator
           String key = iterator.next(); //
           Double value= fruitMap.get(key);//getting the corresponding values from the map by passing keys
           if ( key.contains("e")&& value>=20) {
               iterator.remove(); // if both of the conditions are satisfied we are remove the element
           }

       }
       }
}
