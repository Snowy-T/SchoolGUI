package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLehrer extends JPanel implements ActionListener {

    Dimension size;
    JLabel panelName, lbl_vorname, lbl_nachname,lbl_fach, lbl_matrikelnr, lbl_vornameNoInputError, lbl_nachnameNoInputError, lbl_matrikelnrNoInputError,lbl_fachNoInputError, lbl_eingabeErfolgreich;
    JTextField txt_vorname, txt_nachname,txt_fach, txt_matrikelnr;
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

        lbl_fach = new JLabel("Fach:");
        lbl_fach.setBounds(50, 200, 100, 50);

        lbl_vornameNoInputError = new JLabel("Bitte geben Sie einen Vornamen ein!");
        lbl_vornameNoInputError.setBounds(50, 280, 300, 50);
        lbl_vornameNoInputError.setVisible(false);
        lbl_vornameNoInputError.setForeground(Color.RED);

        lbl_nachnameNoInputError = new JLabel("Bitte geben Sie einen Nachnamen ein!");
        lbl_nachnameNoInputError.setBounds(50, 290, 300, 50);
        lbl_nachnameNoInputError.setVisible(false);
        lbl_nachnameNoInputError.setForeground(Color.RED);

        lbl_matrikelnrNoInputError = new JLabel("Bitte geben Sie eine Matrikelnr ein!");
        lbl_matrikelnrNoInputError.setBounds(50, 300, 300, 50);
        lbl_matrikelnrNoInputError.setVisible(false);
        lbl_matrikelnrNoInputError.setForeground(Color.RED);

        lbl_fachNoInputError = new JLabel("Bitte geben Sie ein Fach ein!");
        lbl_fachNoInputError.setBounds(50, 310, 300, 50);
        lbl_fachNoInputError.setVisible(false);
        lbl_fachNoInputError.setForeground(Color.RED);

        lbl_eingabeErfolgreich = new JLabel("Eingabe erfolgreich!");
        lbl_eingabeErfolgreich.setBounds(50, 295, 300, 50);
        lbl_eingabeErfolgreich.setVisible(false);
        lbl_eingabeErfolgreich.setForeground(Color.GREEN);

        txt_vorname = new JTextField();
        txt_vorname.setBounds(150, 50, 200, 50);

        txt_nachname = new JTextField();
        txt_nachname.setBounds(150, 100, 200, 50);

        txt_fach = new JTextField();
        txt_fach.setBounds(150, 200, 200, 50);

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
        add(lbl_fach);
        add(txt_vorname);
        add(txt_nachname);
        add(txt_matrikelnr);
        add(txt_fach);
        add(btn_hinzufuegen);
        add(btn_loeschen);
        add(btn_anzeigen);
        add(lbl_vornameNoInputError);
        add(lbl_nachnameNoInputError);
        add(lbl_matrikelnrNoInputError);
        add(lbl_fachNoInputError);
        add(lbl_eingabeErfolgreich);

        btn_anzeigen.addActionListener(this);
        btn_hinzufuegen.addActionListener(this);
        btn_loeschen.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == btn_hinzufuegen) {
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
                System.out.println("Matrikelnr fehlt");
            } else {
                lbl_matrikelnrNoInputError.setVisible(false);
                System.out.println("Matrikelnr OK");
            }
            if (txt_fach.getText().isEmpty()) {
                lbl_fachNoInputError.setVisible(true);
                System.out.println("Fach fehlt");
            } else {
                lbl_fachNoInputError.setVisible(false);
                System.out.println("Fach OK");
            }

            if (!txt_vorname.getText().isEmpty() && !txt_nachname.getText().isEmpty() && !txt_matrikelnr.getText().isEmpty()&& !txt_fach.getText().isEmpty()) {
                lbl_eingabeErfolgreich.setVisible(true);
                txt_vorname.setText("");
                txt_nachname.setText("");
                txt_matrikelnr.setText("");
                txt_fach.setText("");
                System.out.println("Eingabe erfolgreich");
            }


        }

    }
}
