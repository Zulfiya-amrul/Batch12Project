package com.syntax.class27;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
         */
        ArrayList <String> names = new ArrayList<>();
        names.add("Asghar");
        names.add("Asel");
        names.add("Sohail");
        names.add("Alijon");
        names.add("Moazzam");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Asel"));
        System.out.println( names.size());
        System.out.println(names);
    }
}
