package com.jaffa.pizzaFactory.pizza;

public class PepperoniPizza implements Pizza{
    @Override
    public void createFood() {
        System.out.println("You ordered a pizza pepperoni!");
    }
}
