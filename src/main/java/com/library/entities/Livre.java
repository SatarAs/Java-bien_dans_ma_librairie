package com.library.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Livre extends Document {

    @OneToOne
    @JoinColumn(name = "id_author")
    private Auteur author;

    private int numPages;

    private String type;
    @Column(nullable = false, unique = true)
    private String isbn;

    private LocalDate creation;

    public Auteur getAuthor() {
        return author;
    }

    public void setAuthor(Auteur author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }
}
