package com.syntax.class26;

public class ShoppingCardTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
     //   shoppingCart.originalPrice = 100;
      //  shoppingCart.discount= .20;
        shoppingCart.setDiscount(.10);
        shoppingCart.calculatePrice();
    }
}
