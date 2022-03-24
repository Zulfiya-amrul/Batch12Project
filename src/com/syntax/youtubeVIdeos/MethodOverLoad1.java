package com.syntax.youtubeVIdeos;

public class MethodOverLoad1 {
    // method overloading is writing the same code with different parameters
    //overloaded methods can have different return types
    // in first method we have no return type
    // in the second method that was used to override the first one we have a return type that is a String h
    // overloaded methods MUST have different parameters
    // we can have different return types when overriding method



    public static void sayHi () {
        System.out.println("Hi");
    }
    public static void sayHi (String h) {
        System.out.println("Hi "+ h );
    }

    public static void main(String[] args) {
        sayHi();
        sayHi("NesoAcademy");
    }

}
