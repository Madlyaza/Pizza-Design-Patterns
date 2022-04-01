package com.jaffa.pizzaFactory.bread;

import java.util.ArrayList;

public abstract class Bread {
    protected String name;
    protected String bread;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public Bread(String name, String bread, String sauce){
        this.name = name;
        this.bread = bread;
        this.sauce = sauce;
    }


    public String getName(){
        return name;
    }

    //Function to notify the user when is preparing
    public void prepare() {
        System.out.println("Preparing " + name);
    }

    //Function to notify the user when is baking
    public void bake() {
        System.out.println("Baking " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(bread + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String) toppings.get(i) + "\n");
        }
        return display.toString();
    }
}
