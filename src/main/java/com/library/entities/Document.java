package com.library.entities;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @author biggy
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Document implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    protected String titre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
