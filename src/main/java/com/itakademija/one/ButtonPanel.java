package com.itakademija.one;

import com.itakademija.one.icon.IconLoader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class ButtonPanel extends JPanel {
    private final IconLoader iconLoader = new IconLoader(ButtonPanel.class);
    private final JButton leftButton;
    private final JButton centerButton;
    private final JButton rightButton;

    public ButtonPanel(){
        Icon rightIcon = iconLoader.loadIcon("right.gif");
        this.leftButton = new JButton("Disable middle button", rightIcon);
        this.leftButton.setActionCommand("disable");
        this.leftButton.setMnemonic(KeyEvent.VK_A);
        this.leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        this.leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
//      LeftActionListener actionListener = new LeftActionListener();
//        ActionListener actionListener = this::onControlButtonClick;
        this.leftButton.addActionListener(this::onControlButtonClick);
        Icon centerIcon = iconLoader.loadIcon("middle.gif");
        this.centerButton = new JButton("Middle button", centerIcon);
        this.centerButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        this.centerButton.setHorizontalTextPosition(SwingConstants.CENTER);
        Icon leftIcon = iconLoader.loadIcon("left.gif");
        this.rightButton = new JButton("Enable middle button", leftIcon);
        this.rightButton.setMnemonic(KeyEvent.VK_D);
//      RightActionListener rightActionListener = new RightActionListener();
//        ActionListener rightActionListener = (e) -> onControlButtonClick(e);
        this.rightButton.addActionListener(this::onControlButtonClick);
        add(leftButton);
        add(centerButton);
        add(rightButton);
    }

    public void onControlButtonClick(ActionEvent actionEvent) {
        System.out.println("Neko je kliknuo ili na lijevi ili na desni dugmic");
        String command = actionEvent.getActionCommand();
        if (command != null && command.equals("disable")){
            this.centerButton.setEnabled(false);
        }else {
            this.centerButton.setEnabled(true);
        }
    }
//    private Icon createIcon(String path){
//        ClassLoader classLoader = ButtonPanel   .class.getClassLoader();
//        URL url = classLoader.getResource(path);
//        if (url == null){
//            System.err.println("Couldn't find resource: " + path);
//            return null;
//        }
//        return new ImageIcon(url);
//    }

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
