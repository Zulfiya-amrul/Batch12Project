package com.syntax.class26;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name = "Yazgul";
        String name2= "Farah";
        // not scalable if we have to store large amount of data
        // arrays can be a good option to tackle this problem

        String [] names = {"Yazgul", "Andrew"};
       // names [2]= "Teyfur";
        String [] names2= new String [1000];
        names2 [0]= "Elena";
        names2 [2] = "andrew";
        System.out.println(Arrays.toString(names2));
        // diamond operator <>

        ArrayList<String> syntaxStudents = new ArrayList <> ();
        // ArrayList --> name ofthe class
        // <> diamond operator
        // String datatype
        syntaxStudents.add("dmitriy");
        syntaxStudents.add("mike");
        syntaxStudents.add("andrew");
        System.out.println(syntaxStudents);






    }



}
