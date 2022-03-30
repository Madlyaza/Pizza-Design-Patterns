package com.jaffa.pizzaBuilder.components.bases;

import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

import java.util.Arrays;

public enum BaseType
{
    CALZONE, FLAT;

    public static String[] names() {
        return Arrays.toString(BaseType.values()).replaceAll("^.|.$", "").split(", ");
    }
}
