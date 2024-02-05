package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PanelSchueler extends JPanel implements ActionListener{

    JLabel panelName, lbl_vorname, lbl_nachname,lbl_matrikelnr,lbl_klasse, lbl_vornameNoInputError, lbl_nachnameNoInputError, lbl_matrikelnrNoInputError, lbl_klasseNoInputError, lbl_eingabeErfolgreich;

    JTextField txt_vorname, txt_nachname, txt_matrikelnr;

    JComboBox<String> cb_klasse;

    JButton btn_addSchueler, btn_removeSchueler;

    public PanelSchueler(){
        panelName = new JLabel("Schüler");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        panelName.setBounds(200, 5, 100, 50);

        lbl_vorname = new JLabel("Vorname:");
        lbl_vorname.setBounds(50, 50, 100, 50);

        lbl_nachname = new JLabel("Nachname:");
        lbl_nachname.setBounds(50, 100, 100, 50);

        lbl_matrikelnr = new JLabel("MatrikelNr:");
        lbl_matrikelnr.setBounds(50, 150, 100, 50);

        lbl_klasse = new JLabel("Klasse:");
        lbl_klasse.setBounds(50, 200, 100, 50);

        lbl_vornameNoInputError = new JLabel("Bitte geben Sie einen Vornamen ein!");
        lbl_vornameNoInputError.setBounds(50, 230, 300, 50);
        lbl_vornameNoInputError.setVisible(false);
        lbl_vornameNoInputError.setForeground(Color.RED);

        lbl_nachnameNoInputError = new JLabel("Bitte geben Sie einen Nachnamen ein!");
        lbl_nachnameNoInputError.setBounds(50, 240, 300, 50);
        lbl_nachnameNoInputError.setVisible(false);
        lbl_nachnameNoInputError.setForeground(Color.RED);

        lbl_matrikelnrNoInputError = new JLabel("Bitte geben Sie eine MatrikelNr ein!");
        lbl_matrikelnrNoInputError.setBounds(50, 250, 300, 50);
        lbl_matrikelnrNoInputError.setVisible(false);
        lbl_matrikelnrNoInputError.setForeground(Color.RED);

        lbl_klasseNoInputError = new JLabel("Bitte wählen Sie eine Klasse aus!");
        lbl_klasseNoInputError.setBounds(50, 260, 300, 50);
        lbl_klasseNoInputError.setVisible(false);
        lbl_klasseNoInputError.setForeground(Color.RED);

        lbl_eingabeErfolgreich = new JLabel("Eingabe erfolgreich!");
        lbl_eingabeErfolgreich.setBounds(50, 245, 300, 50);
        lbl_eingabeErfolgreich.setVisible(false);
        lbl_eingabeErfolgreich.setForeground(Color.GREEN);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(150, 50, 200, 50);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(150, 100, 200, 50);

        txt_matrikelnr = new JTextField();
        txt_matrikelnr.setBounds(150, 150, 200, 50);

        cb_klasse = new JComboBox<>();
        cb_klasse.setBounds(150, 200, 200, 50);

        btn_addSchueler = new JButton("Schüler hinzufuegen");
        btn_addSchueler.setBounds(50, 300, 200, 50);

        btn_removeSchueler = new JButton("Schüler entfernen");
        btn_removeSchueler.setBounds(250, 300, 200, 50);

        add(panelName);
        add(lbl_vorname);
        add(lbl_nachname);
        add(lbl_matrikelnr);
        add(lbl_klasse);
        add(lbl_vornameNoInputError);
        add(lbl_nachnameNoInputError);
        add(lbl_matrikelnrNoInputError);
        add(lbl_klasseNoInputError);
        add(txt_vorname);
        add(txt_nachname);
        add(txt_matrikelnr);
        add(cb_klasse);
        add(btn_addSchueler);
        add(btn_removeSchueler);
        add(lbl_eingabeErfolgreich);

        btn_addSchueler.addActionListener(this);
        btn_removeSchueler.addActionListener(this);
        cb_klasse.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_addSchueler) {
            if (txt_vorname.getText().isEmpty()) {
                lbl_vornameNoInputError.setVisible(true);
                System.out.println("Vorname fehlt");
            } else {
                lbl_vornameNoInputError.setVisible(false);
                System.out.println("Vorname OK");
            }
            if (txt_nachname.getText().isEmpty()) {
                lbl_nachnameNoInputError.setVisible(true);
                System.out.println("Nachname fehlt");
            } else {
                lbl_nachnameNoInputError.setVisible(false);
                System.out.println("Nachname OK");
            }
            if (txt_matrikelnr.getText().isEmpty()) {
                lbl_matrikelnrNoInputError.setVisible(true);
                System.out.println("MatrikelNr fehlt");
            } else {
                lbl_matrikelnrNoInputError.setVisible(false);
                System.out.println("MatrikelNr OK");
            }
            if (cb_klasse.getSelectedItem() == null) {
                lbl_klasseNoInputError.setVisible(true);
                System.out.println("Klasse fehlt");
            } else {
                lbl_klasseNoInputError.setVisible(false);
                System.out.println("Klasse OK");
            }
            if (!txt_vorname.getText().isEmpty() && !txt_nachname.getText().isEmpty() && !txt_matrikelnr.getText().isEmpty() && cb_klasse.getSelectedItem() != null) {
                lbl_eingabeErfolgreich.setVisible(true);
                System.out.println("Eingabe erfolgreich");
                txt_vorname.setText("");
                txt_nachname.setText("");
                txt_matrikelnr.setText("");
                cb_klasse.setSelectedItem(null);
            }
        }
    }
}
