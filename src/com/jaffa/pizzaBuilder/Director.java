package com.jaffa.pizzaBuilder;

import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

public class Director
{
    public void constructCalzonePizza(PizzaBuilder builder)
    {
        builder.setPizzaBase(BaseType.CALZONE);
        builder.setPizzaSauce(SauceType.BBQ);
        builder.setPizzaTopping(ToppingType.BACON);
        builder.setPizzaTopping(ToppingType.EGG);
        builder.setPizzaTopping(ToppingType.CHEESE);
    }

    public void constructFlatPizza(PizzaBuilder builder)
    {
        builder.setPizzaBase(BaseType.FLAT);
        builder.setPizzaSauce(SauceType.GARLIC);
        builder.setPizzaTopping(ToppingType.PEPPER);
        builder.setPizzaTopping(ToppingType.PEPPERONI);
        builder.setPizzaTopping(ToppingType.CHEESE);
    }
}
