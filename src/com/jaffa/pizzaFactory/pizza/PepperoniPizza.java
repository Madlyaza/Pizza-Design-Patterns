package com.jaffa.pizzaFactory.pizza;

public class PepperoniPizza extends Pizza{

    //The pepperoni pizza
    public PepperoniPizza(){
        super("Pepperoni", "Crispy Crust", "Tomato Sauce");
        this.toppings.add("Mozzarella");
        this.toppings.add("Pepperoni");
    }
}
