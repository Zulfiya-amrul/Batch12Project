package com.syntax.class19;

public class Child {
    // Write a java class that have 4 constructors
    // with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class:
    // 1 - inside same class; -
    // 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    String name = "Anna";
    String hairColor;
    int age;
    char gender;

    public Child(String name) {
        this.name = name;
        System.out.println("this information is on public access level");
    }

    Child(String name, String hairColor) {
        this.name = name;
        this.hairColor = hairColor;
        System.out.println("this information is on default access level");
    }

    protected Child(String name, String hairColor, int age) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        System.out.println("This information is on protected access level");
    }
    private Child(String name, String hairColor, int age, char gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = age;
        this.gender = gender;
        System.out.println("This information is on private access level");
    }
   public void printAllInfo() {
        System.out.println("name of child:" + name + " haircolor:" + hairColor + " age:" + age + " gender:" + gender);
    }
    public static void main(String[] args) {
        Child child1 = new Child("Aysha", "brown", 3, 'F');
        child1.printAllInfo();
        Child child2 = new Child("Aya");
        child2.printAllInfo();
        Child child3 = new Child("Aya", "black");
        child3.printAllInfo();
        Child child4 = new Child("Aya", "black", 10);
        child3.printAllInfo();
    }


}
