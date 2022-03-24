package com.syntax.youtubeVIdeos;

final public class FinalKey {
    // global variables
    final int MIN =0;

    final int MAX;
    FinalKey () {
        MAX = 5;
    }
  final public void sayHi () {
       System.out.println("hi");
   }
    static final double PI = 3.14159;

    public static void main(String[] args) {

        FinalKey f = new FinalKey ();
        System.out.println(f.MAX);
        f.sayHi();


    }
}


