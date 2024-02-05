package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelKlasse extends JPanel implements ActionListener {

    JLabel panelName,lbl_klassenname, lbl_klassenlehrer, lbl_klassennameNoInputError, lbl_klassenlehrerNoInputError, lbl_eingabeErfolgreich;
    JTextField txt_klassenname;
    JComboBox<String> cb_klassenlehrer;
    JButton btn_addKlasse, btn_removeKlasse;

    public PanelKlasse(){

        panelName = new JLabel("Klasse");
        panelName.setFont(new Font("Arial", Font.BOLD, 20));
        panelName.setBounds(220, 10, 100, 50);

        lbl_klassenname = new JLabel("Klassenname:");
        lbl_klassenname.setBounds(50, 50, 100, 50);

        lbl_klassenlehrer = new JLabel("Klassenlehrer:");
        lbl_klassenlehrer.setBounds(50, 100, 100, 50);


        lbl_klassennameNoInputError = new JLabel("Bitte geben Sie einen Klassenname ein!");
        lbl_klassennameNoInputError.setBounds(50, 190, 300, 50);
        lbl_klassennameNoInputError.setVisible(false);
        lbl_klassennameNoInputError.setForeground(Color.RED);

        lbl_klassenlehrerNoInputError = new JLabel("Bitte geben Sie einen Klassenlehrer ein!");
        lbl_klassenlehrerNoInputError.setBounds(50, 200, 300, 50);
        lbl_klassenlehrerNoInputError.setVisible(false);
        lbl_klassenlehrerNoInputError.setForeground(Color.RED);

        lbl_eingabeErfolgreich = new JLabel("Eingabe erfolgreich!");
        lbl_eingabeErfolgreich.setBounds(50, 200, 200, 50);
        lbl_eingabeErfolgreich.setVisible(false);
        lbl_eingabeErfolgreich.setForeground(Color.GREEN);

        txt_klassenname = new JTextField();
        txt_klassenname.setBounds(150, 50, 200, 50);


        cb_klassenlehrer = new JComboBox<>();
        cb_klassenlehrer.setBounds(150, 100, 200, 50);

        btn_addKlasse = new JButton("Klasse hinzufügen");
        btn_addKlasse.setBounds(50, 250, 200, 50);

        btn_removeKlasse = new JButton("Klasse entfernen");
        btn_removeKlasse.setBounds(250, 250, 200, 50);

        add(panelName);
        add(lbl_klassenname);
        add(lbl_klassenlehrer);
        add(txt_klassenname);
        add(cb_klassenlehrer);
        add(btn_addKlasse);
        add(btn_removeKlasse);
        add(lbl_klassennameNoInputError);
        add(lbl_klassenlehrerNoInputError);
        add(lbl_eingabeErfolgreich);

        btn_addKlasse.addActionListener(this);
        btn_removeKlasse.addActionListener(this);
        cb_klassenlehrer.addActionListener(this);


        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_addKlasse) {
            if (txt_klassenname.getText().isEmpty()) {
                lbl_klassennameNoInputError.setVisible(true);
                System.out.println("Klassenname fehlt");
            } else {
                lbl_klassennameNoInputError.setVisible(false);
                System.out.println("Klassenname OK");
            }
            if (cb_klassenlehrer.getSelectedItem() == null) {
                lbl_klassenlehrerNoInputError.setVisible(true);
                System.out.println("Klassenlehrer fehlt");
            } else {
                lbl_klassenlehrerNoInputError.setVisible(false);
                System.out.println("Klassenlehrer OK");
            }
            if (!txt_klassenname.getText().isEmpty() && cb_klassenlehrer.getSelectedItem() != null) {
                lbl_eingabeErfolgreich.setVisible(true);
                System.out.println("Eingabe erfolgreich!");
                txt_klassenname.setText("");
                cb_klassenlehrer.setSelectedItem(null);
            }

        }

    }
}
