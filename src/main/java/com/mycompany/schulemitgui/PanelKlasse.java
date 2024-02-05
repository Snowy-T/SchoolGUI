package com.mycompany.schulemitgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelKlasse extends JPanel implements ActionListener {

    JLabel panelName,lbl_klassenname, lbl_klassenlehrer, lbl_klassennameNoInputError, lbl_klassenlehrerNoInputError;
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
        lbl_klassennameNoInputError.setBounds(50, 200, 200, 50);
        lbl_klassennameNoInputError.setVisible(false);
        lbl_klassennameNoInputError.setForeground(Color.RED);

        lbl_klassenlehrerNoInputError = new JLabel("Bitte geben Sie einen Klassenlehrer ein!");
        lbl_klassenlehrerNoInputError.setBounds(50, 200, 200, 50);
        lbl_klassenlehrerNoInputError.setVisible(false);
        lbl_klassenlehrerNoInputError.setForeground(Color.RED);


        txt_klassenname = new JTextField();
        txt_klassenname.setBounds(150, 50, 200, 50);


        cb_klassenlehrer = new JComboBox<>();
        cb_klassenlehrer.setBounds(150, 100, 200, 50);

        btn_addKlasse = new JButton("Klasse hinzufuegen");
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


        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn_addKlasse) {
            System.out.println("Klasse hinzufuegen");
        }
        if (e.getSource() == btn_removeKlasse) {
            System.out.println("Klasse entfernen");
        }
        if (e.getSource() == cb_klassenlehrer) {
            System.out.println("Klassenlehrer");
        }

    }
}
