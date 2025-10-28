package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class insert {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = new Car("Mustang",8000000);
		Engine engine = new Engine("V8",6000);
//		car.setEngine(engine);
		engine.setCar(car);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(engine);
		entityTransaction.commit();
		
		
	}

}
