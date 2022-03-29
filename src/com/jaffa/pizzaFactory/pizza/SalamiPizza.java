package com.jaffa.pizzaFactory.pizza;

public class SalamiPizza implements Pizza{
    @Override
    public void createFood() {
        System.out.println("You ordered a pizza salami!");
    }
}
