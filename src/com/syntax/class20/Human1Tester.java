package com.syntax.class20;

public class Human1Tester {
    public static void main(String[] args) {
        Student student = new Student ();
        student.name = "Zohoor";
        System.out.println(student.name);
        student.printName();
        student.studentId= "123";
        System.out.println("******");

        Principal principal = new Principal();
        principal.name= "Guldan";
        principal.printName ();
        principal.SpecialParkingSlot= false;



    }
}
