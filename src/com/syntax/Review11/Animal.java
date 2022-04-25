package com.syntax.Review11;

public class Animal {
    String name;
    String color;
    void sleep() {
        System.out.println("animal sleeps");
    }

}
class Dog extends Animal{
    void sleep() {
        System.out.println("cat sleeps all day");
    }
}
class Cat extends Animal{

}
class Test2 {
    public static void main(String[] args) {
     //   Cat cat= new Dog();
        // Cat cat = new Animal ( ) ; down casting
        Animal animal = new Dog(); // upcasting
        Dog dog = (Dog ) animal ;
        dog.sleep();

    }
}