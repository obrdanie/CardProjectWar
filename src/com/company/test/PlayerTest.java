package com.company.test;

import org.junit.jupiter.api.Test;
import com.company.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player test = new Player("Daniel");
        assertEquals("Daniel", test.getName());
    }

    @Test
    void setName() {
        Player test = new Player("Daniel");
        test.setName("Bob");
        assertEquals("Bob", test.getName());
    }
}
