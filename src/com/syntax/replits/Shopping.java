package com.syntax.replits;

public class Shopping {
    public static void main(String[] args) {
        ShoppingStore obj1= new ShoppingStore ("Blanket", 49.99, 2 );
        obj1.itemTotalPrice();
        ShoppingStore obj2= new ShoppingStore ("Mattress", 439.18, 1 );
        obj2.itemTotalPrice();

        System.out.println("You purchased " + (obj1.calc + obj2.calc) + " Today");
    }
}
class ShoppingStore{
    String item;
    double price;
    int quantity;
    double calc;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.calc= quantity * price;
    }

    void itemTotalPrice () {
        System.out.println(item + " Total Value " + calc );
    }
}
