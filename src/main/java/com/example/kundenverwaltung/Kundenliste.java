package com.example.kundenverwaltung;

import java.io.IOException;
import java.util.LinkedList;

public class Kundenliste {
    private LinkedList kundList;
    private int index;

    public Kundenliste() {
        LinkedList l = new LinkedList();
        index = 0;
    }

    public Kunde newKunde() {
        Kunde k = new Kunde();
        kundList.add(k);
        index = this.index;
        return k;
    }

    public getFirstKunde() {
    return Kundenliste;
    }



    public void setMaxKnr() {

    }

    public Kunde getKunde() {

    }

    public Kunde getNextKunde() {

    }

    public Kunde getPreviousKunde() {

    }

    public Kunde removeKunde() {

    }

    public int getAnzahl() {

    }

    public int getIndex() {

    }

    public void loadKundenliste(String pDateiname) throws IOException {

    }

    public void saveKundenliste(String pDateiname) throws IOException {

    }
}

