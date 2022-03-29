package com.jaffa.orderObserver;

public class BleeperListener implements EventListener
{
    private String orderMessage = "BLEEP BLEEP";
    @Override
    public void update(Object orderMessage)
    {
        System.out.println(orderMessage);
    }
}
