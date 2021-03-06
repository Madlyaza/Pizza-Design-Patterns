package com.jaffa.pizzaBuilder;

import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

import java.util.Iterator;
import java.util.Map;

public class Director
{
    //constructs the calzone pizza
    public void constructCalzonePizza(PizzaBuilder builder, Map map)
    {
        builder.setPizzaBase(BaseType.CALZONE);
        builder.setPizzaSauce(SauceType.valueOf(map.get("SauceType").toString()));
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            if (!entry.getKey().equals("BaseType") && !entry.getKey().equals("SauceType"))
            {
                builder.setPizzaTopping(ToppingType.valueOf(entry.getValue()));
            }
        }
    }

    //constructs the flat pizza
    public void constructFlatPizza(PizzaBuilder builder, Map map)
    {
        builder.setPizzaBase(BaseType.FLAT);
        builder.setPizzaSauce(SauceType.valueOf(map.get("SauceType").toString()));
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            if (!entry.getKey().equals("BaseType") && !entry.getKey().equals("SauceType"))
            {
                builder.setPizzaTopping(ToppingType.valueOf(entry.getValue()));
            }
        }
    }
}
