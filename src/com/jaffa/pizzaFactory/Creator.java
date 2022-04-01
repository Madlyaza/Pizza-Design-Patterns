package com.jaffa.pizzaFactory;

import com.jaffa.pizzaFactory.bread.Bread;
import com.jaffa.pizzaFactory.pizza.Pizza;

public class Creator
{
    protected ConcreteCreatorPizza pizzaFactory;
    protected ConcreteCreatorBread breadFactory;

    public Creator(ConcreteCreatorPizza pizzaFactory, ConcreteCreatorBread breadFactory)
    {
        this.pizzaFactory = pizzaFactory;
        this.breadFactory = breadFactory;
    }

    //order a pre build pizza
    public Pizza orderPizza(String type)
    {
        Pizza pizza;

        pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    //order a pre build sandwich
    public Bread orderBread(String type)
    {
        Bread bread;

        bread = breadFactory.createBread(type);

        bread.prepare();
        bread.bake();
        bread.box();

        return bread;
    }
}
