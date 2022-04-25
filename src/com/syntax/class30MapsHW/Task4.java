package com.syntax.class30MapsHW;

public class Task4 {
    public static void main(String[] args) {
        // Create a Person class with following private fields: name, lastName, age, salary.
        // Variables should be initialized through constructor.
        // Inside the class also create a method to print user details.
        // In Test Class create a Map that will store key in ascending order.
        // In that map store personId and a Person Object. Print each object details.

    }
    static class Person1 {
        private String name;
        private String lastName;
        private int age;
        private int salary;

        public Person1(String name, String lastName, int age, int salary) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        @Override // overriding the to string method
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
