package com.syntax.replits;

public class r154 {

        public static void main (String [] agrs) {
            Child1 child = new Child1();
            Child1 child1 = new Child1(10);

        }

    }
    class Parent1 {
    int number;


        public Parent1() {
            System.out.println("Parent constructor without argument");
        }

        public Parent1(int number) {
            this.number = number;
            System.out.println(number);
        }
    }
    class Child1 {
        public Child1() {
            System.out.println("Child Constructor without argument");
        }
        public Child1(int number) {
            System.out.println("Child Constructor without argument");


        }
    }
