package com.syntax.util;

import java.util.ArrayList;

public class ArrayUtil {
    ArrayList<String> toArrayList (String [] strings) {
        ArrayList <String> arrayList = new ArrayList < > () ;

        for (String str: strings) {
            if (str!=null ) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
