package com.syntax.class17;

public class Student {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName ,
    //studentID and increment  the numberOfStudents for each object
    //Print out  total number of students
    String studentName;
    String studentId;
    static int numberOfStudents = 5;

    public static void main(String[] args) {

        Student firstStudent = new Student();
        firstStudent.studentName = "Albert Einstine";
        firstStudent.studentId = "AE12345";
        System.out.println(firstStudent.studentName);
        System.out.println(firstStudent.studentId);
        System.out.println(Student.numberOfStudents);
        numberOfStudents += 1;

        Student secondStudent = new Student();
        secondStudent.studentName = "stephen hawking";
        secondStudent.studentId = "SH12345";
        System.out.println(secondStudent.studentName);
        System.out.println(secondStudent.studentId);
        System.out.println(Student.numberOfStudents);
        numberOfStudents += 1;

        Student thirdStudent = new Student();
        thirdStudent.studentName = "Galileo Galilei";
        thirdStudent.studentId = "GG12345";
        System.out.println(thirdStudent.studentName);
        System.out.println(thirdStudent.studentId);
        System.out.println(Student.numberOfStudents);
        numberOfStudents += 1;
    }
}
