
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schulemitgui;

/**
 *
 * @author TimUnt
 */
public class Schueler extends Person {
    private int matrikelnr;
    private String vorname;
    private String nachname;

    // CONSTRUCTOR
    public Schueler(String vorname, String nachname, int matrikelnr) {
        super(vorname, nachname,matrikelnr);
    }

    // GETTER UND SETTER
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
    }
}
