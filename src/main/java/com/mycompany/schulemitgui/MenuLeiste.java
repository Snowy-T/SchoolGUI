package com.mycompany.schulemitgui;

import javax.swing.*;

public class MenuLeiste extends JMenuBar {

    JMenu start, optionen;
    JMenuItem schueler, lehrer, zurueck;

    public MenuLeiste(){
        start = new JMenu("Start");
        optionen = new JMenu("Optionen");

        schueler = new JMenuItem("Schueler");
        lehrer = new JMenuItem("Lehrer");
        zurueck = new JMenuItem("Zurück");

        start.add(zurueck);

        optionen.add(schueler);
        optionen.add(lehrer);

        this.add(start);
        this.add(optionen);
    }


}
