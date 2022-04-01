package com.syntax.BiggestHW;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a class Insurance
        that will have an attribute as insuranceName
        and unimplemented behaviour as getQuote and cancelInsurance.
        Create 3 subclasses Car, Pet, Health.
        Car class has it’s own attribute as carModel and
        Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */
   Car car= new Car();
   Pet pet= new Pet();
   Health health = new Health();

        ArrayList <String> classes= new ArrayList<>();
        classes.add(car.getQuote());
        classes.add(car.cancelInsurance());
        classes.add(pet.getQuote());
        classes.add(pet.cancelInsurance());
        classes.add(health.getQuote());
        classes.add(health.cancelInsurance());
        System.out.println(classes);

        for (String OneClass: classes) {
            System.out.println(OneClass);
        }
        for (int i=0; i< classes.size(); i ++  ){
            System.out.println(classes.get(i)+ " ");
        }
        Iterator <String> iterator =  classes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
abstract class Insurance {
    String insuranceName;
  abstract String getQuote();
  abstract String cancelInsurance();
}
class Car extends Insurance{
    @Override
    String getQuote() {
        return  "get quote method inside car class";
    }
    @Override
    String cancelInsurance() {
        return "cancel the insurance of the car ";
    }
    String carModel;
}
class Pet extends Insurance{

    @Override
    String getQuote() {
        return "get quote method inside pet class";
    }
    @Override
    String cancelInsurance() {
        return "cancel insurance of the pet";
    }
    String petType;
}
class Health extends Insurance {
    @Override
    String getQuote() {
        return "get the quote health insurance";
    }
    @Override
    String cancelInsurance() {
        return "cancel the health insurance";
    }
}
