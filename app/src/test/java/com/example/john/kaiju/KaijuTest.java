package com.example.john.kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 25/10/2017.
 */

public class KaijuTest {
    Godzilla godzilla;
    KingKong kingKong;

    @Before
    public void before() {
        godzilla = new Godzilla("Geoff", 100, 20);
        kingKong = new KingKong("Albert", 100, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Geoff", godzilla.getName());
        assertEquals("Albert", kingKong.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, godzilla.getHealthValue(), 0.1);
        assertEquals(100, kingKong.getHealthValue(), 0.1);
    }

    @Test
    public void hasAttackValue() {
        assertEquals(20, godzilla.getAttackValue(), 0.1);
        assertEquals(15, kingKong.getAttackValue(), 0.1);
    }

    @Test
    public void canRoar() {
        assertEquals("Emits a terrifying screech", godzilla.roar());
        assertEquals("Thumps his chest and roars", kingKong.roar());
    }

}
