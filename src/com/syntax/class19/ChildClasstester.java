package com.syntax.class19;

import com.syntax.class20.Parent;

public class ChildClasstester {
    class Child extends Parent {
        void printInfo() {
            //   System.out.println(name); its private cant be shared

            //  System.out.println(age); default is not accesible in another package
            System.out.println(weight);
            System.out.println(color);
        }
    }
}

