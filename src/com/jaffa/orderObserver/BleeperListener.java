package com.jaffa.orderObserver;

/*
 * BleeperListener implements the EventListener interface and executes it's own functionality in the update method
 */
public class BleeperListener implements EventListener
{
    private String orderMessage = "BLEEP BLEEP";

    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}
