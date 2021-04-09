/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao.jpa;

import com.library.dao.DaoFactory;
import com.library.dao.ReviewDao;
import com.library.entities.Auteur;
import com.library.entities.Revue;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author ludiviine
 */
public class JpaReviewDao implements ReviewDao {
    
    private EntityManager em;
    
    public JpaReviewDao(EntityManagerFactory emf){
        this.em = emf.createEntityManager();
    }

    @Override
    public Revue create(Revue review) {
        try{
            em.getTransaction().begin();
            for(Auteur author : review.getAuteurs()){
                if(DaoFactory.getAuthorDao().findById(author.getId()) == null)
                    throw new Exception("Author does not match " + author.getId());
            }
            em.merge(review);
            em.getTransaction().commit();
            return review;
        }catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }
        return null;
    }

    @Override
    public Revue findById(int id) {
        return em.find(Revue.class,id);
    }

    @Override
    public List<Revue> findAll() {
        Query query = em.createQuery("SELECT r FROM Revue AS r");
        return query.getResultList();
    }

}
