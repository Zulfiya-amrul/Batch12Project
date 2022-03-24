    package com.syntax.class24;

    public class Computer {
        //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
        //Define common behavior within and some fields in parent class and override some of the methods in child classes
        //Define some methods specific to child classes
        //Create objects of child classes and store them into array. Loop through each object and execute available methods.
   String make;

        public Computer(String make) {
            this.make = make;
        }
        void login (){
            System.out.println("use fingerprint to login as well");
        }
    }

    class Apple extends Computer {

        public Apple(String make) {
            super(make);
        }

        @Override
        void login() {
            super.login();
        }
    }
    class Lenovo extends Computer {


        public Lenovo(String make) {
            super(make);
        }
    }
    class HP extends Computer {

        public HP(String make) {
            super(make);
        }
    }
    class Dell extends Computer {

        public Dell(String make) {
            super(make);
        }
    }

    class task1 {
        public static void main(String[] args) {






        }

            }