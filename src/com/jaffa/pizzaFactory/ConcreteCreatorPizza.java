package com.jaffa.pizzaFactory;

import com.jaffa.pizzaFactory.pizza.MargheritaPizza;
import com.jaffa.pizzaFactory.pizza.PepperoniPizza;
import com.jaffa.pizzaFactory.pizza.Pizza;
import com.jaffa.pizzaFactory.pizza.SalamiPizza;

//check the type of pizza
public class ConcreteCreatorPizza {
    public Pizza createPizza(String pizzaType) {
        if(pizzaType == null){
            return null;
        }
        if(pizzaType.equalsIgnoreCase("margherita")){
            return new MargheritaPizza();
        }
        else if(pizzaType.equalsIgnoreCase("pepperoni")){
            return new PepperoniPizza();
        }
        else if(pizzaType.equalsIgnoreCase("salami")){
            return new SalamiPizza();
        }

        return null;
    }
}
