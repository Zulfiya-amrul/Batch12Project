package com.syntax.replits;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class r204 {
    public static void main(String[] args) {
        LinkedHashMap <String, String> address = new LinkedHashMap<>();
        address.put("Street" , "Patrick ST");
        address.put("Suite" , "265");
        address.put("City",  "Vienna");
        address.put("Zip" , "22180");
        address.put("Country" , "United State");
        for (Map.Entry<String, String> entry : address.entrySet()) {
            System.out.println( entry.getValue().toUpperCase());
            System.out.println(entry.getKey().toUpperCase());

            System.out.println(entry.getValue().toUpperCase());
        }


    }
}
/*
"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using iterator
 */