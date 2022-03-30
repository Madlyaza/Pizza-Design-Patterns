package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public class PreviousCommand extends Command
{
    public PreviousCommand(OrderingSystem orderingSystem)
    {
        super(orderingSystem);
    }

    @Override
    public boolean execute(String string)
    {

        return true;
    }
}
