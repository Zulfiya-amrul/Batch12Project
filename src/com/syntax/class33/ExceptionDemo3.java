package com.syntax.class33;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("0");
       // System.out.println(10/0);
        try {
            System.out.println(10/5);
            System.out.println("1");
            //throw new RuntimeException();
        }catch (ArithmeticException arithmeticException){
            System.out.println("2");
        }catch (Exception exception){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("6");
        }
        System.out.println("7");
    }
}