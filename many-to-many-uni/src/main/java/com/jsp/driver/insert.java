package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Student;
import com.jsp.entity.Subject;

public class insert {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = new Student("Rahul",21);
		Subject subject = new Subject("Java",60);
		
		List<Subject> list = new ArrayList<Subject>();
		list.add(subject);
		student.setSubjects(list);
		
		entityTransaction.begin();
		entityManager.persist(subject);
		entityManager.persist(student);
		entityTransaction.commit();
	}
}
