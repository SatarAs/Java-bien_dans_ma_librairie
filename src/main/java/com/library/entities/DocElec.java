package com.library.entities;

public class DocElec extends Document{

    private Auteur author;

    private int numPages;

    private String adresseInternet;

    private String type;

    public DocElec() {
    }

    public DocElec(Auteur author, int numPages, String adresseInternet, String type) {
        this.author = author;
        this.numPages = numPages;
        this.adresseInternet = adresseInternet;
        this.type = type;
    }

    public Auteur getAuteur() {
        return author;
    }

    public void setAuteur(Auteur author) {
        this.author = author;
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
