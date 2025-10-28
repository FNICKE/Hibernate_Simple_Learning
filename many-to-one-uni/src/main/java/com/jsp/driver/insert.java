package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Reviews;
import com.jsp.entity.Product;

public class insert {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Product product = new Product("S100 RR", 500000);
		Reviews reviews = new Reviews(4, "Nice");
		reviews.setP(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(reviews);
		entityTransaction.commit();

	}

}