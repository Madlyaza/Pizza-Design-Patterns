package com.jaffa.pizzaBuilder;

import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

public interface PizzaBuilder
{
    void setPizzaBase(BaseType baseType);
    void setPizzaSauce(SauceType sauceType);
    void setPizzaTopping(ToppingType toppingType);
}
