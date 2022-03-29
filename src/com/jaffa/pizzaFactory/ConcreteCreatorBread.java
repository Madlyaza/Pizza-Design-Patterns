package com.jaffa.pizzaFactory;

import com.jaffa.pizzaFactory.bread.Bread;
import com.jaffa.pizzaFactory.bread.Döner;
import com.jaffa.pizzaFactory.bread.Healthy;

public class ConcreteCreatorBread {
    public Bread createBread(String breadType){
        if(breadType == null){
            return null;
        }
        if(breadType.equalsIgnoreCase("döner")){
            return new Döner();
        }
        else if(breadType.equalsIgnoreCase("healty")){
            return new Healthy();
        }

        return null;
    }
}
