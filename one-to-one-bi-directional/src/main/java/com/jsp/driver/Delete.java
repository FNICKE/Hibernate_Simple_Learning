package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class Delete {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = entityManager.find(Car.class, 3);
		Engine engine = car.getEngine();
		engine.setCar(null);
		
		entityTransaction.begin();
		entityManager.merge(engine);
		entityManager.remove(car);
		entityTransaction.commit();
		
	}
	
}
