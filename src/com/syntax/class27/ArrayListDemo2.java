package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        number.add(10.5);
        number.add(100.5);
        number.add(12.9);
        number.add(1.5);
        System.out.println(number.get(2));
        number.remove(2);
        System.out.println(number);
        System.out.println(number.size());


        for (double num :number ) {
            System.out.println(num);
        }

      /*  ArrayList <Integer> numbers = new ArrayList < > ();

        Scanner scan = new Scanner (System.in);

        for ( int i =0; i<5; i ++) {
           numbers.add(scan.nextInt());

        }
        for (int i =0; i<5; i++) {

            System.out.print( numbers.get(i)+ " ");

        }
*/
        LinkedList<Integer> fibonacci = new LinkedList<> ();

        int n1= 0;
        int n2=1;

        for (int i =0; i<10; i++) {
            fibonacci.add(n1);
           // System.out.print(n1+ " ");
            int sum= n1+ n2;
             n1= n2;
             n2= sum;
        }
        for ( int num: fibonacci ) {
            System.out.print(num +" ");
        }

        ArrayList <Boolean>  listA = new ArrayList<> ();

        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList <Boolean> listB= new ArrayList <> ();

        listB.addAll(listA);
        System.out.println(listB);


    }
}
