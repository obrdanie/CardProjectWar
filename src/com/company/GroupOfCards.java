//Daniel O'Brien - Anne Cho - Group Project - 3/5/2022
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {


    private String[] suit = {"Spades", "Diamond", "Clubs", "Hearts"};
    private int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public ArrayList<Card> mainDeck = new ArrayList<>();
    public ArrayList<Card> userDeck = new ArrayList<>();
    public ArrayList<Card> aiDeck = new ArrayList<>();

    int counter = 0;
    public void createDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int e = 0; e < value.length; e++) {
                Card newCard = new Card(suit[i], value[e]);
                mainDeck.add(counter, newCard);
                counter++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(mainDeck);
    }

    public void splitDeck() {
        for (int i = 0; i < mainDeck.size(); i++) {
            Card userCard = new Card(mainDeck.get(i).getSuit(), mainDeck.get(i).getValue());
            userDeck.add(userCard);
            i++;
            Card aiCard = new Card(mainDeck.get(i).getSuit(), mainDeck.get(i).getValue());
            aiDeck.add(aiCard);
        }
    }

    public void calculateRound() {
        if (userDeck.get(0).getValue() < aiDeck.get(0).getValue()) {
            printRound(0);
            System.out.println("AI Win's Round");
            Card userCard = new Card(userDeck.get(0).getSuit(), userDeck.get(0).getValue());
            Card aiCard = new Card(aiDeck.get(0).getSuit(), aiDeck.get(0).getValue());
            aiDeck.add(userCard);
            userDeck.remove(0);
            aiDeck.remove(0);
            aiDeck.add(aiCard);
        }
        else if (userDeck.get(0).getValue() > aiDeck.get(0).getValue()) {
            printRound(0);
            System.out.println("User Wins Round");
            Card aiCard = new Card(aiDeck.get(0).getSuit(), aiDeck.get(0).getValue());
            Card userCard = new Card(userDeck.get(0).getSuit(), userDeck.get(0).getValue());
            userDeck.add(aiCard);
            aiDeck.remove(0);
            userDeck.remove(0);
            userDeck.add(userCard);
        }
        else if (userDeck.get(0).getValue() == aiDeck.get(0).getValue()) {
            printRound(0);
            System.out.println("Tie Round");
            tieRound();
        }
    }

    public void tieRound() {
        int i = 0;
        while (true) {
            i += 3;
            System.out.println("Flipping 3 cards...\n");
            if (userDeck.get(i).getValue() < aiDeck.get(i).getValue()) {
                printRound(i);
                System.out.println("AI Win's Round");
                while (i != 0) {
                    Card userCard = new Card(userDeck.get(i).getSuit(), userDeck.get(i).getValue());
                    aiDeck.add(userCard);
                    userDeck.remove(i);
                    i--;
                }
                break;
            }
            else if(userDeck.get(i).getValue() > aiDeck.get(i).getValue()) {
                printRound(i);
                System.out.println("User Wins Round");
                while (i != 0) {
                    Card aiCard = new Card(aiDeck.get(i).getSuit(), aiDeck.get(i).getValue());
                    userDeck.add(aiCard);
                    aiDeck.remove(i);
                    i--;
                }
                break;
            }
            printRound(i);
        }
    }

    public void printRound(int index) {
        System.out.println("");
        System.out.print("User: ");
        System.out.println(userDeck.get(index).getSuit() + " " + userDeck.get(index).getValue());
        System.out.println("vs");
        System.out.print("AI: ");
        System.out.println(aiDeck.get(index).getSuit() + " " + aiDeck.get(index).getValue());
        System.out.println("");
    }

    public boolean getUserEmpty() {
        return userDeck.isEmpty();
    }

    public boolean getAiEmpty() {
        return aiDeck.isEmpty();
    }

    //These methods were used for testing purposes only
//    public void printMainDeck() {
//        for (int i = 0; i < mainDeck.size(); i++) {
//            System.out.println(mainDeck.get(i).getSuit() + " " + mainDeck.get(i).getValue());
//        }
//    }
//
//    public void printUserDeck() {
//        for (int i = 0; i < userDeck.size(); i++) {
//            System.out.println(userDeck.get(i).getSuit() + " " + userDeck.get(i).getValue());
//        }
//    }
//
//    public void printAiDeck() {
//        for (int i = 0; i < aiDeck.size(); i++) {
//            System.out.println(aiDeck.get(i).getSuit() + " " + aiDeck.get(i).getValue());
//        }
//    }



}//end class
