package com.syntax.replits;

import java.util.Iterator;
import java.util.TreeSet;

public class quiz {
    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
            System.out.println("-------");

            StringBuffer sb = new StringBuffer("Hello");sb.append("World");System.out.println(sb);
            StringBuffer sb3= new StringBuffer("Hello"); sb3.deleteCharAt(0); System.out.println(sb3);
            System.out.println("=+++++++++++++++++");
            StringBuilder sb1=new StringBuilder("Syntax"); sb1.append("Solutions"); System.out.println(sb1);

            //int[] a=new int[5];
            //a[10]=50;

            String s=null; System.out.println(s.length());
        }
    }
}
