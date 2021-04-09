package com.library.dao;
import com.library.entities.Revue;

import java.util.List;

public interface ReviewDao {
    public Revue create(Revue revue);
    public List<Revue> findAll();
    public Revue findById(int id);
}
