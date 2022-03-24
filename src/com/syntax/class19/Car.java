package com.syntax.class19;

public class Car {
    // these are instance variables
    String name= "toyota";
    String make;
    String color;
    String type;

    Car ( String name, String make, String color, String type) {

        this.name= name;
        this.make= make;
        this.color= color;
        this.type= type;
        // java gives priority to local variables if we dont give this. keyword
        // if we have same local and instance variables java always prefer laocal variable
        // if you want instruct java to use isntatce variables then we use " this" keyword
    }

    Car(){
    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
