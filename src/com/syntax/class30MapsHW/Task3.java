package com.syntax.class30MapsHW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        // Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        // Retrieve all keys and values from a Best Buy map using EntrySet.
        HashMap<Integer, String> bestBuy= new HashMap<>();
        bestBuy.put(123, "Laptop");
        bestBuy.put(456, "HD TV");
        bestBuy.put(789, "Computer Monitor");
        bestBuy.put(1221, "Camera");
        bestBuy.put(3243, "Speakers");

      Iterator<Map.Entry<Integer, String>> iterator=  bestBuy.entrySet().iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }



    }
}
