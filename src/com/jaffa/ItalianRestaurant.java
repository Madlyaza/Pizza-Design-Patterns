package com.jaffa;

import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;
import com.jaffa.pizzaFactory.pizza.Pizza;

public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        Creator factory = new Creator(pizzaFactory, breadFactory);

        Pizza pizza1 = factory.orderPizza("Margherita");
        System.out.println("We ordered a " + pizza1.getName() + "\n");
    }
}
