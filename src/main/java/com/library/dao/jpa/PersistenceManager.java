/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.library.dao.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {
    
    private static EntityManagerFactory emf;
    
    private PersistenceManager(){}

    public static EntityManagerFactory getEmf() {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("LibraryPU");
        }
        return emf;
    }
    
    public static void closeEntityManagerFactory(){
        if(emf != null && emf.isOpen()){
            emf.close();
        }
    }
}
