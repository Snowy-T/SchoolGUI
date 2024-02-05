package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelKlasse extends JPanel implements ActionListener {

    JLabel lbl_klassenname, lbl_klassenlehrer, lbl_klassenraum, lbl_klassennameNoInputError, lbl_klassenlehrerNoInputError, lbl_klassenraumNoInputError;
    JTextField txt_klassenname,txt_klassenraum;
    JComboBox<String> cb_klassenlehrer;
    JButton btn_addKlasse, btn_removeKlasse;

    public PanelKlasse(){
        lbl_klassenname = new JLabel("Klassenname:");
        lbl_klassenname.setBounds(70, 50, 100, 50);

        lbl_klassenlehrer = new JLabel("Klassenlehrer:");
        lbl_klassenlehrer.setBounds(70, 100, 100, 50);

        lbl_klassenraum = new JLabel("Klassenraum:");
        lbl_klassenraum.setBounds(70, 150, 100, 50);

        lbl_klassennameNoInputError = new JLabel("Bitte geben Sie einen Klassenname ein!");
        lbl_klassennameNoInputError.setBounds(70, 200, 200, 50);
        lbl_klassennameNoInputError.setVisible(false);
        lbl_klassennameNoInputError.setForeground(java.awt.Color.RED);

        lbl_klassenlehrerNoInputError = new JLabel("Bitte geben Sie einen Klassenlehrer ein!");
        lbl_klassenlehrerNoInputError.setBounds(70, 200, 200, 50);
        lbl_klassenlehrerNoInputError.setVisible(false);
        lbl_klassenlehrerNoInputError.setForeground(java.awt.Color.RED);

        lbl_klassenraumNoInputError = new JLabel("Bitte geben Sie einen Klassenraum ein!");
        lbl_klassenraumNoInputError.setBounds(70, 200, 200, 50);
        lbl_klassenraumNoInputError.setVisible(false);
        lbl_klassenraumNoInputError.setForeground(java.awt.Color.RED);

        txt_klassenname = new JTextField();
        txt_klassenname.setBounds(170, 50, 200, 50);

        cb_klassenlehrer = new JComboBox<>();
        cb_klassenlehrer.setBounds(170, 100, 200, 50);

        txt_klassenraum = new JTextField();
        txt_klassenraum.setBounds(170, 150, 200, 50);

        btn_addKlasse = new JButton("Klasse hinzufuegen");
        btn_addKlasse.setBounds(70, 200, 200, 50);
        btn_removeKlasse = new JButton("Klasse entfernen");
        btn_removeKlasse.setBounds(270, 200, 200, 50);

        add(lbl_klassenname);
        add(lbl_klassenlehrer);
        add(lbl_klassenraum);
        add(txt_klassenname);
        add(cb_klassenlehrer);
        add(txt_klassenraum);
        add(btn_addKlasse);
        add(btn_removeKlasse);

        this.setLayout(null);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn_addKlasse) {
            System.out.println("Klasse hinzufuegen");
        }

    }
}
