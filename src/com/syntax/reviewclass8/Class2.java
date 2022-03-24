package com.syntax.reviewclass8;

public class Class2 {

     String generateUserName (String firstName, String lastName) {

         return firstName + "123" + lastName + ".com";

    }
    static void moreedDemand () {
        System.out.println("This is moreeds function");

    }

    public static void main(String[] args) {
        moreedDemand();
        Class2 obj= new Class2();
        System.out.println(obj.generateUserName("emilia", "gular"));

    }
}
