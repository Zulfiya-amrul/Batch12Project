package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student teyfur = new Student("teyfur", 20, "memes");
        Student gulden = new Student("emila", 16, "study");
        Student emilia = new Student("emilia", 16, "coding");

        LinkedList <Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(teyfur);
        studentLinkedList.add(gulden);
        studentLinkedList.add(emilia);
        System.out.println(studentLinkedList); // when you print with this it gives location of the file
        // but we need the string values
        //  to get it to string value we need to override the to String method in Student class





    }
}
class Student {
    String name;
    int age;
    String hobbies;

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    } // to make this appear type " to " and select the to String method to be overriden
    // the toString ( ) is coming from the object class
    // we are overriding the toString method to show the actual content of the fields instead of
    // getting the location of the class
}
