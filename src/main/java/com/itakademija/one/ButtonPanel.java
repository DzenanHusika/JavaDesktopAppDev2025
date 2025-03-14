package com.itakademija.one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {
    private final JButton leftButton;
    private final JButton centerButton;
    private final JButton rightButton;

    public ButtonPanel(){
        Icon rightIcon = createIcon("right.gif");
        this.leftButton = new JButton("Disable middle button", rightIcon);
        this.leftButton.setMnemonic(KeyEvent.VK_A);
        this.leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        this.leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        LeftActionListener leftActionListener = new LeftActionListener();
        this.leftButton.addActionListener(leftActionListener);
        this.centerButton = new JButton("Middle button");
        this.rightButton = new JButton("Enable middle button");
        this.rightButton.setMnemonic(KeyEvent.VK_D);
        RightActionListener rightActionListener = new RightActionListener();
        this.rightButton.addActionListener(rightActionListener);
        add(leftButton);
        add(centerButton);
        add(rightButton);
    }

    private Icon createIcon(String path){
        ClassLoader classLoader = ButtonPanel   .class.getClassLoader();
        URL url = classLoader.getResource(path);
        if (url == null){
            System.err.println("Couldn't find resource: " + path);
            return null;
        }
        return new ImageIcon(url);
    }

    private class LeftActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Neko klikno na left button");
            ButtonPanel.this.centerButton.setEnabled(false);
        }
    }
    private class RightActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Neko klikno na right button");
            ButtonPanel.this.centerButton.setEnabled(true);
        }
    }
}
