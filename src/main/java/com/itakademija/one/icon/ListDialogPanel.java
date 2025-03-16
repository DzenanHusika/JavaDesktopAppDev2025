package com.itakademija.one.icon;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ListDialogPanel extends JPanel  {
    static String[]names = {"Faruk",  "Tarik","Jozo", "Andrej", "Jovan",   "Azur", "Emir",
                            "Dzenita","Marko","Boris","Gordana","Slobodan","Ivo",  "Nikla"};
    private final JLabel actionLabel = new JLabel("Odaberi sva imena koja završavaju na 'k'");
    private final JButton selectNameButton = new JButton("Pick a new name...");


    public ListDialogPanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(actionLabel);
        add(Box.createVerticalStrut(10));
        add(selectNameButton);
    }

    private void openListDialog(ActionEvent actionEvent) {
//        SelectNameDialog.showDialog(this, this, "", "", names);
    }
}
