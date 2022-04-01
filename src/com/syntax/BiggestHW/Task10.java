package com.syntax.BiggestHW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        /*
    Create a Set collection that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.
         */
     /*   ClassStudent Student1 = new ClassStudent("Alex", 12345);
        ClassStudent Student2 = new ClassStudent("John", 12346);
        ClassStudent Student3 = new ClassStudent("Allie", 12347);
        ClassStudent Student4 = new ClassStudent("Alex", 123458);*/
        HashSet <String> studentInfo = new HashSet < > ( );
        studentInfo.add(new ClassStudent("Alex", 12345).DisplayName());
        studentInfo.add(new ClassStudent("John", 12346).DisplayName());
        studentInfo.add(new ClassStudent("Allie", 12347).DisplayName());
        studentInfo.add(new ClassStudent("Mark", 123458).DisplayName());
        System.out.println(studentInfo);
        for (String student: studentInfo) {
            System.out.println(student);
        }
    }
}
class ClassStudent {
    String studentName;
    int studentID;
    String DisplayName () {
        return studentName;
    }

    public ClassStudent(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
}