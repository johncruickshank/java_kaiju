package com.example.john.kaiju;

import com.example.john.kaiju.Behaviours.Action;

/**
 * Created by John on 25/10/2017.
 */

public class Godzilla extends Kaiju implements Action {

    public Godzilla(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Emits a terrifying screech";
    }

    public String move() {
        return this.name + " rises from the water to attack!";
    }

}
