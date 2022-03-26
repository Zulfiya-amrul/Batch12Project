package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        ArrayList <String> vegis  = new ArrayList<>();
        vegis.add("Potato");
        vegis.add("tomatos");
        vegis.add("carrot");


        ArrayList <String> groceries  = new ArrayList<>();

        groceries.addAll(fruits);
        groceries.addAll(vegis);
        System.out.println(groceries);

        ArrayList <String> itemsToBeRemoved = new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);

    }
}
