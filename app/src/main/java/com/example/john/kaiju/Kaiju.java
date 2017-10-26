package com.example.john.kaiju;

/**
 * Created by John on 25/10/2017.
 */

public abstract class Kaiju {

    String name;
    Integer healthValue;
    Integer attackValue;

    public Kaiju(String name, Integer healthValue, Integer attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName(){
        return this.name;
    }

    public Integer getHealthValue() {
        return healthValue;
    }

    public Integer getAttackValue() {
        return attackValue;
    }

    public String attack(Vehicle vehicle) {
        vehicle.healthValue -= this.attackValue;
        return this.name + " attacked a " + vehicle.type + "! It now has " + vehicle.healthValue + "hp left.";
    }


}
