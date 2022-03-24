package com.syntax.class22;

public class Task4 {
    /* Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */

        private void add (int a, int b ) {
            System.out.println(a + b );
        }
        private void add (int a, int b, int c ) {
            System.out.println(a + b + c);
        }
        private void add (int a, int b, int c, int d ) {
            System.out.println(a + b + c + d );
        }
        private void add (int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d +e);
     }

    public static void main(String[] args) {
        Task4 obj= new Task4();
        obj.add(1, 2);
        obj.add(1, 2, 3);
        obj.add(1, 2, 3,4);
        obj.add(1, 2, 3, 4, 5);


    }
    }
