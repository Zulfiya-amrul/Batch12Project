package com.syntax.class20;

public class Parent {

     private String name; // private members dont participate in inheritance
     int age;
     protected double weight;
     public String color;

    }
    class Child extends Parent {
        void printInfo () {
         //   System.out.println(name); its private cant be shared

            System.out.println(age);
            System.out.println(weight);
            System.out.println(color);

        }
        }


