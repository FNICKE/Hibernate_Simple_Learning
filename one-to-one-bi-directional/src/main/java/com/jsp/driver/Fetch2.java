package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class Fetch2 {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		

		
		Car car = entityManager.find(Car.class, 1);
		
		System.out.println("The Car Id Is       : " + car.getId());
		System.out.println("The Car Name Is     : " + car.getName());
		System.out.println("The Car Price Is    : " + car.getPrice());
		
		
		Engine engine = car.getEngine();
		System.out.println("The Engine Id Is    : " + engine.getId());
		System.out.println("The Engine Type Is  : " + engine.getType());
		System.out.println("The Engine CC Is    : " + engine.getCc());
		
	}

}
