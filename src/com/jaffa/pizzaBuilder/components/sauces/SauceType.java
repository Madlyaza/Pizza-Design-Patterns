package com.jaffa.pizzaBuilder.components.sauces;

import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

import java.util.Arrays;

//Types of sauces
public enum SauceType
{
    BBQ, TOMATO, GARLIC;

    public static String[] names()
    {
        return Arrays.toString(SauceType.values()).replaceAll("^.|.$", "").split(", ");
    }
}
