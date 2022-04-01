package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public class CancelCommand extends Command
{
    public CancelCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    // The code that will be executed when the command gets called
    @Override
    public boolean execute(String selectedChoice)
    {
        addToComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
        orderingSystem.label.setText("Choose order");
        orderingSystem.builderMap.clear();
        orderingSystem.lastChoiceArray.clear();
        return true;
    }
}
