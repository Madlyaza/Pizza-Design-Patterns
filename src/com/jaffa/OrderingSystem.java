package com.jaffa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderingSystem
{
//    private CommandHistory history = new CommandHistory();

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
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //executeCommand(new CutCommand(orderingSystem));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //executeCommand(new PasteCommand(orderingSystem));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //undo();
            }
        });
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

//    private void executeCommand(Command command) {
//        if (command.execute()) {
//            history.push(command);
//        }
//    }
//
//    private void undo() {
//        if (history.isEmpty()) return;
//
//        Command command = history.pop();
//        if (command != null) {
//            command.undo();
//        }
//    }
}
