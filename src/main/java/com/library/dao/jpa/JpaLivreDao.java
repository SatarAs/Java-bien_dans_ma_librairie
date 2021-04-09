package com.library.dao.jpa;

import com.library.dao.LivreDao;
import com.library.entities.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class JpaLivreDao implements LivreDao {
    private EntityManager em;

    public JpaLivreDao(EntityManagerFactory emf){
        this.em = emf.createEntityManager();
    }

    @Override
    public Livre create(Livre book) {
        try {
            em.getTransaction().begin();
            em.merge(book);
            em.getTransaction().commit();
            return book;
        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }
        return null;
    }

    @Override
    public Livre findById(int id) {
        return em.find(Livre.class,id);
    }

    @Override
    public List<Livre> findAll() {
        Query query = em.createQuery("SELECT r FROM Livre AS r");
        return query.getResultList();
    }
}
