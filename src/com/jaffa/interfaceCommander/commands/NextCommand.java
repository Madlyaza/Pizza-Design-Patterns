package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;
import com.jaffa.pizzaBuilder.components.bases.BaseType;
import com.jaffa.pizzaBuilder.components.sauces.SauceType;
import com.jaffa.pizzaBuilder.components.toppings.ToppingType;

import java.util.ArrayList;

public class NextCommand extends Command
{
    public NextCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    @Override
    public boolean execute(String selectedChoice)
    {
        switch (selectedChoice)
        {
            case "Custom Pizza":
                addToComboBox(BaseType.names());
                setLabel("Choose Base Type");
                break;
            case "Pre Build Pizza":
                addToComboBox(new String[]{"Margherita", "Salami", "Pepperoni"});
                setLabel("Choose Pizza");
                break;
            case "Bread":
                addToComboBox(new String[]{"Healthy", "Döner"});
                setLabel("Choose Bread");
                break;
            case "Margherita", "Salami", "Pepperoni":
                addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
                orderingSystem.label.setText("Choose order");
                orderingSystem.pizzaFactoryCreator(selectedChoice);
                break;
            case "Healthy", "Döner":
                addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
                orderingSystem.label.setText("Choose order");
                orderingSystem.breadFactoryCreator(selectedChoice);
                break;
            case "CALZONE", "FLAT":
                orderingSystem.builderMap.put("BaseType", selectedChoice);
                addToComboBox(SauceType.names());
                setLabel("Choose Sauce");
                break;
            case "BBQ", "TOMATO", "GARLIC":
                orderingSystem.builderMap.put("SauceType", selectedChoice);
                setLabel("Choose Toppings");
                ArrayList<String> strings = new ArrayList<>();
                for (ToppingType topping : ToppingType.values())
                {
                    strings.add(topping.name());
                }
                strings.add("Finished");

                addToComboBox(strings.toArray(new String[0]));
                break;
            case "CHEESE", "BACON", "EGG", "PEPPERONI", "PEPPER":
                orderingSystem.builderMap.put(selectedChoice, selectedChoice);
                removeFromComboBox(selectedChoice);
                break;
            case "Finished":
                addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
                orderingSystem.pizzaBuilder();
                setLabel("Choose order");
                orderingSystem.builderMap.clear();
                break;
            default:
                return false;
        }
        return true;
    }

    public void removeFromComboBox(String choice)
    {
        orderingSystem.cb.removeItem(choice);
    }

    public void setLabel(String text)
    {
        orderingSystem.label.setText(text);
    }
}
