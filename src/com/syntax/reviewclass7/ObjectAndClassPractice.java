package com.syntax.reviewclass7;

public class ObjectAndClassPractice {
    String empName;
    int empID;
    String group;


    void employeeDetails() {

        System.out.println("this method shows the details of the employee");

    }

    void employeeGroup() {

        System.out.println("this method shows the group of the employee");

    }

    public static void main(String[] args) {
        ObjectAndClassPractice obj = new ObjectAndClassPractice ();
        obj.employeeGroup();
        obj.employeeDetails();


    }

}
