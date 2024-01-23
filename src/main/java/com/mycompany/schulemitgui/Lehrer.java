
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schulemitgui;

/**
 *
 * @author TimUnt
 */
public class Lehrer extends Person {
    private String fach;

    // CONSTRUCTOR
    public Lehrer(String vorname, String nachname, int matrikelnr, String fach) {
        super(vorname, nachname, matrikelnr);
        this.fach = fach;
    }

    // GETTER UND SETTER
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getMatrikelnummer() {
        return matrikelnr;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnr = matrikelnummer;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}
