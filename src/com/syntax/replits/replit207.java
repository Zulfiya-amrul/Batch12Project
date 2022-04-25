package com.syntax.replits;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static javafx.scene.input.KeyCode.Y;

public class replit207 {
    public static void main(String[] args) {
        HashMap <String, String > map = new HashMap<>() ;
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
         Map.Entry<String, String> it =  iterator.next();
           System.out.println(it.getKey() + " : " + it.getValue());
       }
        System.out.println("------------------");
       map.replace("THREE", "ASEL");
       map.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        //map.forEach((X,Y)-> System.out.println(X+" : "+Y));

        for (Map.Entry<String, String> entry: map.entrySet()
        ) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
/*
    for (Map.Entry<Integer, String> entry: personInfo.entrySet()
             ) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
 */