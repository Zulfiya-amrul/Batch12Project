package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {





    public static void main(String[] args) {
        // ArrayList <Integer>
        // link list dont store in consecutive location
        // nodes remember the location at each node

        //Create a Linked List that will store Integer Objects from 50-100.
        //Once Linked List is created remove all numbers that are not divisible by 3.
        //Print Linked List
        //Expected Output
        //[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }
        LinkedList <Integer> removeNum = new LinkedList<>();
        for(int i = 0; i<=50;i++){
            if(numbers.get(i)%3!=0){
                removeNum.add(numbers.get(i));
            }
        }
        numbers.removeAll(removeNum);
        System.out.println(numbers);

        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        ArrayListDemo7 ma= new ArrayListDemo7 ();

      //  countries.contains(returnA);



        LinkedList <Integer> values = new LinkedList <> ();
        values.add(111);
        values.add(222);
        values.add(333);
        values.add(444);
        values.add(555);
        values.add(666);
        int sum=0;

        for (int val:values ) {
            sum= val + sum;

        }
        System.out.println(sum);
        


    }
}



