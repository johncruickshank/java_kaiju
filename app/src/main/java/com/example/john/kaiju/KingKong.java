package com.example.john.kaiju;

import com.example.john.kaiju.Behaviours.Action;

/**
 * Created by John on 25/10/2017.
 */

public class KingKong extends Kaiju implements Action {
    public KingKong(String name, Integer healthValue, Integer attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return "Thumps his chest and roars";
    }


    public String move() {
        return this.name + " swings into action!";
    }

}
