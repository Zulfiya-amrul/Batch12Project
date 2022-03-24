package com.syntax.class22;

public class IfElseDemo {
    public static void main(String[] args) {

        int number = 10;
        //number >10? s
        //System.out.println();
        // the ternary operator has the limitation that it must return something we can't use it to print out things
        // there is a limitation with shorthand operator
    }

    int maxNumber(int num1, int num2) {

//        if (num1>num2) {
//            return num1;
//
//        }else {
//            return num2;
//
//        }
            // writing this condition using shorthand operation
        return num1 > num2 ? num1 : num2;
        // num1 > num2-condition
        // ? -if statement
        // return num1 if its true
        // otherwise return num2

        // or can also assign it to a variable
        // int maxVal=  num1 > num2 ? num1 : num2;
        // return maxVal


    }
}
