package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oberflaeche extends JFrame implements ActionListener {

    MenuLeiste menuLeiste = new MenuLeiste();
    PanelStart panelStart = new PanelStart();


    Oberflaeche(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.add(panelStart);
        this.setJMenuBar(menuLeiste);
        this.setVisible(true);

        panelStart.btn_allesLoeschen.addActionListener(this);
        panelStart.btn_alleAnzeigen.addActionListener(this);

        menuLeiste.start.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
