package com.syntax.BiggestHW;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
      /*
     1.  Create an arraylist of cars and retrieve all the values using 3 different ways.
       */
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Subaru");
        cars.add("Honda");
        cars.add("Chevy");

        System.out.println("retrieving values using iterator");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("retrieving values using enhanced loop");
        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();
        System.out.println("retrieving values using for loop");
        int size = cars.size();
        for (int i = 0; i < size; i++) {
            System.out.print(cars.get(i) + " ");
        }
    }
}
