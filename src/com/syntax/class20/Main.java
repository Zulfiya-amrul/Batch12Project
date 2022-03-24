package com.syntax.class20;
class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{

        for(int i=0; i<array.length-1; i++){

            if ((array[i]+1)%2==0) {

                array[i]= array[i]/2;

            }
            else {
                array[i]= array[i]* 2;
            }

            System.out.println(array[i]);


        }
    }
}