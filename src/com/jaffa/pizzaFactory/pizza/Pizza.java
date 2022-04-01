package com.jaffa.pizzaFactory.pizza;

import java.util.ArrayList;

public abstract class Pizza
{
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    public Pizza(String name, String dough, String sauce)
    {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public String getName()
    {
        return name;
    }

    //Function to notify the user when is preparing
    public void prepare()
    {
        System.out.println("Preparing " + name);
    }

    //Function to notify the user when is baking
    public void bake()
    {
        System.out.println("Baking " + name);
    }

    //Function to notify the user when is cutting
    public void cut()
    {
        System.out.println("Cutting " + name);
    }

    //Function to notify the user when is boxing
    public void box()
    {
        System.out.println("Boxing " + name);
    }

    //Display the pizza
    public String toString()
    {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++)
        {
            display.append((String) toppings.get(i) + "\n");
        }
        return display.toString();
    }
}
