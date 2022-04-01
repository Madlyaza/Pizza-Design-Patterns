package com.jaffa;

import com.jaffa.orderObserver.BleeperListener;
import com.jaffa.orderObserver.OrderManager;
import com.jaffa.orderObserver.ScreenListener;
import com.jaffa.orderObserver.SpeakerListener;
import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;
import com.jaffa.pizzaFactory.pizza.Pizza;

import javax.swing.*;

import com.jaffa.interfaceCommander.OrderingSystem;

import java.awt.*;

//the main of the Italian restaurant
public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        OrderingSystem orderingSystem = new OrderingSystem();
        orderingSystem.init();
    }
}
