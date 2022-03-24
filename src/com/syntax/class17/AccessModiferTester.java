package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModiferTester {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        //System.out.println(am.name);// it has private access

       // System.out.println(am.age); default
        System.out.println(am.color); // color is public acess
        //
        //System.out.println(am.weight); protected
    }
}
