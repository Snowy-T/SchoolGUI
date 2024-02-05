package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLehrer extends JPanel implements ActionListener {

    Dimension size;
    JLabel panelName, lbl_vorname, lbl_nachname, lbl_matrikelnr, lbl_vornameNoInputError, lbl_nachnameNoInputError;
    JTextField txt_vorname, txt_nachname, txt_matrikelnr;
    JButton btn_hinzufuegen,btn_loeschen,btn_anzeigen;

    public PanelLehrer() {
        panelName = new JLabel("Lehrer");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        size = panelName.getPreferredSize();
        panelName.setBounds(220, 10, size.width, size.height);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(50, 50, 100, 50);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(50, 100, 100, 50);

        lbl_matrikelnr = new JLabel("Matrikelnr:");
        lbl_matrikelnr.setBounds(50, 150, 100, 50);

        lbl_vornameNoInputError = new JLabel("Bitte geben Sie einen Vornamen ein!");
        lbl_vornameNoInputError.setBounds(50, 200, 200, 50);
        lbl_vornameNoInputError.setVisible(false);
        lbl_vornameNoInputError.setForeground(Color.RED);

        lbl_nachnameNoInputError = new JLabel("Bitte geben Sie einen Nachnamen ein!");
        lbl_nachnameNoInputError.setBounds(50, 200, 200, 50);
        lbl_nachnameNoInputError.setVisible(false);
        lbl_nachnameNoInputError.setForeground(Color.RED);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(150, 50, 200, 50);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(150, 100, 200, 50);

        txt_matrikelnr = new JTextField();
        txt_matrikelnr.setBounds(150, 150, 200, 50);

        btn_hinzufuegen = new JButton("Lehrer hinzufuegen");
        btn_hinzufuegen.setBounds(50, 250, 200, 50);

        btn_loeschen = new JButton("Lehrer entfernen");
        btn_loeschen.setBounds(250, 250, 200, 50);

        btn_anzeigen = new JButton("Lehrer anzeigen");
        btn_anzeigen.setBounds(150, 350, 200, 50);

        add(panelName);
        add(lbl_vorname);
        add(lbl_nachname);
        add(lbl_matrikelnr);
        add(txt_vorname);
        add(txt_nachname);
        add(txt_matrikelnr);
        add(btn_hinzufuegen);
        add(btn_loeschen);
        add(btn_anzeigen);
        add(lbl_vornameNoInputError);
        add(lbl_nachnameNoInputError);

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
