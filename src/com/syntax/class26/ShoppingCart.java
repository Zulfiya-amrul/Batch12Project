package com.syntax.class26;

public class ShoppingCart {

    private double originalPrice=100;
    private double discount = .15;


    void calculatePrice() {
        double price = originalPrice - (originalPrice * discount);
        System.out.println(price);
    }

    void setDiscount (double discount) {
        if (discount>0 && discount <= .15) {
            this.discount= discount;

        }
        else {
            System.out.println("cant have that much discount");
        }
    }

    public double getDiscount () {
        return discount;
    }


}
