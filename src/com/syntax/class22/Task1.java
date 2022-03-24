    package com.syntax.class22;

    public class Task1 {
        /*
        Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle
    Square
    Box
         */
        // area of rectangle
        public static void area ( int num1, int num2) {
            System.out.println(num1 * num2);
        }
        // area of square
        public static void area ( int num1) {
            System.out.println(Math.pow(num1, 2));
        }
        // volume of box
        public static void area ( int num1, int num2, int num3) {
            System.out.println(num1 * num2 * num3);
        }
        public static void main(String[] args) {
            area(4);
            area(4,8);
            area(4,9,2);
        }
    }
