package com.syntax.class33;

public class Math {
    void add( int a, int b){
        System.out.println(a+b);
    }
    void divide (int a, int b){
     /*   if(b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("you are trying divide the number by zero");
        }*/
    try{
        System.out.println(a/b);

    } catch (ArithmeticException are) {
        System.out.println("you are trying divide the number by zero which is not possible ");


    }
    }
}

