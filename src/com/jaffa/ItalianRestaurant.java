package com.jaffa;

import com.jaffa.pizzaBuilder.CalzonePizzaBuilder;
import com.jaffa.pizzaBuilder.Director;
import com.jaffa.pizzaBuilder.pizzas.Calzone;

public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        Director director = new Director();
        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
        director.constructCalzonePizza(builder);

        Calzone pizza = builder.getPizza();
        System.out.println(pizza.printInfo());
    }
}
