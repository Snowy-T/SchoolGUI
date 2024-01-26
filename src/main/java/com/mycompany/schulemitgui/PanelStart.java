package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart extends JPanel implements ActionListener {


    JButton btn_alleAnzeigen,btn_allesLoeschen;


    public PanelStart() {

        setSize(500,500);
        setBackground(Color.gray);

        btn_alleAnzeigen = new JButton("Alle Anzeigen");
        btn_alleAnzeigen.setBounds(170,150,150,50);

        btn_allesLoeschen = new JButton("Alles Löschen");
        btn_allesLoeschen.setBounds(170,250,150,50);

        add(btn_alleAnzeigen);
        add(btn_allesLoeschen);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

}
