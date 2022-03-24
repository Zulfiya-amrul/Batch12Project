    package com.syntax.class23;

    import javax.jws.Oneway;

    public class Student {
        /*
        Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        Define common behavior within parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Write example of achieving run time polymorphism
         */
    void weekends () {
        System.out.println("the student is enjoying weekends relaxing");
    }
    void learning () {
        System.out.println("the student is learning interesting information");
    }
    }
    class SyntaxStudent extends Student {
        @Override
        void weekends () {
            System.out.println("the Syntax student is glued to the computer screen on the weekends");
        }
        @Override
        void learning () {
            System.out.println("the Syntax student is learning java ");
        }
    }
    class CollegeStudent extends Student {
        @Override
        void weekends () {
            System.out.println("the college student is parting hard on the weekends");
        }
        @Override
        void learning () {
            System.out.println("the college student is learning economics");
        }

    }
    class SchoolStudent extends Student {
        @Override
        void weekends () {
            System.out.println("the school student is out with friends on the weekends");
        }
        @Override
        void learning () {
            System.out.println("the school student is learning calculus");
        }
    }
    // in java we can store objects of a child classes in a paerent type variable
    // every class in java can be treated as  a data type
    // as we can strore the object of a child class in a parent class we can also create an array of these students

    class testingStudent {
        public static void main(String[] args) {
            new Student ().learning();
            new Student ().weekends();
            new SyntaxStudent ().learning();
            new SyntaxStudent ().weekends();
            new CollegeStudent ().learning();
            new CollegeStudent ().weekends();
            new SchoolStudent ().learning();
            new SchoolStudent ().weekends();
            Student [] students1 = {new SyntaxStudent(), new SchoolStudent(), new CollegeStudent()};
            for (Student stud : students1) {
                   stud.learning();
                   stud.weekends();
            }

        }
    }
