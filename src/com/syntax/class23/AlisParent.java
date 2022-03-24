package com.syntax.class23;

public class AlisParent {
    String girlName= "Salma";
    double money= 100000;

    void marry () {
        System.out.println("ali you should marry "+ girlName);
    }
}
    class Ali extends AlisParent {

    String girlName = "Rihanna";

    void marry () {
        super.marry();
        System.out.println("but dad i want to marry "+girlName);
    }

    }
