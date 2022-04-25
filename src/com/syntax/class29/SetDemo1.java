package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList= new ArrayList<>();
        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("c");
        arrayList.add("c");

        // concverting ArrayList to LinkedHashSet-- we can do it with the help of constructors
        //  new LinkedHashSet<>(arrayList);  ( arrayList) passing arrayList to the constructor of LinkedHashSet
        // the list gets converted to LinkedHashSet

        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);
        TreeSet <String> treeSet= new TreeSet<>(arrayList);
        System.out.println(treeSet);
        arrayList.clear();// removing all the original elements

        arrayList.addAll(linkedHashSet);
        System.out.println("Array");
        System.out.println(arrayList);

    }
}
