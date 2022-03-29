package com.jaffa.pizzaFactory;

import com.jaffa.pizzaFactory.bread.Bread;
import com.jaffa.pizzaFactory.pizza.Pizza;

public class Creator
{
    private Pizza pizza;
    private Bread bread;

    public Creator(ConcreteCreatorPizza pizzaFactory, ConcreteCreatorBread breadFactory) {
        pizza = pizzaFactory.createPizza("pizzatype");
        bread = breadFactory.createBread("breadtype");
    }

    public void createFood(){
        pizza.createFood();
        bread.createFood();
    }
}
