    package com.syntax.class22;

    public class Task3 {

        /*
        Create 1 class with a static method that has 3 overloaded forms.
         Then call each overloaded method with specific arguments and observe result.
         */


        // method to multiply 2 int values
        public static void multiply (int num1, int num2) {
            System.out.println(num1 * num2);
        }
        public static void multiply (int num1, int num2, int num3) {
            System.out.println(num1 * num2 * num3);
        }
        public static void multiply (int num1, int num2, int num3, int num4) {
            System.out.println(num1 * num2 * num3 * num4);
        }
        public static void multiply (int num1, int num2, int num3, int num4, int num5) {
            System.out.println(num1 * num2 * num3 * num4 * num5);
        }

        public static void main(String[] args) {
            multiply(2, 2);
            multiply(2, 2, 2);
            multiply(2, 2, 2, 2);
            multiply(2, 2, 2 ,2 ,2 );


        }

    }
