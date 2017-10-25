package com.example.john.kaiju;

/**
 * Created by John on 25/10/2017.
 */

public class Tank extends Vehicle {
    public Tank(String type, Integer healthValue, Integer attackValue) {
        super(type, healthValue, attackValue);
    }

    public String primaryAttack(Kaiju kaiju) {
        kaiju.healthValue -= this.attackValue;
        return "Army " + this.type + " attacked " + kaiju.name + "! It now has " + kaiju.healthValue + "hp left.";
    }

    public String secondaryAttack(Kaiju kaiju) {
        kaiju.healthValue -= (this.attackValue * 2);
        if (kaiju.healthValue > 0)
            return "Army " + this.type + " hit " + kaiju.name + " with a devastating attack! It now has " + kaiju.healthValue + "hp left.";
        else return "Army " + this.type + " hit " + kaiju.name + " with a devastating attack! " + kaiju.name + " was destroyed!";
}

}
