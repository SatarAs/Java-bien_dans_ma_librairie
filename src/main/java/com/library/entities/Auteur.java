package com.library.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @author biggy
 */

@Entity
public class Auteur implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String pseudo;

    private LocalDate naissance;

    private LocalDate deces;
    @Enumerated
    private Nationality nationalite;
    @ManyToMany(mappedBy = "auteurs")
    private List<Revue> reviews;

    public Auteur(String nom, String prenom, String pseudo, LocalDate naissance, LocalDate deces, Nationality nationalite) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.naissance = naissance;
        this.deces = deces;
        this.nationalite = nationalite;
    }

    public Auteur() {}

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

    public Nationality getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationality nationalite) {
        this.nationalite = nationalite;
    }
}
