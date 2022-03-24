    package com.syntax.class23;

    import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

    public class Degree {
       /*
       Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
       Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
       Call the method by creating an object of each of the three classes.
        */
        void getPrerequisite () {
            System.out.println("To get a degree you need high school diploma");
        }
    }

    class Bachelors extends Degree {
        void getPrerequisite () {
            System.out.println("To get a degree you need high school diploma");
        }
    }

    class Masters extends Degree {
        @Override
        void getPrerequisite () {
            System.out.println("To get a degree you need bachelors diploma");
        }
    }
    class Task1 {
        public static void main(String[] args) {
            Masters masters = new Masters();
            masters.getPrerequisite();
            Bachelors bachelor = new Bachelors();
            bachelor.getPrerequisite();
            Degree degree = new Degree();
            degree.getPrerequisite();
        }
    }