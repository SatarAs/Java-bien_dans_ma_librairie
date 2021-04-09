package com.library.dao;

import com.library.entities.Document;
import com.library.entities.Revue;

import java.util.List;

public interface DocumentDao {
    public Document create(Document revue);
    public List<Document> findAll();
    public Document findById(int id);
}
