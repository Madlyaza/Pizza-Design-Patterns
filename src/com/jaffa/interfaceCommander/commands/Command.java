package com.jaffa.interfaceCommander.commands;

import com.jaffa.interfaceCommander.OrderingSystem;

public abstract class Command {
    public OrderingSystem orderingSystem;
    private String backup;

    Command(OrderingSystem orderingSystem) {
        this.orderingSystem = orderingSystem;
    }

    void backup() {
        //backup = orderingSystem.textField.getText();
    }

    public void undo() {
        //orderingSystem.textField.setText(backup);
    }

    public abstract boolean execute(String string);
}
