package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public class CancelCommand extends Command
{
    public CancelCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    @Override
    public boolean execute(String string)
    {

        return true;
    }
}
