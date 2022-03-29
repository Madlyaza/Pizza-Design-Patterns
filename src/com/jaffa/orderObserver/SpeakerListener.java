package com.jaffa.orderObserver;

public class SpeakerListener implements EventListener
{
    private String orderMessage = "*Attention* ORDER READY *Attention*";
    @Override
    public void update(Object orderMessage)
    {
        System.out.println(orderMessage);
    }
}