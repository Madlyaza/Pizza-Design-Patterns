package com.jaffa.pizzaFactory.pizza;

public class SalamiPizza extends Pizza
{

    //the salami pizza
    public SalamiPizza()
    {
        super("Salami", "Regular Crust", "Tomato Sauce");
        this.toppings.add("Mozzarella");
        this.toppings.add("Salami");
    }
}
