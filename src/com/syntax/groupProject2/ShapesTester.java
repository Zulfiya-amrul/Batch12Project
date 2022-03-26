package com.syntax.groupProject2;

public class ShapesTester {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateArea());
        Square square = new Square(6);
        System.out.println(square.calculateArea());
        System.out.println( square.calculatePerimiter());
    }
}
