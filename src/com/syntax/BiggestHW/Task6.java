package com.syntax.BiggestHW;

import java.util.Iterator;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
            /*
            Create a Card class that will have implemented and unimplemented methods
            and a constructor that will initializes credit card type.
            Create 3 subclasses of a Card class.
            Create 3 objects of different card and store them into LinkedList.
            Using for loop/advanced for loop/ iterator access all methods of the class.
             */
        Visa card1 = new Visa("visa");
        MasterCard card2 = new MasterCard("MasterCard");
        AmericanExperess card3= new AmericanExperess("MasterCard");

        LinkedList<String> cards = new LinkedList<>();
        cards.add(card1.cardType());
        cards.add(card1.activateCard());
        cards.add(card2.cardType());
        cards.add(card2.activateCard());
        cards.add(card3.cardType());
        cards.add(card3.activateCard());
        System.out.println(cards);

        for (String card : cards ) {
            System.out.println(card);
        }
        for ( int i=0; i< cards.size(); i++) {
            System.out.println(cards.get(i));
        }
        Iterator <String> iterator = cards.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
abstract class Card {
    String cardtype;
    abstract String cardType();

    String activateCard() {
        return "the card has been activated";
    }
    public Card(String cardtype) {
        this.cardtype = cardtype;
    }
}
class Visa extends Card {

    public Visa(String cardtype) {
        super(cardtype);
    }
    @Override
    String cardType() {
        return cardtype;
    }
}
class MasterCard extends Card {

    public MasterCard(String cardtype) {
        super(cardtype);
    }
    @Override
    String cardType() {
        return cardtype;
    }
}
class AmericanExperess extends Card {

    public AmericanExperess(String cardtype) {
        super(cardtype);
    }
    @Override
    String cardType() {
        return cardtype;
    }
}