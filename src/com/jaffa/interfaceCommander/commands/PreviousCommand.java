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

    // The code that will be executed when the command gets called
    @Override
    public boolean execute(String previousChoice)
    {
        switch (previousChoice)
        {
            case "Custom Pizza", "Pre Build Pizza", "Bread":
                addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
                setLabel("Choose Order");
                orderingSystem.lastChoiceArray.pop();
                break;
            case "CALZONE", "FLAT":
                orderingSystem.builderMap.remove(previousChoice);
                addToComboBox(BaseType.names());
                setLabel("Choose Base");
                orderingSystem.lastChoiceArray.pop();
                break;
            case "BBQ", "TOMATO", "GARLIC":
                orderingSystem.builderMap.remove(previousChoice);
                setLabel("Choose Sauce");
                addToComboBox(SauceType.names());
                orderingSystem.lastChoiceArray.pop();
                break;
            case "CHEESE", "BACON", "EGG", "PEPPERONI", "PEPPER":
                orderingSystem.cb.addItem(previousChoice);
                orderingSystem.builderMap.remove(previousChoice);
                setLabel("Choose Topping");
                orderingSystem.lastChoiceArray.pop();
                break;
            default:
                return false;
        }
        return true;
    }
}
