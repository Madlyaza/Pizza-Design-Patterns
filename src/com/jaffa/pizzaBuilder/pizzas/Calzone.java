package com.jaffa.pizzaBuilder.pizzas;

import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;
import com.jaffa.pizzaBuilder.components.toppings.Toppings;

public class Calzone
{
    private final BaseType baseType;
    private final SauceType sauceType;
    private final Toppings toppings;


    public Calzone(BaseType baseType, SauceType sauceType, Toppings toppings)
    {
        this.baseType = baseType;
        this.sauceType = sauceType;
        this.toppings = toppings;
    }

    public BaseType getBaseType()
    {
        return baseType;
    }

    public SauceType getSauce()
    {
        return sauceType;
    }

    public Toppings getToppings()
    {
        return toppings;
    }

    //The info of the calzone displayed
    public String printInfo()
    {
        String info = "";
        info += "Base: " + baseType + "\n";
        if (sauceType != null)
        {
            info += "Sauce: " + sauceType + "\n";
        }
        if (!toppings.getToppings().isEmpty())
        {
            info += "Toppings: \n";
            for (ToppingType toppingType : toppings.getToppings())
            {
                info += "  - " + toppingType.name() + "\n";
            }
        }
        return info;
    }
}
