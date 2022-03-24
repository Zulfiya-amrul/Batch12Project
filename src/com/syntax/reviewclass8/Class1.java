package com.syntax.reviewclass8;

import javax.imageio.stream.ImageInputStream;

public class Class1 {

    public void printSmallerDigit (int x, int y ) {
        if (x<y) {
            System.out.println("x is smaller");
        }
        else if (y<x) {
            System.out.println( y + "  is smalller ");
        }
        else {
            System.out.println("the values are same");
        }
    }

    public static void main(String[] args) {
        Class1 obj= new Class1();
        obj.printSmallerDigit(3,5);


    }
}
