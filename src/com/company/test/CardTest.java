package com.company.test;

import com.company.Card;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @org.junit.jupiter.api.Test
    void getSuit() {
        Card test = new Card("Clubs", 3);
        assertEquals("Clubs", test.getSuit());
    }

    @org.junit.jupiter.api.Test
    void setSuit() {
        Card test = new Card("Clubs", 3);
        test.setSuit("Spades");
        assertEquals("Spades", test.getSuit());
    }

    @org.junit.jupiter.api.Test
    void getValue() {
        Card test = new Card("Clubs", 3);
        assertEquals(3, test.getValue());
    }

    @org.junit.jupiter.api.Test
    void setValue() {
        Card test = new Card("Clubs", 3);
        test.setValue(4);
        assertEquals(4, test.getValue());
    }
}
