package com.syntax.class26;

public class RedoShoppingCart {
    private double originalPrice1 = 100;
    private double discount1 = .15;

    void setDiscount1 (double discount1) {
        if (discount1>0 && discount1<=.15) {
            this.discount1= discount1;
        }
        else{
            System.out.println("cant have that much discount");
        }
    }

    public double getDiscount1 () {
        return discount1;
    }
    void calcutePrice () {
        double price1 = originalPrice1 -(originalPrice1*discount1);
        System.out.println(price1);
    }

}
