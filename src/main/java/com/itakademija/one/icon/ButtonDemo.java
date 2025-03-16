package com.itakademija.one.icon;

import javax.swing.*;

public class ButtonDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = ButtonDemo::createAndShowGUI;
        SwingUtilities.invokeLater(runnable);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame();
        System.out.println(Thread.currentThread().getName());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Button Demo");
//        ButtonPanel buttonPanel = new ButtonPanel();
//        JPanel panel = new ListDialogPanel();
        frame.setContentPane(new CheckBoxPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
