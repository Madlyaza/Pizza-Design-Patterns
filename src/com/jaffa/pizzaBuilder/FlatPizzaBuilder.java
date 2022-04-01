package com.jaffa.pizzaBuilder;

import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;
import com.jaffa.pizzaBuilder.components.toppings.Toppings;
import com.jaffa.pizzaBuilder.pizzas.Flat;

import java.util.ArrayList;

public class FlatPizzaBuilder implements PizzaBuilder
{
    private BaseType baseType;
    private SauceType sauceType;
    private Toppings toppings = new Toppings(new ArrayList());

    @Override
    public void setPizzaBase(BaseType baseType)
    {
        this.baseType = baseType;
    }

    @Override
    public void setPizzaSauce(SauceType sauceType)
    {
        this.sauceType = sauceType;
    }

    @Override
    public void setPizzaTopping(ToppingType toppingType)
    {
        this.toppings.addTopping(toppingType);
    }

    //Returns the flat pizza
    public Flat getPizza()
    {
        return new Flat(baseType, sauceType, toppings);
    }
}
