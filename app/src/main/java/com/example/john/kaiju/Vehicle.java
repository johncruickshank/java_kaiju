package com.example.john.kaiju;

/**
 * Created by John on 25/10/2017.
 */

public abstract class Vehicle {

    String type;
    Integer healthValue;
    Integer attackValue;

    public Vehicle(String type, Integer healthValue, Integer attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public Integer getAttackValue() {
        return attackValue;
    }
}
