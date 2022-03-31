package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public class CancelCommand extends Command
{
    public CancelCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    @Override
    public boolean execute(String selectedChoice)
    {
        addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
        orderingSystem.label.setText("Choose order");
        orderingSystem.builderMap.clear();
        return true;
    }
}
