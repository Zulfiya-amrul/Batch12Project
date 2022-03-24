package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.start();
        Suzuki suzuki = new Suzuki();
        suzuki.park();
        suzuki.start();

        Car car = new Tesla();
        car.start();
    }
}
///method overriding is used in inheritance when the child class overrides the method of the parent class