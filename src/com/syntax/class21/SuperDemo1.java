package com.syntax.class21;

public class SuperDemo1 {

}
class AAA {
    AAA () {

    }
}
class BBB extends AAA {
    String name ;
    BBB () {

    }
    BBB (String name) {
        super ();

        //this(); // should be on the first line inside the constructor

        this.name= name;

    }
}
