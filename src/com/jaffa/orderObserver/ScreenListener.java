package com.jaffa.orderObserver;

public class ScreenListener implements EventListener
{
    private String orderMessage = "Order is ready!";
    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}
