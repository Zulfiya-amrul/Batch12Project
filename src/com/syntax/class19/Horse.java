package com.syntax.class19;

public class Horse {
   private String name;
   private int age;
  private double weight;

  Horse (String horseName, int horseAge, double horseWeight) {
      name= horseName;
      age= horseAge;
      weight= horseWeight;

  }
  //RULE #1 constructor dont have return types
    // RULE #2   name of the constructor should be same as name as the class
    // there are 2 types of constructiors - no argumement constructor and parameterized const
    // the no arguemnt constructor is used to create objects
    // no argument const. write some important lines of code that you want to execute whe nthe object
    // is created
    // you might want to fetch some infor from internet or from your hard disk to give initial values


  void printHorseName () {
      System.out.println("Name " + name );

  }
    void setName (String horseName) {
      name= horseName;

    }
}
