    package com.syntax.class24;

    public abstract class Phone {
        void makePhoneCalls () {
            System.out.println("Making a phone call");
        }
        void sendText () {
            System.out.println("Sending a txt");
        }
       abstract void displayPicture ();
        abstract void unlockPhone ();
    }

     class IPhone extends Phone {
        @Override
        void displayPicture () {
            System.out.println("use the photo app to display pics");
        }

         @Override
         void unlockPhone() {

         }
     }

    class Samsung extends Phone {
        @Override
        void displayPicture () {
            System.out.println("use the gallery app to display pics");
        }
        @Override
        void unlockPhone() {

        }

    }
    // if one method in an class is abstract the whole class neeeds to have the abtract keyword
    // the method tht does not have implementation can be left without the block of code { }
    // the child class of abstract class must implement the abtrscat method that were not implements in the parent class
