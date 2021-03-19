package com.library.entities;

import java.time.LocalDate;

public class Auteur {

    private int id;

    private String nom;

    private String prenom;

    private String pseudo;

    private LocalDate naissance;

    private LocalDate deces;

    private String nationalite;

    public Auteur(String nom, String prenom, String pseudo, LocalDate naissance, LocalDate deces, String nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.naissance = naissance;
        this.deces = deces;
        this.nationalite = nationalite;
    }

    public Auteur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public LocalDate getNaissance() {
        return naissance;
    }

    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }

    public LocalDate getDeces() {
        return deces;
    }

    public void setDeces(LocalDate deces) {
        this.deces = deces;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
}
