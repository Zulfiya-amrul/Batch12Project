package com.syntax.class25;

public interface Human {
    // public static final are redundant because by default all the variables are public static final

   // public static final int legs = 2;
     int legs =2;
   //  public abstract void walk ();
    void walk ();
    static void printLegs () {
        System.out.println(legs);
    }
public default void noNeedToWorry () {
    System.out.println("default methods are there to support functional programming");
}
}
class Maha implements Human {

    @Override
    public void walk() {

    }

    public static void main(String[] args) {
        Maha maha = new Maha ();
        maha.walk ();
        Human.printLegs();

    }
}
