package com.syntax.class23;

public class DogTester {
    public static void main(String[] args) {
     Dog dog = new Dog();
        System.out.println(dog);
        Dog dog2= new Dog("tommy", "green", "redbull", 12, 25.5);
        dog2.changeInfo("rocky", "black", "bulldog");
        System.out.println(dog2);

    }
}
