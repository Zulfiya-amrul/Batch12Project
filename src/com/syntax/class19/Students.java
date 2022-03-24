package com.syntax.class19;
public class Students {
//Write a java Class Students
// that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.

    String studentName;
    int mathGrade;
    int scienceGrade;
    int englishGrade;

    public  Students(String studentName, int mathGrade, int scienceGrade, int englishGrade) {
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
    }

    void studentAverage () {
        System.out.println(studentName + " grade average " +(mathGrade+
                scienceGrade+ englishGrade) /3);

    }
}
