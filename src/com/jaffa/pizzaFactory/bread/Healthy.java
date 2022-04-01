package com.jaffa.pizzaFactory.bread;

public class Healthy extends Bread{

    //The healthy sandwich
    public Healthy(){
        super("Healthy", "Pistolet", "Honey Mustard sauce");
        this.toppings.add("Lettuce");
        this.toppings.add("Cheese");
        this.toppings.add("Ham");
        this.toppings.add("Eggs");
        this.toppings.add("Cucumber");
        this.toppings.add("Tomato");
    }
}
