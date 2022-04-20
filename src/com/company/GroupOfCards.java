//Daniel O'Brien - Anne Cho - Group Project - 3/5/2022
package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {


    String[] suit = {"Spades", "Diamond", "Clubs", "Hearts"};
    int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    ArrayList<Card> mainDeck;
    ArrayList<Card> userDeck;
    ArrayList<Card> aiDeck;

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


}//end class
