package com.syntax.class26;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList <> ();
        countries.add("USA");
        countries.add("turkey");
        countries.add("morrocco");
        countries.add("iraq");
        countries.add("gana");
        countries.add("eritea");
        countries.add("afganistan");
        System.out.println(countries);
        System.out.println(countries.get(3));
       // System.out.println(countries.get(-1));
        countries.add(3, "pakistan"); // insert elemente at this specifed index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("pakistan");
        System.out.println(    countries.size());
        countries.add(3, "Pakistan");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.add("PAKISTAN");
        System.out.println(countries);
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());



    }
}
