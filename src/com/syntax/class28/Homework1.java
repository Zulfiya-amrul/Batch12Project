package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework1 {
    public static void main(String[] args) {
        // create an arraylist of cars and retrieve all the values using 3 different ways

        ArrayList <String> cars = new ArrayList<>();
        cars.add("toyota");
        cars.add("honda");
        cars.add("tesla");
        cars.add("chevy");
        cars.add("bmw");
        System.out.println(cars);
        System.out.println("first way");
        for (String car : cars ) {
            System.out.println(car);
        }
        System.out.println("second way");
        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("third way");
        Iterator <String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
