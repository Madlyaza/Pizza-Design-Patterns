package com.jaffa.pizzaBuilder.components.toppings;

import java.util.ArrayList;

public class Toppings
{
    private final ArrayList<ToppingType> toppings;

    public Toppings(ArrayList toppings)
    {
        this.toppings = toppings;
    }

    public void addTopping(ToppingType toppingType)
    {
        toppings.add(toppingType);
    }

    public ArrayList<ToppingType> getToppings()
    {
        return toppings;
    }
}
