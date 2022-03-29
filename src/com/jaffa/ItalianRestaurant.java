package com.jaffa;

import javax.swing.*;
import com.jaffa.pizzaBuilder.CalzonePizzaBuilder;
import com.jaffa.pizzaBuilder.Director;
import com.jaffa.pizzaBuilder.pizzas.Calzone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItalianRestaurant
{
    public static void main(String[] args)
    {
        JFrame landingPage = new JFrame();
        landingPage.setSize(800, 800);
        landingPage.setLayout(null);
        landingPage.setVisible(true);
        landingPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame orderPage = new JFrame();
        orderPage.setSize(800, 800);
        orderPage.setLayout(null);
        orderPage.setVisible(false);
        orderPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(0, 0, 100 ,40);
        cancel.addActionListener(e ->
        {
            landingPage.setVisible(true);
            orderPage.setVisible(false);
        });

        JButton next = new JButton("Next");
        next.setBounds(100, 0, 100, 40);

        JButton prev = new JButton("Previous");
        prev.setBounds(200, 0, 100, 40);

        JButton order = new JButton("Start Order");
        order.setBounds(0, 0, 100, 40);
        order.addActionListener(e ->
        {
            landingPage.setVisible(false);
            orderPage.setVisible(true);
        });

        landingPage.add(order);

        orderPage.add(cancel);
        orderPage.add(next);
        orderPage.add(prev);

//        Director director = new Director();
//        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
//        director.constructCalzonePizza(builder);
//
//        Calzone pizza = builder.getPizza();
//        System.out.println(pizza.printInfo());
    }
}
