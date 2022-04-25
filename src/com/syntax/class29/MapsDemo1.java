package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        names.add(("Asghar"));
        names.add("Mohammed");

        HashMap <Integer, String>  map = new HashMap <> ();
        map.put(123456789, "Asghar Nazir");
        map.put(1234, "Muhammad");
        System.out.println(map.get(123456789));
        System.out.println(map.get(1234));
        System.out.println(map);

    }
}
