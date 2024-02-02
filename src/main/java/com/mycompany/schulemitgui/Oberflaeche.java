package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oberflaeche extends JFrame implements ActionListener {

    MenuLeiste menuLeiste;
    JPanel mainPanel = new JPanel();
    PanelStart panelStart = new PanelStart();
    PanelSchueler PanelSchueler = new PanelSchueler();
    PanelLehrer PanelLehrer = new PanelLehrer();
    PanelKlasse PanelKlasse = new PanelKlasse();


    Oberflaeche(){
        this.setTitle("Schule");
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

        menuLeiste.schueler.addActionListener(this);
        menuLeiste.lehrer.addActionListener(this);
        menuLeiste.klasse.addActionListener(this);
        panelStart.btn_alleAnzeigen.addActionListener(this);
        panelStart.btn_allesLoeschen.addActionListener(this);
        menuLeiste.zurueck.addActionListener(this);


        PanelSchueler.setBounds(0,0,500,500);
        PanelSchueler.setVisible(false);

        PanelLehrer.setBounds(0,0,500,500);
        PanelLehrer.setVisible(false);

        PanelKlasse.setBounds(0,0,500,500);
        PanelKlasse.setVisible(false);

        mainPanel.add(PanelSchueler);
        mainPanel.add(PanelLehrer);
        mainPanel.add(PanelKlasse);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuLeiste.schueler){
            PanelSchueler.setVisible(true);
            panelStart.setVisible(false);

            mainPanel.add(PanelSchueler);
            System.out.println("Schueler");
        }
        if(e.getSource() == menuLeiste.lehrer){
            PanelLehrer.setVisible(true);
            panelStart.setVisible(false);
            mainPanel.add(PanelLehrer);
            System.out.println("Lehrer");
        }
        if(e.getSource() == menuLeiste.klasse){
            PanelKlasse.setVisible(true);
            panelStart.setVisible(false);
            mainPanel.add(PanelKlasse);
            System.out.println("Klasse");
        }
        if(e.getSource() == menuLeiste.zurueck){
            panelStart.setVisible(true);
            PanelSchueler.setVisible(false);
            PanelLehrer.setVisible(false);
            PanelKlasse.setVisible(false);
            System.out.println("Start");
        }

    }
}
