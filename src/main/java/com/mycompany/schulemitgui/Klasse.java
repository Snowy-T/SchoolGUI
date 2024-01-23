
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schulemitgui;

import java.util.ArrayList;

/**
 *
 * @author TimUnt
 */
public class Klasse {
    private ArrayList<Schueler> klasse = new ArrayList<Schueler>();
    private Lehrer klassenlehrer;
    private String klassenname;

    // CONSTRUCTOR
    public Klasse(String klassenname, Lehrer klassenlehrer) {
        this.klassenname = klassenname;
        this.klassenlehrer = klassenlehrer;
    }

    //SCHEULER ENTFERNEN UND HINZUFÜGEN
    public void removeSchueler(Schueler schueler){
        this.klasse.remove(schueler);
    }

    public void addSchueler(Schueler schueler) {
        this.klasse.add(schueler);
    }

    //GETTER UND SETTER
    public Lehrer getKlassenlehrer() {
        return this.klassenlehrer;
    }

    public void setKlassenlehrer(Lehrer klassenlehrer) {
        this.klassenlehrer = klassenlehrer;
    }
    public String getKlassenname(){
        return this.klassenname;
    }

    public void setKlassenname(String klassenname) {
        this.klassenname = klassenname;
    }
    public ArrayList<Schueler> getKlasse() {
        return klasse;
    }

}
