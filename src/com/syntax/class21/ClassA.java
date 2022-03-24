package com.syntax.class21;

public class ClassA {
    void method () {
        System.out.println("A");
    }
}
class ClassB extends ClassA {

    void method () {

        System.out.println("B ");
    }
    void test () {
        this.method();
        method();
        super.method();

    }
}

class Tester {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.method ();
        classB.test();

    }
}