package com.syntax.class30MapsHW;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        //Create a Map that will store Employee name and salary.
        // Write a logic to retrieve an employee who gets the highest salary.
        // Output should be in the below format
        //John Smith=$100000
        HashMap <String, Double> employeeInfo = new HashMap<>();
        employeeInfo.put("Anna", 10000.00);
        employeeInfo.put("Elen", 30000.00);
        employeeInfo.put("Felix",500000.00);
        employeeInfo.put("Nathan",100000.00);

        Double maxSalary = (Collections.max(employeeInfo.values()));
        for (Map.Entry <String, Double> entry : employeeInfo.entrySet()) {
            if (entry.getValue()==maxSalary) {
                System.out.println(entry);
            }
        }

    }
}
