package com.jaffa.pizzaFactory.bread;

public class Döner extends Bread{

    //The Döner
    public Döner(){
        super("Döner", "Pita", "Garlic Sauce");
        this.toppings.add("Döner");
        this.toppings.add("Lettuce");
    }
}
