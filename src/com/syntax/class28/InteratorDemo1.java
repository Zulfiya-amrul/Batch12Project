package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class InteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses= new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");

       /* for (int i =0; i <5; i++ ) {
            if (courses.get(i).equals("java")) {
                courses.remove("java");
            }
        }*/

    }
}
