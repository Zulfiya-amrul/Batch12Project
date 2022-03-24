    package com.syntax.replits;

    public class r166 {
        /*
        Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
        Create a subclass Cat in which override method sleep
        Create 3 Kitten subclasses of a Cat class and override method eat
        for 1 kitten - eats milk
        for 2 kitten - eats snack
        for 3 kitten - eats everything
        In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
         */
        public static void main(String[] args) {
            Animal[] cats = {new Cat(), new kitten1(), new kitten2(), new kitten3()};
            for (Animal cat : cats) {
                cat.eat();
                cat.sleep();
            }

        }
    }
    class Animal {

        void eat () {
            System.out.println("the animal is eating");
        }
        void sleep () {
            System.out.println("the animal is sleep");
        }
    }
    class Cat extends Animal {

        @Override
        void eat () {
            System.out.println("Cat eats");
        }
        @Override
        void sleep () {
            System.out.println("Cat sleeps a lot");
        }

    }
    class kitten1 extends Cat {
        @Override
        void eat () {
            System.out.println("kitten1 eats milk");
        }
        @Override
        void sleep () {
            System.out.println("kitten1 sleeps a lot");
        }
    }
    class kitten2 extends Cat {
        @Override
        void eat () {
            System.out.println("kitten2 eats snack");
        }
        @Override
        void sleep () {
            System.out.println("kitten2 sleeps a lot");
        }

    }
    class kitten3 extends Cat {
        @Override
        void eat () {
            System.out.println("kitten3 eats everything");
        }
        @Override
        void sleep () {
            System.out.println("kitten3 sleeps a lot");
        }

    }




