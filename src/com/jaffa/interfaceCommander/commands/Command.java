package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public abstract class Command {
    public OrderingSystem orderingSystem;

    Command(OrderingSystem orderingSystem) {
        this.orderingSystem = orderingSystem;
    }

    public abstract boolean execute(String string);

    public void addToComboBox(String[] list)
    {
        orderingSystem.cb.removeAllItems();
        for (String item : list)
        {
            orderingSystem.cb.addItem(item);
        }
    }
}
