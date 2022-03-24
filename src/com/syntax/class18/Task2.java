package com.syntax.class18;

public class Task2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.


    public static String reverString (String input ) {
       // StringBuilder stringBuilder = new StringBuilder(input);
      //  stringBuilder.reverse();
      //  return stringBuilder.toString();
        return new StringBuilder(input).reverse().toString();
        //  new StringBuilder(input) object creation
        //new StringBuilder(input).reverse(). calling method on that object
        //new StringBuilder(input).reverse().toString(); calling two methods on that object
        // return new StringBuilder(input).reverse().toString();
        // calling two methods on that ojbect and returning the results

    }

    public static void main(String[] args) {
        String name = "Emili";
        System.out.println(Task2.reverString(name)); // method chaining


    }
}
