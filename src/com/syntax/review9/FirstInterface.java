package com.syntax.review9;

class Main implements Functions {
    public static void main (String [] args ){
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        Main1234 obj= new Main1234();


        obj.display(obj.adding(100.00, 20.00));
        obj.display(obj.subtracting(100.00, 20.00));
        obj.display(obj.multiply(100.00, 20.00));
        obj.display(obj.dividing(100.00, 20.00));





    }

    @Override
    public void display(double result) {
        System.out.println("Result is ::: " + result);


    }

    @Override
    public double adding(double firstNumber, double secondNumber) {

        return firstNumber + secondNumber;

    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}

interface Outputs {

    
   public  void display (double result);
}
interface Functions extends Outputs{


    public double adding (double firstNumber, double secondNumber);
    public double subtracting (double firstNumber, double secondNumber);
    public double multiply (double firstNumber, double secondNumber);
    public double dividing (double firstNumber, double secondNumber);
}