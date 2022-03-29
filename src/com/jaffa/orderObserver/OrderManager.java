package com.jaffa.orderObserver;

import java.util.*;

public class OrderManager
{
    private String orderReadyMessage;
    private List<EventListener> orderList = new ArrayList<>();

    public void subscribe(EventListener eventListener){
        this.orderList.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener){
        this.orderList.remove(eventListener);
    }

    public void notify(String orderReadyMessage){
        this.orderReadyMessage = orderReadyMessage;
        for (EventListener eventListener : this.orderList) {
            eventListener.update(this.orderReadyMessage);
        }
    }
}
