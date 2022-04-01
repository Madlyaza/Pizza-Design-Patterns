package com.jaffa.orderObserver;

/*
 * ScreenListener implements the EventListener interface and executes it's own functionality in the update method
 */
public class ScreenListener implements EventListener
{
    private String orderMessage = "Order is ready!";
    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}
