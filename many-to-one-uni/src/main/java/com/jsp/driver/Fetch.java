package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Reviews;

public class Fetch {

	public static void main(String[] args) {
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Reviews reviews = entityManager.find(Reviews.class, 1);
		
		System.out.println("---------------------------------");
		System.out.println("The reviwes details are:");
		System.out.println("reviews ID          : " + reviews.getId());
		System.out.println("reviews message     : " + reviews.getMessage());
		System.out.println("reviews rating      : " + reviews.getRating());
		System.out.println("---------------------------------");

	}

}