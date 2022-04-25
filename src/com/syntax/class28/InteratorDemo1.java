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
        // when we use List and try to loop through it as we remove an element we will get
        // a runtime error, because the size keeps changing as we remove the element but the loop cant recognize it and
        // trows an error --
        // regular loops and for each loops arent the beest way to work with collections-
        // because for each loop doesnt have the machanism to get the size of the list dynamically
        // because of this loops dont work with collection

       /* for (int i =0; i <5; i++ ) {
            if (courses.get(i).equals("java")) {
                courses.remove("java");
            }
        }*/

    }
}
