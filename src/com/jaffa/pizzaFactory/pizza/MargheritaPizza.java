package com.jaffa.pizzaFactory.pizza;

public class MargheritaPizza extends Pizza
{

    //The margherita pizza
    public MargheritaPizza()
    {
        super("Margherita", "Regular Crust", "Tomato Sauce");
        this.toppings.add("Cheese");
    }
}
