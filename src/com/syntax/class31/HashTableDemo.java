package com.syntax.class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable <String,String> students = new Hashtable<>();
        students.put("1", "Moreed");
        students.put("2", "Emilia");
        students.put("3", "Medine");
        students.put("4", "Yazgul");
        students.entrySet();

        Set<Map.Entry<String,String>> entrySet =students.entrySet();
        //when we are planning to change the size of a data then we should go with iterator
        for(Map.Entry<String,String> entry :entrySet){
            System.out.println(entry);
        }
    }
}
