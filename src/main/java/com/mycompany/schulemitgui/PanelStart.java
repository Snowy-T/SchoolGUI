package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart extends JPanel implements ActionListener {

    Dimension size;
    JLabel panelName;
    JButton btn_alleAnzeigen,btn_allesLoeschen;

    public PanelStart() {
        this.setLayout(null);
        panelName = new JLabel("Start");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        size = panelName.getPreferredSize();
        panelName.setBounds(300, 10, size.width, size.height);
        this.setVisible(true);

        btn_alleAnzeigen = new JButton("Alle anzeigen");
        btn_alleAnzeigen.setBounds(100, 100, 300, 50);

        btn_allesLoeschen = new JButton("Alles löschen");
        btn_allesLoeschen.setBounds(100, 200, 300, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

}
