package com.library.entities;

public class DocElec extends Document{

    private Auteur auteur;

    private int numPages;

    private String adresseInternet;

    private String type;

    public DocElec() {
    }

    public DocElec(Auteur auteur, int numPages, String adresseInternet, String type) {
        this.auteur = auteur;
        this.numPages = numPages;
        this.adresseInternet = adresseInternet;
        this.type = type;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAdresseInternet() {
        return adresseInternet;
    }

    public void setAdresseInternet(String adresseInternet) {
        this.adresseInternet = adresseInternet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
