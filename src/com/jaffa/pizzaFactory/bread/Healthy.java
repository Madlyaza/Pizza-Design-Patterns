package com.jaffa.pizzaFactory.bread;

public class Healthy implements Bread{
    @Override
    public void createFood() {
        System.out.println("You ordered a healthy sandwich!");
    }
}
