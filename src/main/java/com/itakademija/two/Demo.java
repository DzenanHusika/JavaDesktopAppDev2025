package com.itakademija.two;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = Demo::createAndShowGUI;
        SwingUtilities.invokeLater(runnable);
    }
    private static void createAndShowGUI(){
        System.out.println(Thread.currentThread().getName());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JPanel panel = new CheckBoxPanel();
        frame.setContentPane(new SelectNamePanel());

        frame.setTitle("Graphical User Interface Demo");
        frame.pack();
        frame.setVisible(true);
    }
}
