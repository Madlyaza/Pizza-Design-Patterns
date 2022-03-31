package com.jaffa.orderObserver;

import java.util.*;

public class OrderManager
{
    private List<EventListener> orderList = new ArrayList<>();

    public void subscribe(EventListener eventListener){
        this.orderList.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener){
        this.orderList.remove(eventListener);
    }

    public void notifyListener(){
        for (EventListener eventListener : this.orderList) {
            eventListener.update();
        }
    }
}
