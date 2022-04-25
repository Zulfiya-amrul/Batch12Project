package com.syntax.class30MapsHW;

import com.syntax.replits.Person;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String, Task4.Person1> personTreeMap=new TreeMap<>();
        personTreeMap.put("a", new Task4.Person1("Safiul","Alam",42,1500000));
        personTreeMap.put("b", new Task4.Person1("Gulden","A",16,1400000));
        personTreeMap.put("c", new Task4.Person1("Mr","A",22,1700000));
        personTreeMap.put("d", new Task4.Person1("Nassir","Ariyan",27,1800000));

        for (Map.Entry<String,Task4.Person1> p:personTreeMap.entrySet()
        ) {
            System.out.println(p);
        }

    }
}
