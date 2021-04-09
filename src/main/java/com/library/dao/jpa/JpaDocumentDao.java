package com.library.dao.jpa;

import com.library.dao.DocumentDao;
import com.library.entities.Document;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class JpaDocumentDao implements DocumentDao {

    private EntityManager em;

    public JpaDocumentDao(EntityManagerFactory emf){
        this.em = emf.createEntityManager();
    }

    @Override
    public Document create(Document document) {
        try {
            em.getTransaction().begin();
            em.merge(document);
            em.getTransaction().commit();
            return document;
        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }
        return null;
    }

    @Override
    public Document findById(int id) {
        return em.find(Document.class,id);
    }

    @Override
    public List<Document> findAll() {
        Query query = em.createQuery("SELECT r FROM Document AS r");
        return query.getResultList();
    }
}
