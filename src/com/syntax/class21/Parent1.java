package com.syntax.class21;

public class Parent1 {
    String name = "Parent";
    void printName () {
        System.out.println(name);
    }
}
class Child1 extends Parent1 {
    String name = "Child";
    void printName () {
        String name = "Teyfur";

        System.out.println(name);// value from the local variable line 12
        System.out.println(this.name); // value from instance variable from the same class child class line 10
        System.out.println(super.name);// value from parent class instance variable line 4

    }

}
class ParentTester {
    public static void main(String[] args) {
        Child1 child1 = new Child1 ();
        child1.printName();
    }
}
