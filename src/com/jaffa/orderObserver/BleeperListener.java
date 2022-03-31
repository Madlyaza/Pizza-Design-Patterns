package com.jaffa.orderObserver;

public class BleeperListener implements EventListener
{
    private String orderMessage = "BLEEP BLEEP";
    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}
