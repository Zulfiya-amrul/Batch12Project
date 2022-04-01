package com.syntax.BiggestHW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList <String> words = new ArrayList<>();
        words.add("Table");
        words.add("Marble");
        words.add("Chair");
        words.add("Pen");

        Iterator <String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
