package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart extends JPanel implements ActionListener {


    JButton btn_alleAnzeigen,btn_allesLoeschen;
    JLabel panelName, lbl_allStudents, lbl_allTeachers,lbl_allClasses;


    public PanelStart() {

        setSize(500,500);

        panelName = new JLabel("Start");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        panelName.setBounds(220, 10, 100, 50);

        btn_alleAnzeigen = new JButton("Alle anzeigen");
        btn_alleAnzeigen.setBounds(50, 50, 200, 50);

        btn_allesLoeschen = new JButton("Alles löschen");
        btn_allesLoeschen.setBounds(250, 50, 200, 50);

        lbl_allStudents = new JLabel("OK");
        lbl_allStudents.setBounds(50, 100, 400, 50);
        lbl_allStudents.setVisible(false);

        lbl_allTeachers = new JLabel("OK");
        lbl_allTeachers.setBounds(50, 150, 400, 50);
        lbl_allTeachers.setVisible(false);

        lbl_allClasses = new JLabel("OK");
        lbl_allClasses.setBounds(50, 200, 400, 50);
        lbl_allClasses.setVisible(false);

        add(panelName);
        add(btn_alleAnzeigen);
        add(btn_allesLoeschen);
        add(lbl_allStudents);
        add(lbl_allTeachers);
        add(lbl_allClasses);

        btn_alleAnzeigen.addActionListener(this);
        btn_allesLoeschen.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_alleAnzeigen) {
            lbl_allStudents.setVisible(true);
            lbl_allTeachers.setVisible(true);
            lbl_allClasses.setVisible(true);
            System.out.println("Alle anzeigen");
        }
        if (e.getSource() == btn_allesLoeschen) {
            lbl_allStudents.setVisible(false);
            lbl_allTeachers.setVisible(false);
            lbl_allClasses.setVisible(false);
            System.out.println("Alles löschen");
        }
    }

}
