package com.company;

public class Main {

    public static void main(String[] args) {
        GroupOfCards test = new GroupOfCards();
        test.createDeck();
        test.printMainDeck();
        test.shuffle();
        System.out.println("");
        test.splitDeck();
        test.printUserDeck();
        System.out.println("");
        test.printAiDeck();
    }
}
