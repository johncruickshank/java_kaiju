package com.example.john.kaiju;

import com.example.john.kaiju.Behaviours.Attacker;

/**
 * Created by John on 25/10/2017.
 */

public class KingKong extends Kaiju implements Attacker {
    public KingKong(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Thumps his chest and roars";
    }

    public String attack(Vehicle vehicle) {
        vehicle.healthValue -= this.attackValue;
        return this.name + " attacked a " + vehicle.type + "! It now has " + vehicle.healthValue + "hp left.";
    }

    public String move() {
        return this.name + " swings into action!";
    }

}
