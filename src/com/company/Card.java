//Daniel O'Brien - Anne Cho - Group Project - 3/5/2022
package com.company;


public class Card {
    //Instance fields of card class
    private String suit;
    private int value;

    //Card constructor
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    //Getters and setters for fields
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //toString overriding
    @Override
    public String toString() {
        return (this.suit + " " + this.value);
    }



}
