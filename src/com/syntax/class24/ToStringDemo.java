package com.syntax.class24;

import com.sun.org.apache.xml.internal.serializer.ToSAXHandler;

public class ToStringDemo {
    String name;
    int age;

    ToStringDemo (String name, int age ) {
        this.name= name;
        this.age= age;

    }
    @Override
    public String toString () {
        return "Mr A show your face";
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo = new ToStringDemo("Mr.A", 10 );
        System.out.println(toStringDemo);

    }
}
