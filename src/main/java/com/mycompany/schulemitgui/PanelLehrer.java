package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLehrer extends JPanel implements ActionListener {

    Dimension size;
    JLabel panelName;
    JButton btn_hinzufuegen,btn_loeschen,btn_anzeigen;

    public PanelLehrer() {
        this.setLayout(null);
        panelName = new JLabel("Lehrer");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        size = panelName.getPreferredSize();
        panelName.setBounds(300, 10, size.width, size.height);
        this.setVisible(true);

        btn_hinzufuegen = new JButton("Hinzufügen");
        btn_hinzufuegen.setBounds(100, 100, 300, 50);

        btn_loeschen = new JButton("Löschen");
        btn_loeschen.setBounds(100, 200, 300, 50);

        btn_anzeigen = new JButton("Anzeigen");
        btn_anzeigen.setBounds(100, 300, 300, 50);


    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
