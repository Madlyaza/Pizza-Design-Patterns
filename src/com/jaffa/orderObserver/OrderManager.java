package com.jaffa.orderObserver;

import java.util.*;

/*
 * OrderManager manages updates and notifies all EventListeners
 */
public class OrderManager
{
    private List<EventListener> orderList = new ArrayList<>();

    /*Subcribes Eventlisteners to the OrderManager*/
    public void subscribe(EventListener eventListener)
    {
        this.orderList.add(eventListener);
    }

    /*Unsubcribes Eventlisteners to the OrderManager*/
    public void unsubscribe(EventListener eventListener)
    {
        this.orderList.remove(eventListener);
    }

    // Notifies event listeners of all changes
    public void notifyListener()
    {
        for (EventListener eventListener : this.orderList)
        {
            eventListener.update();
        }
    }
}
