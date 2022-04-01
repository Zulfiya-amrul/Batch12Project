package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <Double> numberList  = new ArrayList< >( );
        Double double1= new Double (10.5 );
        double number = double1.doubleValue();// unboxing
        Double number2= new Double(number);// boxing
        Double number3= 10.5;// autoboxing
        Double number4= number3;
        number3= number4; // autoUnboxing
        System.out.println(number3);



        ArrayList <Integer> numbers = new ArrayList<Integer>();
        numbers.add (111);
        numbers.add (222);
        numbers.add (333);
        numbers.add (444);
        numbers.add (555);
        numbers.add (666);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(5));
        System.out.println(numbers);
        numbers.removeAll(numbers);
        System.out.println(numbers);

        ArrayList <String> greet = new  ArrayList <> ();

        greet.add("hi");
        greet.add("yo");
        greet.add("sup");
        greet.add("yolo");
        greet.add("boop");
        System.out.println(greet);
        greet.remove(0);
        System.out.println(greet);
        greet.remove(1);
        greet.remove(2);
        System.out.println(greet);




    }
}
