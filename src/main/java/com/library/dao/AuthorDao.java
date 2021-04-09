/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.entities.Auteur;
import java.util.List;

public interface AuthorDao {
    
    public Auteur create(Auteur author);
    public List<Auteur> findAll();
    public Auteur findById(int id);
    
}
