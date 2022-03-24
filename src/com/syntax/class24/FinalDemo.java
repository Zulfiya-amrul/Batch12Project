package com.syntax.class24;

public class FinalDemo {
    final String name ; //error
    // if we make something final the value of the variable needs to be given right away
    // if we dont know the value right away we can do this inside constructor

    FinalDemo (String name) {
        this.name= name; // possible to assign the value using constructor but cant be ever changed

    }


}
