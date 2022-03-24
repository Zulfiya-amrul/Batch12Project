package com.syntax.class20;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public Frog(String name, String color, int age, double weight) {
        // this () should be first linke inside the constructor
        this (name, color, age);
        this.weight = weight;
    }
    void printInfo () {
        System.out.println(name + " " + color + " " + age + " " + weight);
    }
}
