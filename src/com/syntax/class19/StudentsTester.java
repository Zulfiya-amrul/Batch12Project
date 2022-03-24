package com.syntax.class19;

public class StudentsTester {
    public static void main(String[] args) {

        Students student1 = new Students("Lana",
                79, 80, 90);
        student1.studentAverage(); // original way of setting it up
            // chaining implementation all in one line
        new Students("Anna", 49, 20,
                100).studentAverage();
        new Students("Hana", 39, 100,
                100).studentAverage();
        new Students("Jana", 78, 66,
                99).studentAverage();
        new Students("Lary", 55, 88,
                77).studentAverage();

    }
}
