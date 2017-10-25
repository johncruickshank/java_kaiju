package com.example.john.kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by John on 25/10/2017.
 */

public class VehicleTest {

    Tank tank;
    Chopper chopper;

    @Before
    public void before() {
        tank = new Tank("Big", 100, 10);
        chopper = new Chopper("Fast", 75, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Big", tank.getType());
        assertEquals("Fast", chopper.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, tank.getHealthValue(), 0.1);
        assertEquals(75, chopper.getHealthValue(), 0.1);
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, tank.getAttackValue(), 0.1);
        assertEquals(30, chopper.getAttackValue(), 0.1);
    }

}
