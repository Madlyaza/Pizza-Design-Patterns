package com.jaffa.orderObserver;

/*
 * SpeakerListener implements the EventListener interface and executes it's own functionality in the update method
 */
public class SpeakerListener implements EventListener
{
    private String orderMessage = "*Attention* ORDER READY *Attention*";
    @Override
    public void update()
    {
        System.out.println(this.orderMessage);
    }
}