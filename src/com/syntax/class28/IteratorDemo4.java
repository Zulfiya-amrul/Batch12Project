package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {

    public static void main(String[] args) {
        List<String> courses= new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        Iterator<String> iterator =courses.iterator();
        while (iterator.hasNext())  {
            if (iterator.next().equals("java")) {
                iterator.remove();
            }

        }
        System.out.println(courses);
    }
// when you are doing any operation on list that can change its size use operator
    // otherwise use loops
}
