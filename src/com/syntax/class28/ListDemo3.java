package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses= new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        System.out.println(courses);
        for (int i=0; i <courses.size(); i++) {
            if (courses.get(i).equals("java")) {
                courses.set(i ,"happy");
            }
        }
        System.out.println(courses);

    }
}
