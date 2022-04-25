package com.syntax.reviewclass13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList <String > names = new ArrayList<>();
        names.add("orsan");
        names.add("nassir");
        names.add("mujeeb");
        names.add("tolga");
        // this iterator only works with lists


        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()) {
            String name = stringListIterator.next();
            stringListIterator.add("zulfiya");
            //stringListIterator.hasPrevious()

        }


      /*  Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length()>5 ) {
                iterator.remove();
            }
        }
        System.out.println(names);

       */
    }
}
