package com.jaffa.pizzaFactory.bread;

public class Döner implements Bread{

    @Override
    public void createFood() {
        System.out.println("You ordered a Döner!");
    }
}
