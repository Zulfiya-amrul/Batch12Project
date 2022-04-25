package com.syntax.BiggestHW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
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

        // we add all the elements for List collect aList into the new LinkedHashSet
        // then we clear remove all of the elements of the original list (aList)
        // once the original List aList is empty --- then we add back the LinkHashSet eleemtns into the original aList
        // this works because LinkedHashSet does not allow duplicates and it also maintains the insertion order so when we recieve all the elements they are in the same order as they were inserted

        LinkedHashSet linkedHashSet=new LinkedHashSet(aList);
        aList.clear();
        aList.addAll(linkedHashSet);
        System.out.println(aList);



    }
}
