package com.company;

public class Main {

    public static void main(String[] args) {
        GroupOfCards test = new GroupOfCards();
        test.createDeck();
        test.printMainDeck();
        test.shuffle();
        test.printMainDeck();
    }
}
