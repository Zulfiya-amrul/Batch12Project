package com.syntax.reviewclass13;

import java.util.ArrayList;
import java.util.Iterator;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();
        names.add("orsan");
        names.add("nassir");
        names.add("mujeeb");
        names.add("tolga");
        //convert collection to stream() and we can use lambda
        long m =names.stream().filter(x->x.contains("M")).count();//lambda
        System.out.println(m);

      //  long m = names.removeIf(s -> s.);

    }
}
