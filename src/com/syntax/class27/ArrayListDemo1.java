package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList <Double> numberList  = new ArrayList< >( );
        Double double1= new Double (10.5 );
        double number = double1.doubleValue();// unboxing
        Double number2= new Double(number);// boxing
        Double number3= 10.5;// autoboxing
        Double number4= number3;
        number3= number4; // autoUnboxing
        System.out.println(number3);


    }
}
