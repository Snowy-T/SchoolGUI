package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLehrer extends JPanel implements ActionListener {

    Dimension size;
    JLabel panelName;
    JButton btn_hinzufuegen,btn_loeschen,btn_anzeigen;

    public PanelLehrer() {
        panelName = new JLabel("Lehrer");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        size = panelName.getPreferredSize();
        panelName.setBounds(300, 10, size.width, size.height);

        btn_hinzufuegen = new JButton("Hinzufügen");
        btn_hinzufuegen.setBounds(100, 100, 300, 50);

        btn_loeschen = new JButton("Löschen");
        btn_loeschen.setBounds(100, 200, 300, 50);

        btn_anzeigen = new JButton("Anzeigen");
        btn_anzeigen.setBounds(100, 300, 300, 50);

        add(panelName);
        add(btn_hinzufuegen);
        add(btn_loeschen);
        add(btn_anzeigen);

        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_hinzufuegen) {
            System.out.println("Hinzufügen");
        }
        if (e.getSource() == btn_loeschen) {
            System.out.println("Löschen");
        }
        if (e.getSource() == btn_anzeigen) {
            System.out.println("Anzeigen");
        }

    }
}
