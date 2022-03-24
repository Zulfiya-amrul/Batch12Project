package com.syntax.class18;

import com.syntax.class19.Child;

public class TestingClass19hw {
    public static void main(String[] args) {
        // TESTING from  DIFFERENT PACKAGE
        // new Child("Aysha", "brown", 3, 'F').printAllInfo();    PRIVATE ACCESS CANT BE REACHED from different class
        new Child("Aya").printAllInfo(); // only public is working outside of the package class
        //new Child("Aya", "black").printAllInfo();
      //  new Child("Aya", "black", 10).printAllInfo();
    }
}
