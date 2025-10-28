package com.jsp.driver;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engin;

public class Fetch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Car car = entityManager.find(Car.class, 101);

		System.out.println("---------------------------The Car Details Are------------------------------");

		System.out.println("The Car Id Is : " + car.getId());
		System.out.println("The Car Name Is : " + car.getName());
		System.out.println("The Car Price Is : " + car.getPrice());

		System.out.println("-------------------------------------------------------------------------------");


	}
}