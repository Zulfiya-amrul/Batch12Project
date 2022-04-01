package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class LIstDemo2 {
    public static void main(String[] args) {
        List<String> courses= new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        courses.add("TestNg");
        courses.add("cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("interview");
        courses.add("resume prep");
        courses.add("AWS"); // amazon web services
        courses.add("APM"); // Appium-- mobile app automation testing.
        courses.add("docker");
        courses.add("dead");
        System.out.println(courses);
        courses.set(courses.size()-1, "Happy");
        System.out.println(courses);

    }
}
