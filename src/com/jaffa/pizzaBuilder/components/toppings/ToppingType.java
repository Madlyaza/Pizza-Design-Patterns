package com.jaffa.pizzaBuilder.components.toppings;


import java.util.Arrays;

//Types of toppings
public enum ToppingType
{
    CHEESE, BACON, EGG, PEPPERONI, PEPPER;

    public static String[] names()
    {
        return Arrays.toString(ToppingType.values()).replaceAll("^.|.$", "").split(", ");
    }
}
