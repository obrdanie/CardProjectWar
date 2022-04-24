package com.company.test;

import org.junit.jupiter.api.Test;
import com.company.GroupOfCards;
import com.company.Card;
import static org.junit.jupiter.api.Assertions.*;

class GroupOfCardsTest {

    @Test
    void createDeck() {
        GroupOfCards test = new GroupOfCards();
        test.createDeck();
        assertEquals(52, test.mainDeck.size());
    }

    @Test
    void shuffle() {
        GroupOfCards test = new GroupOfCards();
        test.createDeck();
        test.shuffle();
        Card card = new Card("Spades", 2);
        assertNotEquals(card, test.mainDeck.get(1));
    }

    @Test
    void splitDeck() {
        GroupOfCards test = new GroupOfCards();
        test.createDeck();
        test.splitDeck();
        assertEquals(26, test.userDeck.size());
    }

    @Test
    void getUserEmpty() {
        GroupOfCards test = new GroupOfCards();
        Card card = new Card("Spades", 2);
        test.aiDeck.add(card);
        assertEquals(true, test.getUserEmpty());
    }

    @Test
    void getAiEmpty() {
        GroupOfCards test = new GroupOfCards();
        Card card = new Card("Spades", 2);
        test.aiDeck.add(card);
        assertEquals(false, test.getAiEmpty());
    }
}
