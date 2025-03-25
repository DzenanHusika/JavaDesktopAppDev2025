package com.itakademija.two.combo;

import com.itakademija.one.icon.CheckBoxPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EditableComboBoxPanel extends JPanel {
    private final String[] datePatterns = {
            "dd MMMMM yyyy",
            "dd.MM.yy",
            "MM/dd/yyyy",
            "yyyy.MM.dd G 'at' hh:mm:ss z",
            "yyyy.MMMMM.dd G hh:mm aaa"
    };

    private JLabel resultLabel;
    private String currentDateTimePattern;

    public EditableComboBoxPanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.currentDateTimePattern = datePatterns[0];

        JLabel patternLabel1 = new JLabel("Unesi pattern datuma");
        JLabel patternLabel2 = new JLabel("Odaberi vec postojeci pattern datuma");
        JComboBox<String> patternComboBox = new JComboBox<>(datePatterns);

        JLabel patternResultLabel = new JLabel("Trenutni datum/vrijeme formatirano", JLabel.LEADING);
        this.resultLabel = new JLabel(" ");
        this.resultLabel.setForeground(Color.BLACK);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
        Border emptyBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);
        this.resultLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel patternPanel = new JPanel();
        patternPanel.add(patternLabel1);
        patternPanel.add(patternLabel2);
        patternComboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        patternPanel.add(patternComboBox);

        JPanel resultPanel = new JPanel();
        resultPanel.add(patternResultLabel);
        resultPanel.add(this.resultLabel);

        add(patternPanel);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(resultPanel);

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        }
}
