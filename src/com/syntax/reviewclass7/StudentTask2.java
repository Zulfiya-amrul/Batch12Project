package com.syntax.reviewclass7;

public class StudentTask2 {
    //1-Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    String studentName;
    double subj1;
    double subj2;
    double subj3;

    StudentTask2( String name,double subj1, double subj2, double subj3){
        System.out.println("Student credentials");
    }
    //2-Inside your class also have a method to Calculate Average Grade.
    String sumGrade() {
        return (studentName+(subj1+subj2+subj3)/3);
    }
    // 3-Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name
}
    class studentTester{
    public static void main(String[] args) {
        StudentTask2 student1 = new StudentTask2("yazgul",80,90,98);


        System.out.println( student1.sumGrade());


    }

}