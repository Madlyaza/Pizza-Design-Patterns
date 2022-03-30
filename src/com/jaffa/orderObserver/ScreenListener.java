package com.jaffa.orderObserver;

public class ScreenListener implements EventListener
{
    private String orderMessage = "Order is ready!";
    @Override
    public void update(Object orderMessage)
    {
        System.out.println(orderMessage);
    }
}
