package com.jaffa.interfaceCommander;

import com.jaffa.interfaceCommander.commands.CancelCommand;
import com.jaffa.interfaceCommander.commands.NextCommand;
import com.jaffa.orderObserver.BleeperListener;
import com.jaffa.orderObserver.OrderManager;
import com.jaffa.orderObserver.ScreenListener;
import com.jaffa.orderObserver.SpeakerListener;
import com.jaffa.pizzaBuilder.CalzonePizzaBuilder;
import com.jaffa.pizzaBuilder.Director;
import com.jaffa.pizzaBuilder.FlatPizzaBuilder;
import com.jaffa.pizzaBuilder.pizzas.Calzone;
import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderingSystem
{
    public JComboBox cb = new JComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
    public JLabel label = new JLabel("Choose order");
    public Map<String, String> builderMap = new HashMap<>();

    public void init()
    {
        JFrame frame = new JFrame("Start Your Order");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlX = new JButton("Ctrl+X : Cancel");
        JButton ctrlV = new JButton("Ctrl+V : Next");
        JButton ctrlZ = new JButton("Ctrl+Z : Previous");



        OrderingSystem orderingSystem = this;

        ctrlX.addActionListener(e -> new CancelCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString()));
        ctrlV.addActionListener(e -> new NextCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString()));
        ctrlZ.addActionListener(e -> new CancelCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString()));

        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.add(label);
        frame.add(cb);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void pizzaFactoryCreator(String pizzaString)
    {
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        Creator factory = new Creator(pizzaFactory, breadFactory);
        factory.orderPizza(pizzaString);
    }

    public void breadFactoryCreator(String breadString)
    {
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        Creator factory = new Creator(pizzaFactory, breadFactory);
        factory.orderBread(breadString);
    }

    public void pizzaBuilder()
    {
        if(builderMap.get("BaseType").equals("CALZONE"))
        {
            calzoneBuilder();
        }
        else if(builderMap.get("BaseType").equals("FLAT"))
        {
            flatBuilder();
        }
    }

    public void calzoneBuilder()
    {
        Director director = new Director();
        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
        director.constructCalzonePizza(builder, builderMap);
        Calzone pizza = builder.getPizza();
        System.out.println(pizza.printInfo());
    }

    public void flatBuilder()
    {
        Director director = new Director();
        FlatPizzaBuilder builder = new FlatPizzaBuilder();
        director.constructFlatPizza(builder, builderMap);
        builder.getPizza().printInfo();
    }

    public void notifier()
    {
        OrderManager orderManager = new OrderManager();

        orderManager.subscribe(new ScreenListener());
        orderManager.subscribe(new BleeperListener());
        orderManager.subscribe(new SpeakerListener());
        orderManager.notifyListener();
    }

}
