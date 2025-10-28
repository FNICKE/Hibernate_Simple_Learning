package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Product;
import com.jsp.entity.Reviews;

public class Update {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Reviews reviews = entityManager.find(Reviews.class, 4);
		
		reviews.setId(4);
		reviews.setMessage("Very Good");
		reviews.setRating(5);
		
		Product product = entityManager.find(Product.class, 5);
		
		entityTransaction.begin();
		entityManager.merge(reviews);
		
		entityTransaction.commit();
		
	}

}
