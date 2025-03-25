package com.itakademija.two;

import com.itakademija.two.combo.ComboBoxPanel;
import com.itakademija.two.combo.EditableComboBoxPanel;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Runnable runnable = Demo::createAndShowGUI;
        SwingUtilities.invokeLater(runnable);
    }
    private static void createAndShowGUI(){

        System.out.println(Thread.currentThread().getName());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new ComboBoxPanel();
        frame.setContentPane(new EditableComboBoxPanel());
        frame.setTitle("Graphical User Interface Demo");
        frame.setMinimumSize(new Dimension(300,300));
        frame.setVisible(true);
    }
}
