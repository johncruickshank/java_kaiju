package com.example.john.kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 25/10/2017.
 */

public class TestFile {
    Godzilla godzilla;
    KingKong kingKong;
    Tank tank;
    Chopper chopper;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 100, 20);
        kingKong = new KingKong("King Kong", 100, 15);
        tank = new Tank("tank", 100, 10);
        chopper = new Chopper("chopper", 75, 30);
    }

    @Test
    public void kaijuCanAttack() {
        assertEquals("Godzilla attacked a tank! It now has 80hp left.", godzilla.attack(tank));
    }

    @Test
    public void kaijuCanMove() {
        assertEquals("Godzilla rises from the water to attack!", godzilla.move());
        assertEquals("King Kong swings into action!", kingKong.move());
    }

    @Test
    public void canPrimaryAttack() {
        assertEquals("Army tank attacked Godzilla! It now has 90hp left.", tank.primaryAttack(godzilla));
        assertEquals("Army chopper attacked King Kong! It now has 70hp left.", chopper.primaryAttack(kingKong));
    }

    @Test
    public void canSecondaryAttack() {
        assertEquals("Army tank hit Godzilla with a devastating attack! It now has 80hp left.", tank.secondaryAttack(godzilla));
        chopper.secondaryAttack(kingKong);
        assertEquals("Army chopper hit King Kong with a devastating attack! King Kong was destroyed!", chopper.secondaryAttack(kingKong));
    }
}
