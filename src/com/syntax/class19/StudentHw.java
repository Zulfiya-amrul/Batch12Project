package com.syntax.class19;

public class StudentHw {
    //  Write a Student class that have instance variables name and address.
    //  Create a constructor that will initialize those variables.
    //  Print name & address of given student using displayInfo method.

    String name;
    String address;

    public StudentHw(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo( ) {
        System.out.println(name + " lives on " + address);
    }

    public static void main(String[] args) {

        new StudentHw("Lola", "143 West Happy Street").displayInfo();
    }
}
