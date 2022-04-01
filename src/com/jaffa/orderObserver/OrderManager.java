package com.jaffa.orderObserver;

import java.util.*;
/*
* OrderManager manages updates and notifies all EventListeners
*/
public class OrderManager
{
    private List<EventListener> orderList = new ArrayList<>();

    /*Subcribes Eventlisteners to the OrderManager*/
    public void subscribe(EventListener eventListener){
        this.orderList.add(eventListener);
    }

    /*Unsubcribes Eventlisteners to the OrderManager*/
    public void unsubscribe(EventListener eventListener){
        this.orderList.remove(eventListener);
    }

<<<<<<< Updated upstream
    public void notifyListener(){
=======
    /*Notifies Eventlisteners of all changes*/
    public void notify(String orderReadyMessage){
        this.orderReadyMessage = orderReadyMessage;
>>>>>>> Stashed changes
        for (EventListener eventListener : this.orderList) {
            eventListener.update();
        }
    }
}
