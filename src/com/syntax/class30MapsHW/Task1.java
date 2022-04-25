package com.syntax.class30MapsHW;

import java.util.HashMap;
import java.util.Iterator;

public class Task1 {
    //Create a map of a building.
    // Store floor number and it is associated company name.
    // (Example: 1= Google, 2=Syntax etc..).
    // Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {
        HashMap <Integer,String> buildingMap = new HashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Apple");
        buildingMap.put(3, "Facebook");
        buildingMap.put(4, "Instagram");
        buildingMap.put(1, "Google");
        buildingMap.put(5, "Amazon");
        buildingMap.put(6, "Oracle");
        buildingMap.put(7, "Walmart inc");
        buildingMap.put(4, "Adobe");

        System.out.println(buildingMap);
        System.out.println(buildingMap.size());
        buildingMap.replace(4, "Non-Profit.org");
        System.out.println(buildingMap);


        Iterator<Integer> iterator = buildingMap.keySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(7)) {
                iterator.remove();
            }
        }
        System.out.println();


    }
}
