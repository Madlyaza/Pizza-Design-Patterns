package com.jaffa;

import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;
import com.jaffa.pizzaFactory.pizza.Pizza;
import javax.swing.*;

import com.jaffa.interfaceCommander.OrderingSystem;

import java.awt.*;

public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        OrderingSystem orderingSystem = new OrderingSystem();
        orderingSystem.init();

//        Director director = new Director();
//        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
//        director.constructCalzonePizza(builder);
//
//        Calzone pizza = builder.getPizza();
//        System.out.println(pizza.printInfo());
    }

    ItalianRestaurant()
    {

    }
}
