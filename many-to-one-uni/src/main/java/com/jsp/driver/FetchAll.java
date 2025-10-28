	package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.Reviews;

public class FetchAll {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Query query = entityManager.createQuery("select r from Car r");
        List<Reviews> list = query.getResultList();
        
        
        System.out.println("---------------------------------");
		
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
	}

}
