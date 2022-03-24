package com.syntax.class23;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    int balance;
    int interest;

    void calculate(int balance, int interest) {
        System.out.println(balance * interest);
    }
}

class Visa extends CreditCard {
    void calculate(int balance, int interest) {
        System.out.println(balance * interest + 3);
    }
}

class AX extends CreditCard {
    void calculate(int balance, int interest) {
        System.out.println(balance * interest + 4);
    }
}

class testCards {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        obj1.calculate(1000, 3);

        Visa obj2 = new Visa();
        obj2.calculate(1000, 3);

        AX obj3 = new AX();
        obj3.calculate(1000, 3);
    }
}
