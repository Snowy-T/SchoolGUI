package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PanelSchueler extends JPanel implements ActionListener{

    JLabel lbl_vorname, lbl_nachname,lbl_matrikelnr,lbl_klasse, lbl_vornameNoInputError, lbl_nachnameNoInputError;

    JTextField txt_vorname, txt_nachname, txt_matrikelnr;

    JComboBox<String> cb_klasse;

    JButton btn_addSchueler, btn_removeSchueler;

    public PanelSchueler(){
        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(70, 50, 100, 50);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(70, 100, 100, 50);

        lbl_matrikelnr = new JLabel("Matrikelnr:");
        lbl_matrikelnr.setBounds(70, 150, 100, 50);

        lbl_klasse = new JLabel("Klasse:");
        lbl_klasse.setBounds(70, 200, 100, 50);

        lbl_vornameNoInputError = new JLabel("Bitte geben Sie einen Vornamen ein!");
        lbl_vornameNoInputError.setBounds(70, 250, 200, 50);
        lbl_vornameNoInputError.setVisible(false);
        lbl_vornameNoInputError.setForeground(Color.RED);

        lbl_nachnameNoInputError = new JLabel("Bitte geben Sie einen Nachnamen ein!");
        lbl_nachnameNoInputError.setBounds(70, 250, 200, 50);
        lbl_nachnameNoInputError.setVisible(false);
        lbl_nachnameNoInputError.setForeground(Color.RED);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(170, 50, 200, 50);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(170, 100, 200, 50);

        txt_matrikelnr = new JTextField();
        txt_matrikelnr.setBounds(170, 150, 200, 50);

        cb_klasse = new JComboBox<>();
        cb_klasse.setBounds(170, 200, 200, 50);

        btn_addSchueler = new JButton("Schueler hinzufuegen");
        btn_addSchueler.setBounds(70, 300, 200, 50);

        btn_removeSchueler = new JButton("Schueler entfernen");
        btn_removeSchueler.setBounds(270, 300, 200, 50);

        add(lbl_vorname);
        add(lbl_nachname);
        add(lbl_matrikelnr);
        add(lbl_klasse);

        add(lbl_vornameNoInputError);
        add(lbl_nachnameNoInputError);

        add(txt_vorname);
        add(txt_nachname);
        add(txt_matrikelnr);

        add(cb_klasse);

        add(btn_addSchueler);
        add(btn_removeSchueler);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_addSchueler || e.getSource() == btn_removeSchueler) {
            if (txt_vorname.getText().isBlank()) {
                lbl_vornameNoInputError.setVisible(true);
            } else {
                lbl_vornameNoInputError.setVisible(false);
            }

            if (txt_nachname.getText().isBlank()) {
            lbl_nachnameNoInputError.setVisible(true);
             } else {
            lbl_nachnameNoInputError.setVisible(false);
            }
        }
    }
}
