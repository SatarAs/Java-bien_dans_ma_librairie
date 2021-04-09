package com.library.dao.jpa;

import com.library.dao.AuthorDao;
import com.library.dao.DaoFactory;
import com.library.entities.Auteur;
import com.library.entities.Document;
import com.library.entities.Revue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class JpaAuthorDao implements AuthorDao {
    private EntityManager em;
    public JpaAuthorDao(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }

    @Override
    public Auteur create(Auteur auteur) {
        try {
            em.getTransaction().begin();
            em.merge(auteur);
            em.getTransaction().commit();
            return auteur;
        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }
        return null;
    }


    @Override
    public Auteur findById(int id) {
        return em.find(Auteur.class,id);
    }

    @Override
    public List<Auteur> findAll() {
        Query query = em.createQuery("SELECT r FROM Auteur AS r");
        return query.getResultList();
    }
}
