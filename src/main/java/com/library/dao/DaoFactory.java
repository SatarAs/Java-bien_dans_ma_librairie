/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao;

import com.library.dao.jpa.*;
import com.library.entities.Document;

/**
 *
 * @author biggy
 */
public class DaoFactory {
    
    private DaoFactory(){}

    public static AuthorDao getAuthorDao() {
        return new JpaAuthorDao(PersistenceManager.getEmf());
    }
    
    public static ReviewDao getReviewDao(){
        return new JpaReviewDao(PersistenceManager.getEmf());
    }

    public static LivreDao getLivreDao() {
        return new JpaLivreDao(PersistenceManager.getEmf());
    }

    public static DocumentDao getDocumentDao() {
        return new JpaDocumentDao(PersistenceManager.getEmf());
    }
    
}
