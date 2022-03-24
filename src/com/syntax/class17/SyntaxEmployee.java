package com.syntax.class17;

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO = "Sumair";
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class Employee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects
    public static void main(String[] args) {
        SyntaxEmployee aselObject = new SyntaxEmployee();
        aselObject.empId = "123";
        aselObject.salary = 200000;
        System.out.println(aselObject.empId);
        System.out.println(aselObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee mozzamObject = new SyntaxEmployee();
        mozzamObject.empId = "456";
        mozzamObject.salary = 198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);
    }
}
