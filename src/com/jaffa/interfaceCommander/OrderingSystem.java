package com.jaffa.interfaceCommander;

import com.jaffa.interfaceCommander.commands.CancelCommand;
import com.jaffa.interfaceCommander.commands.Command;
import com.jaffa.interfaceCommander.commands.NextCommand;
import com.jaffa.pizzaBuilder.components.bases.BaseType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderingSystem
{
    public void init()
    {
        String currentPage;
        JFrame frame = new JFrame("Start Your Order");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlX = new JButton("Ctrl+X : Cancel");
        JButton ctrlV = new JButton("Ctrl+V : Next");
        JButton ctrlZ = new JButton("Ctrl+Z : Previous");

        JLabel label = new JLabel();
        label.setText("test");

        JComboBox cb = new JComboBox(BaseType.values());

        OrderingSystem orderingSystem = this;

        ctrlX.addActionListener(e -> new CancelCommand(orderingSystem));
        ctrlV.addActionListener(e -> new NextCommand(orderingSystem));
        ctrlZ.addActionListener(e -> new CancelCommand(orderingSystem));

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
}
