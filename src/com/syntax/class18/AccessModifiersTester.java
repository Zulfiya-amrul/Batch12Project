package com.syntax.class18;

public class AccessModifiersTester {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
       // System.out.println(am.name); // cant access this because its from different calls
        // and its a private access
        System.out.println(am.age);
        System.out.println(am.color);

    }
}
