package com.itakademija.two;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SelectNameDialog extends JDialog {

    private static String value;

    private final JList<String> list;

    private final JButton cancelButton = new JButton("Cancel");
    private final JButton setButton = new JButton("set");


    public SelectNameDialog(Frame frame,
                            Component locationComponent,
                            String labelText,
                            String title,
                            String[] data,
                            String initialValue,
                            String longValue){
        super(frame, title, true);
        this.list = new JList<>(data);
        this.list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        this.list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        this.list.setVisibleRowCount(-1);
//        this.list.addMouseListener();
        JScrollPane scrollPane = new JScrollPane(this.list);
        scrollPane.setPreferredSize(new Dimension(250, 80));

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.PAGE_AXIS));
        JLabel label = new JLabel(labelText);
        label.setLabelFor(list);
        listPanel.add(label);
        listPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        buttonPanel.add(Box.createGlue());
        buttonPanel.add(cancelButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(10,0)));
        buttonPanel.add(setButton);

        Container container = getContentPane();
        container.add(listPanel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.PAGE_END);

        setValue(initialValue);
        pack();
        setLocationRelativeTo(locationComponent);
    }
    public void setValue(String newValue){
        this.value = newValue;
        this.list.setSelectedValue(this.value, true);
    }
    public static String showDialog(Component frameComponent,
                                    Component locationComponent,
                                    String labelText,
                                    String title,
                                    String[] data,
                                    String initialValue,
                                    String longValue){
        Frame frame = JOptionPane.getFrameForComponent(frameComponent);
        SelectNameDialog selectNameDialog = new SelectNameDialog(frame, frameComponent, labelText, title, data, initialValue, longValue);
        return value;
    }


}
