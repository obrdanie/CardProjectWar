package com.company.test;

import org.junit.jupiter.api.Test;
import com.company.Game;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void play() {
        Game test = new Game();
        assertNotNull(test);
    }
}
