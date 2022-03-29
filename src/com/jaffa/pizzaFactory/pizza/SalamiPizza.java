package com.jaffa.pizzaFactory.pizza;

public class SalamiPizza extends Pizza{
    public SalamiPizza(){
        super("Salami", "Regular Crust", "Tomato Sauce");
        this.toppings.add("Mozzarella");
        this.toppings.add("Salami");
    }
}
