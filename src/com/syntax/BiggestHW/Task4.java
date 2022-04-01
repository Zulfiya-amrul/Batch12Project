    package com.syntax.BiggestHW;

    import java.util.ArrayList;
    import java.util.Iterator;

    public class Task4 {
        public static void main(String[] args) {
    //Create an arrayList of even numbers from 1 to 500.
    // Remove any number that is divisible by 5 from that arrayList.

            ArrayList <Integer> evenNum = new ArrayList<>();
            for ( int i =1; i <=500; i++ ){
                if (i%2==0) {
                    evenNum.add(i);
                }
            }
            System.out.println(evenNum);
            Iterator <Integer> iterator = evenNum.iterator();
            while (iterator.hasNext()){
                if (iterator.next()%5==0) {
                    iterator.remove();
                }
            }
            System.out.println(evenNum);

        }
    }
