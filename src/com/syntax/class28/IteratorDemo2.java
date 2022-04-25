package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses= new LinkedList<>();
        courses.add("SDLC");
        courses.add("manual");
        courses.add("java");
        courses.add("git");
        courses.add("selenium");
        Iterator <String> iterator =courses.iterator(); // iterator is an interface
        // all of the classes of collection framework have implement the iterator interface
        System.out.println(iterator.hasNext()); // returns true or false
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        // if you try to ask for the next at this point you will get no such element exception

    }
}
