package com.syntax.Reviewclass12;

import com.syntax.util.StringUtil;

public class FacebookTester {
    public static void main(String[] args) {
        Facebook facebook = new Facebook() ;
        facebook.setName("Orsan");

        facebook.browseFacebook();
        System.out.println(StringUtil.contains("ab123", "[0-9]"));
    }
}
