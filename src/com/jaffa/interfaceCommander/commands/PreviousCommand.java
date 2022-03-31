package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;
import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

import java.util.ArrayList;

public class PreviousCommand extends Command
{
    public PreviousCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    @Override
    public boolean execute(String previousChoice)
    {
//        switch (previousChoice)
//        {
//            case "Custom Pizza":
//
//                break;
//            case "Pre Build Pizza":
//
//                break;
//            case "Bread":
//
//                break;
//            case "Margherita", "Salami", "Pepperoni":
//
//                break;
//            case "Healthy", "Döner":
//
//                break;
//            case "CALZONE", "FLAT":
//
//                break;
//            case "BBQ", "TOMATO", "GARLIC":
//
//                break;
//            case "CHEESE", "BACON", "EGG", "PEPPERONI", "PEPPER":
//
//                break;
//            case "Finished":
//
//                break;
//            default:
//                return false;
//        }
        return true;
    }
}
