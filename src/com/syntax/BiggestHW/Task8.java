package com.syntax.BiggestHW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task8 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
  */

        Set<String> counties = new TreeSet<>();
        counties.add("USA");
        counties.add("Mexico");
        counties.add("Canada");
        counties.add("Turkey");
        counties.add("Russia");
        counties.add("Bosnia");
        System.out.println(counties);

        for (String country: counties) {
            System.out.println(country);
        }
        Iterator iterator = counties.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
