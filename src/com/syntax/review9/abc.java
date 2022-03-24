package com.syntax.review9;


   interface iOutputs{
        void display(double myResult);
        }
interface iFunctions extends iOutputs{
    double adding(double firstNumber , double secondNumber);
    double subtracting(double firstNumber , double secondNumber);
    double multiply(double firstNumber , double secondNumber);
    double dividing(double firstNumber , double secondNumber);
}
class Main1234 implements iFunctions{
    public void display(double myResult){
        System.out.println("Result is ::: "+myResult);
    }
    public double adding(double firstNumber , double secondNumber){
        return(firstNumber + secondNumber);
    }
    public double subtracting(double firstNumber , double SecondNumber){
        return(firstNumber - SecondNumber);
    }
    public double multiply(double firstNumber , double SecondNumber){
        return(firstNumber * SecondNumber);
    }
    public double dividing(double firstNumber , double SecondNumber){
        return(firstNumber / SecondNumber);
    }
    public static void main(String[] args){
        Main1234 obj=new Main1234();
        obj.display(obj.adding(100.00, 20.00));
        obj.display(obj.subtracting(100.00, 20.00));
        obj.display(obj.multiply(100.00, 20.00));
        obj.display(obj.dividing(100.00, 20.00));
    }
}