package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class Fetch {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = entityManager.find(Car.class, 1);
		Engine engine = entityManager.find(Engine.class, 1);
		
		System.out.println("---------------------------The Car Details Are------------------------------");

		System.out.println("The Car Id Is       : " + car.getId());
		System.out.println("The Car Name Is     : " + car.getName());
		System.out.println("The Car Price Is    : " + car.getPrice());
		System.out.println("The Car Engine Is   : " + car.getEngine());

		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("---------------------------The Engine Details Are------------------------------");

		System.out.println("The Engine Id Is    : " + engine.getId());
		System.out.println("The Engine Type Is  : " + engine.getType());
		System.out.println("The Engine CC Is    : " + engine.getCc());
		System.out.println("The Engine Car Is   : " + engine.getCar());

		System.out.println("-------------------------------------------------------------------------------");
	
	}

}
