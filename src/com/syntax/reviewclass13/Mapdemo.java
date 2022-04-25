package com.syntax.reviewclass13;

import com.syntax.class31.HashTableDemo;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {

        HashMap<Integer, String> personInfo = new HashMap<>();
        personInfo.put(111111, "Nana");
        personInfo.put(34234, "ali");
        personInfo.put(345345, "aysha");
        personInfo.put(45346, "lui");
        personInfo.put(45345667, "mak");
        personInfo.put(6456756, "lak");

        for (Map.Entry<Integer, String> entry: personInfo.entrySet()
             ) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }


    }
}
