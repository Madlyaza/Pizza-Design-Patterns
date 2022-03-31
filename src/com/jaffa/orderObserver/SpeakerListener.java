package com.jaffa.orderObserver;

public class SpeakerListener implements EventListener
{
    private String orderMessage = "*Attention* ORDER READY *Attention*";
    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}