package com.syntax.class18;

public class AccessModifiers {

    private String name = "Naugthy Tarik"; // private access is applied

    int age = 50; // default

    protected double weight = 50;

    public String color = "white";


    public static void main(String[] args) {

        AccessModifiers am = new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.color);
        System.out.println(am.weight);

    }


}
