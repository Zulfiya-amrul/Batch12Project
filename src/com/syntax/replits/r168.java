package com.syntax.replits;

public class r168 {

}
class Mainb {

    final static String reverse (String str) {
       String  reverseStr = "";

       for (int i = str.length()-1; i>=0; i--) {

           reverseStr= reverseStr + str.charAt(i);
       }
        return reverseStr;


    }


    public static void main (String [] args) {

        System.out.println(reverse ("hello"));

        reverse ("hello");
    }
}
