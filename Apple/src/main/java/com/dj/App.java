package com.dj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dj.model.Batsman;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Apple");
        EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
        createEntityManager.getTransaction().begin();
        
        Batsman batsman = new Batsman();
        batsman.setRoll("batsman");
        batsman.setName("sky");
        batsman.setJersy(55);
        
        
        
        createEntityManager.persist(batsman);
       createEntityManager.getTransaction().commit();
       createEntityManager.close();
    }
}
