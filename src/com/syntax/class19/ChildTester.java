package com.syntax.class19;

public class ChildTester {
    public static void main(String[] args) {
        // TESTING SAME PACKAGE DIFFERENT CLASS
       // new Child("Aysha", "brown", 3, 'F').printAllInfo();    PRIVATE ACCESS CANT BE REACHED from different class
        new Child("Aya").printAllInfo();
        new Child("Aya", "black").printAllInfo();
        new Child("Aya", "black", 10).printAllInfo();

    }
}
