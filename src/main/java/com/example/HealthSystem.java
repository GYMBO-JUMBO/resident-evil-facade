package com.example;

public class HealthSystem {
    private int health = 50;
    public void checkHealthBar(){
        System.out.println("Current HP is: " + health);
    }
    public void heal(){
        if(health < 100){
            health = 100;
            System.out.println("Player is already at full health.");
        }
    }
}
