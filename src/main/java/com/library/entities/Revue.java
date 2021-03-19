package com.library.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Revue extends Document {

    private String editeur;

    private ArrayList<Auteur> auteurs;

    private int numPages;

    private LocalDate periode;
//    Je commente parce que tu l'a demandé
    private String isbn;

    public Revue() {
    }

    public Revue(String editeur, ArrayList<Auteur> auteurs, int numPages, LocalDate periode, String isbn) {
        this.editeur = editeur;
        this.auteurs = auteurs;
        this.numPages = numPages;
        this.periode = periode;
        this.isbn = isbn;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public ArrayList<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(ArrayList<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public LocalDate getPeriode() {
        return periode;
    }

    public void setPeriode(LocalDate periode) {
        this.periode = periode;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
