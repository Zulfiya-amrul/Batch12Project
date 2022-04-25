package com.syntax.class30MapsHW;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(60);
        int sum=0;
        for (Integer number: numbers) {
            sum =sum + number;
        }
        System.out.println(sum);


    }
}
