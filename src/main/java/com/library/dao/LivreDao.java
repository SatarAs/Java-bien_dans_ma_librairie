package com.library.dao;

import com.library.entities.Livre;

import java.util.List;

public interface LivreDao {
    public Livre create(Livre book);
    public List<Livre> findAll();
    public Livre findById(int id);
}
