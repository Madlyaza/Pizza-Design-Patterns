package com.jaffa.pizzaFactory.pizza;

public class MargheritaPizza implements Pizza{
    @Override
    public void createFood() {
        System.out.println("You ordered a pizza margherita");
    }
}
