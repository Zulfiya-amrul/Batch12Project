package com.syntax.class28;

import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {
        // no duplicates no insertion order
        HashSet <String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("kiwi");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
        HashSet <Integer> numbers = new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);
        System.out.println  (numbers);
        HashSet <Integer> number = new HashSet<>();
        number.add(111);
        number.add(111);
        number.add(111);
        number.add(999);
        number.add(999);
        number.add(999);
        Iterator<Integer> it = number.iterator ();
        System.out.println(it.next());
        System.out.println(it.next());

        HashSet <String> colors = new HashSet<> ();
        colors.add ("Red");
        colors.add ("Pink");
        colors.add ("Yellow");
        colors.add ("White");
        colors.add ("Black");
        System.out.println(colors);
        System.out.println(colors.size());
        TreeSet<String> countries =new TreeSet<String>();
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");
        countries.add("America");
        countries.add("America");
        System.out.println(countries);

        Set<String> names= new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");
        Iterator<Integer> syntaxnames = number.iterator ();
      while (syntaxnames.hasNext()) {
          System.out.println(syntaxnames.next());
      }

    }

}
