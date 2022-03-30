package com.jaffa;

import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;
import com.jaffa.pizzaFactory.pizza.Pizza;
import javax.swing.*;
import com.jaffa.pizzaBuilder.CalzonePizzaBuilder;
import com.jaffa.pizzaBuilder.Director;
import com.jaffa.pizzaBuilder.pizzas.Calzone;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        Creator factory = new Creator(pizzaFactory, breadFactory);

        Pizza pizza1 = factory.orderPizza("Margherita");
        System.out.println("We ordered a " + pizza1.getName() + "\n");
        OrderingSystem orderingSystem = new OrderingSystem();
        orderingSystem.init();
//        Director director = new Director();
//        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
//        director.constructCalzonePizza(builder);
//
//        Calzone pizza = builder.getPizza();
//        System.out.println(pizza.printInfo());
    }

    ItalianRestaurant()
    {
        JFrame holdingFrame = new JFrame();
        holdingFrame.setSize(800, 800);
        holdingFrame.setLayout(null);
        holdingFrame.setVisible(true);
        holdingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        holdingFrame.setResizable(false);
        holdingFrame.setBackground(Color.yellow);

        JPanel topBar = new JPanel();
        topBar.setSize(800, 200);
        topBar.setAlignmentY(Component.TOP_ALIGNMENT);
        topBar.setLayout(null);
        topBar.setVisible(true);
        topBar.setBackground(Color.blue);


        JPanel landingPage = new JPanel();
        landingPage.setSize(800, 600);
        landingPage.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        landingPage.setBackground(Color.red);
        landingPage.setLayout(null);
        landingPage.setVisible(true);

        JPanel orderPage = new JPanel();
        orderPage.setSize(800, 600);
        orderPage.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        orderPage.setLayout(null);
        orderPage.setVisible(true);
        orderPage.setBackground(Color.pink);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(0, 0, 100 ,40);
        cancel.setVisible(true);

        JButton next = new JButton("Next");
        next.setBounds(200, 0, 100, 40);
        next.setVisible(true);

        JButton prev = new JButton("Previous");
        prev.setBounds(100, 0, 100, 40);
        prev.setVisible(true);

        JButton order = new JButton("Start Order");
        order.setBounds(0, 0, 100, 40);

        JButton margarita = new JButton("Margarita");
        margarita.setBounds(300, 300, 100, 100);
        margarita.setVisible(false);

        JButton hawaii = new JButton("Hawaii");
        hawaii.setBounds(400, 300, 100, 100);
        hawaii.setVisible(false);

        JButton pepperoni = new JButton("Pepperoni");
        pepperoni.setBounds(300, 400, 100, 100);
        pepperoni.setVisible(false);

        JButton custom = new JButton("custom");
        custom.setBounds(400, 400, 100, 100);
        custom.setVisible(false);

        JButton addPizza = new JButton("Add Pizza");
        addPizza.setBounds(0, 40, 100, 40);

        JButton flat = new JButton("Flat");
        flat.setBounds(350, 300, 100, 100);

        JButton calzone = new JButton("Calzone");
        calzone.setBounds(350, 400, 100, 100);

        JButton bbq = new JButton("BBQ Sauce");
        bbq.setBounds(350, 400, 100, 100);

        JButton tomato = new JButton("Tomato Sauce");
        tomato.setBounds(350, 400, 100, 100);

        JButton garlic = new JButton("Garlic Sauce");
        garlic.setBounds(350, 400, 100, 100);

        order.addActionListener(e ->
        {
            holdingFrame.remove(landingPage);
            holdingFrame.add(orderPage);
//            landingPage.setVisible(false);
//            orderPage.setVisible(true);
//            addPizza.setVisible(true);
//            margarita.setVisible(false);
//            hawaii.setVisible(false);
//            pepperoni.setVisible(false);
//            custom.setVisible(false);
//            flat.setVisible(false);
//            calzone.setVisible(false);
        });

        addPizza.addActionListener(e ->
        {
            margarita.setVisible(true);
            hawaii.setVisible(true);
            pepperoni.setVisible(true);
            custom.setVisible(true);
        });

        cancel.addActionListener(e ->
        {
            landingPage.setVisible(true);

            orderPage.setVisible(false);
            margarita.setVisible(false);
            hawaii.setVisible(false);
            pepperoni.setVisible(false);
            custom.setVisible(false);
            flat.setVisible(false);
            calzone.setVisible(false);
        });

        custom.addActionListener(e ->
        {
            addPizza.setVisible(false);
            margarita.setVisible(false);
            hawaii.setVisible(false);
            pepperoni.setVisible(false);
            custom.setVisible(false);

            flat.setVisible(true);
            calzone.setVisible(true);
        });

        flat.addActionListener(e ->
        {
            calzone.setVisible(false);
            flat.setVisible(false);
        });

        calzone.addActionListener(e ->
        {
            calzone.setVisible(false);
            flat.setVisible(false);
        });

        holdingFrame.add(landingPage);
        holdingFrame.add(topBar);

        topBar.add(cancel);
        topBar.add(next);
        topBar.add(prev);


        orderPage.add(addPizza);
    }
}
