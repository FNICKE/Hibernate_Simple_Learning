package com.jsp.driver;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.Car;
import com.jsp.entity.Engin;

public class FetchAll {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query = entityManager.createQuery("select c from Car c");
        List<Car> list = query.getResultList();
        

        for (Car car : list) {
        	
            System.out.println(car.getId() + " " + car.getName() + " " + car.getPrice());
        }
        
		
	}

    }

