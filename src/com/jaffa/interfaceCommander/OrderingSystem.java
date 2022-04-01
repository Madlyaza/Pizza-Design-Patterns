package com.jaffa.interfaceCommander;

import com.jaffa.interfaceCommander.commands.CancelCommand;
import com.jaffa.interfaceCommander.commands.NextCommand;
import com.jaffa.orderObserver.BleeperListener;
import com.jaffa.orderObserver.OrderManager;
import com.jaffa.orderObserver.ScreenListener;
import com.jaffa.orderObserver.SpeakerListener;
import com.jaffa.interfaceCommander.commands.PreviousCommand;
import com.jaffa.pizzaBuilder.CalzonePizzaBuilder;
import com.jaffa.pizzaBuilder.Director;
import com.jaffa.pizzaBuilder.FlatPizzaBuilder;
import com.jaffa.pizzaBuilder.pizzas.Calzone;
import com.jaffa.pizzaFactory.ConcreteCreatorBread;
import com.jaffa.pizzaFactory.ConcreteCreatorPizza;
import com.jaffa.pizzaFactory.Creator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class OrderingSystem
{
    public JComboBox cb = new JComboBox(new String[]{"Custom Pizza", "Pre Build Pizza", "Bread"});
    public JLabel label = new JLabel("Choose order");
    public Map<String, String> builderMap = new HashMap<>();
    public ArrayList<Integer> keyCodes;
    OrderingSystem orderingSystem = this;
    public Stack<String> lastChoiceArray;

    // Initializes the GUI and all its components
    public void init()
    {
        this.lastChoiceArray = new Stack<>();
        this.keyCodes = new ArrayList<>();
        KeyListener keyListener = new ShortcutListener();
        JFrame frame = new JFrame("Start Your Order");
        JPanel content = new JPanel();
        content.addKeyListener(keyListener);
        content.setFocusable(true);
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttons.setFocusable(false);
        JButton ctrlX = new JButton("Ctrl+X : Cancel");
        JButton ctrlC = new JButton("Ctrl+C : Next");
        JButton ctrlZ = new JButton("Ctrl+Z : Previous");
        ctrlC.setFocusable(false);
        ctrlZ.setFocusable(false);
        ctrlX.setFocusable(false);
        cb.setFocusable(false);
        label.setFocusable(false);

        ctrlX.addActionListener(e -> new CancelCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString()));
        ctrlC.addActionListener(e -> new NextCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString()));
        ctrlZ.addActionListener(e ->
        {
            if(lastChoiceArray.size() > 0)
            {
                new PreviousCommand(orderingSystem).execute(lastChoiceArray.lastElement());
            }
        });

        buttons.add(ctrlX);
        buttons.add(ctrlC);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.add(label);
        frame.add(cb);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Creates the pizza factory for ordering a pizza
    public void pizzaFactoryCreator(String pizzaString)
    {
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        Creator factory = new Creator(pizzaFactory, breadFactory);
        factory.orderPizza(pizzaString);
    }

    // Creates the bread factory for ordering bread
    public void breadFactoryCreator(String breadString)
    {
        ConcreteCreatorPizza pizzaFactory = new ConcreteCreatorPizza();
        ConcreteCreatorBread breadFactory = new ConcreteCreatorBread();
        Creator factory = new Creator(pizzaFactory, breadFactory);
        factory.orderBread(breadString);
    }

    // Calls the pizza builder for creating a custom pizza
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

    // Creates the pizza builder for calzone custom pizza
    public void calzoneBuilder()
    {
        Director director = new Director();
        CalzonePizzaBuilder builder = new CalzonePizzaBuilder();
        director.constructCalzonePizza(builder, builderMap);
        Calzone pizza = builder.getPizza();
        System.out.println(pizza.printInfo());
    }

    // Creates the pizza builder for flat custom pizza
    public void flatBuilder()
    {
        Director director = new Director();
        FlatPizzaBuilder builder = new FlatPizzaBuilder();
        director.constructFlatPizza(builder, builderMap);
        builder.getPizza().printInfo();
    }

    // Calls the notifier so that people get notified of their order
    public void notifier()
    {
        OrderManager orderManager = new OrderManager();

        orderManager.subscribe(new ScreenListener());
        orderManager.subscribe(new BleeperListener());
        orderManager.subscribe(new SpeakerListener());
        orderManager.notifyListener();
    }

    // The keyboard listener listens to the keyboard inputs and executes the commands
    public class ShortcutListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(keyCodes.contains(17)) // Ctrl
            {
                if(e.getKeyCode() == 67) // C
                {
                    new NextCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString());
                }
                else if(e.getKeyCode() == 90) // Z
                {
                    if(lastChoiceArray.size() > 0)
                    {
                        new PreviousCommand(orderingSystem).execute(Objects.requireNonNull(lastChoiceArray.lastElement()));
                    }
                }
                else if(e.getKeyCode() == 88) //X
                {
                    new CancelCommand(orderingSystem).execute(Objects.requireNonNull(cb.getSelectedItem()).toString());
                }
            }
            if(e.getKeyCode() == 17) // Ctrl
            {
                keyCodes.add(e.getKeyCode());
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode() == 17) // Ctrl
            {
                keyCodes.clear();
            }
        }
    }
}
