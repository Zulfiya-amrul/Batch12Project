    package com.syntax.class21;
    public class Shape {
        /*
        Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
         In circle class create a method to calculate the area of circle. Test your code
         */
        double radius;
        public Shape(double radius) {
            this.radius = radius;
        }
    }
    class Circle extends Shape {
        public Circle(double radius) {
            super(radius);
        }
        void areaOfCircle() {
            //  double p =3.14;
            // r2
            // area = 3.14 * r * r
            System.out.println(Math.PI * Math.pow(radius,2));
        }
    }
    class testingArea {
        public static void main(String[] args) {
            Circle obj = new Circle(7);
            obj.areaOfCircle();
        }
    }
