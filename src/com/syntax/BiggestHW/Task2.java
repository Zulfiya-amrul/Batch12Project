package com.syntax.BiggestHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {

    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
 */

        ArrayList <String> words = new ArrayList<>();
        words.add("Table");
        words.add("Marble");
        words.add("Chair");
        words.add("Pen");

        words.removeIf(s -> s.toLowerCase().endsWith("e"));
        System.out.println(words);


        /* removeIf method  from Lambda expressions
        is better to use than iterator in this case

          Iterator <String> iterator = words.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().equals("e")){
                iterator.remove();
            }
        }
         */

    }
}
