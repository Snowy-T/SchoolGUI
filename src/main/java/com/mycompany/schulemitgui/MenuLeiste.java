package com.mycompany.schulemitgui;

import javax.swing.*;

public class MenuLeiste extends JMenuBar {

    JMenu start, optionen;
    JMenuItem schueler, lehrer, klasse, zurueck;

    public MenuLeiste(){
        start = new JMenu("Start");
        optionen = new JMenu("Optionen");

        zurueck = new JMenuItem("Zurück");

        schueler = new JMenuItem("Schueler");
        lehrer = new JMenuItem("Lehrer");
        klasse = new JMenuItem("Klasse");


        start.add(zurueck);
        optionen.add(schueler);
        optionen.add(lehrer);
        optionen.add(klasse);

        this.add(start);
        this.add(optionen);
    }


}
