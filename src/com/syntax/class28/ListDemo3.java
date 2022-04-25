package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("java");
        courses.add("selenium");
        System.out.println(courses);

        //courses.replaceAll("java"); this replaceAll method operates on lambda expressions
        // lamda expression are very powerful they can improve the performance of the code
        // as we can pass a variable into the method
        // with lambda expressions we can pass the body of the method (the implementation)
        // as a parameter to another method
        // it expects an UnaryOperator
        courses.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.equals("java")) {
                    return "Happy";
                } else {
                    return s;
                }

            }
        });
        System.out.println(courses);
        // lambda expression will pass each element inside the List into the String s one by one
        // without using a loop


        System.out.println(courses);
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).equals("java")) {
                courses.set(i, "happy");
            }
        }
        System.out.println(courses);

    }
}
