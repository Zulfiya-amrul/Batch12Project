package com.syntax.BiggestHW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task9 {
    public static void main(String[] args) {
        /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
     Then remove any city that starts with “A”;
         */

        Set<String> cities= new LinkedHashSet<>();
        cities.add("Boise");
        cities.add("Phoenix");
        cities.add("Arrowhead");
        cities.add("Aurora");
        cities.add("Austin");
        cities.add("Alameda");
        System.out.println(cities);

        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);


    }
}
