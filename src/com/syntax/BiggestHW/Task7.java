package com.syntax.BiggestHW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
       /// How can you remove all duplicates from ArrayList?
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        HashSet <String> newHash = new HashSet<>(aList);
        System.out.println(newHash);

    }
}
