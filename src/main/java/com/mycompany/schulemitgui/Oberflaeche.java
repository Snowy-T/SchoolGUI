package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oberflaeche extends JFrame implements ActionListener {

    MenuLeiste menuLeiste;
    JPanel mainPanel = new JPanel();
    PanelStart panelStart = new PanelStart();


    Oberflaeche(){


        menuLeiste = new MenuLeiste();
        this.setJMenuBar(menuLeiste);

        add(BorderLayout.CENTER , mainPanel);
        mainPanel.setLayout(null);

        mainPanel.add(panelStart);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelStart.btn_allesLoeschen){
            System.out.println("Alles löschen");
        }
        if(e.getSource() == panelStart.btn_alleAnzeigen){
            System.out.println("Alle anzeigen");
        }
        if(e.getSource() == menuLeiste.start){
            System.out.println("Start");
        }

    }
}
