package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public abstract class Command
{
    public OrderingSystem orderingSystem;

    Command(OrderingSystem orderingSystem)
    {
        this.orderingSystem = orderingSystem;
    }

    public abstract boolean execute(String string);

    // Adds the given string list to the combo box
    public void addToComboBox(String[] list)
    {
        orderingSystem.cb.removeAllItems();
        for (String item : list)
        {
            orderingSystem.cb.addItem(item);
        }
    }

    // Sets the label on the GUI
    public void setLabel(String text)
    {
        orderingSystem.label.setText(text);
    }

    // Removes the given choice from the combo box
    public void removeFromComboBox(String choice)
    {
        orderingSystem.cb.removeItem(choice);
    }
}
