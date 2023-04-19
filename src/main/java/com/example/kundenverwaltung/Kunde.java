package com.example.kundenverwaltung;

public class Kunde {

    private final int kundennummer;
    int maxKnr;
    private String name;
    private String kundenart;
    private String adresse;
    private String plz;
    private String wohnort;

    public Kunde() {
        maxKnr++;
        kundennummer = maxKnr;
        kundenart = "privat";
    }

    public Kunde(int pKundennummer) {
        kundennummer = pKundennummer;
        kundenart = "privat";
    }

    public String getKundenart() {
        return kundenart;
    }

    public void setKundenart(String kundenart) {
        this.kundenart = kundenart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    private int getKundennummer() {
        return kundennummer;
    }

    public int getMaxKnr() {
        return maxKnr;
    }

    public void setMaxKnr(int maxKnr) {
        this.maxKnr = maxKnr;
    }


}
