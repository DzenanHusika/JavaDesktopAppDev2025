package com.itakademija.two;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectNamePanel extends JPanel  {
    static String[]names = {"Faruk",  "Tarik","Jozo", "Andrej", "Jovan",   "Azur", "Emir",
                            "Dzenita","Marko","Boris","Gordana","Slobodan","Ivo",  "Nikla"};
    private final JLabel actionLabel = new JLabel("Odaberi sva imena koja završavaju na 'k'");
    private final JButton selectNameButton = new JButton("Pick a new name...");


    public SelectNamePanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(actionLabel);
        add(Box.createVerticalStrut(10));
        ActionListener openDialogListener = this::openNameChooserDialog;
        selectNameButton.addActionListener(openDialogListener);
        add(selectNameButton);
    }

    private void openNameChooserDialog(ActionEvent actionEvent) {
//        SelectNameDialog.showDialog(this, this, "", "", names);
    }
}
