package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class fetch1 {
    public static void main(String[] args) {

        EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();

        Car car = entityManager.find(Car.class, 2);

        if (car != null) {
            System.out.println("--------------------------- The Car Details Are ---------------------------");

            System.out.println("The Car Id Is       : " + car.getId());
            System.out.println("The Car Name Is     : " + car.getName());
            System.out.println("The Car Price Is    : " + car.getPrice());

            Engine engine = car.getEngine(); 

            if (engine != null) {
                System.out.println("The Car Engine Type : " + engine.getType());
                System.out.println("The Car Engine CC   : " + engine.getCc());
            } else {
                System.out.println("No engine associated with this car.");
            }

            System.out.println("----------------------------------------------------------------------------");
        }
    }
}
