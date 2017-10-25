package com.example.john.kaiju;

import com.example.john.kaiju.Behaviours.Attacker;

/**
 * Created by John on 25/10/2017.
 */

public class Godzilla extends Kaiju implements Attacker {

    public Godzilla(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Emits a terrifying screech";
    }

    public String attack(Vehicle vehicle) {
        vehicle.healthValue -= this.attackValue;
        return this.name + " attacked a " + vehicle.type + "! It now has " + vehicle.healthValue + "hp left.";
    }

    public String move() {
        return this.name + " rises from the water to attack!";
    }

}
