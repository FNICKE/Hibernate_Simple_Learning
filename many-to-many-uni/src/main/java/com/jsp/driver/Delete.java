package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Student;
import com.jsp.entity.Subject;

public class Delete {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, 4);
		Subject subject = null;
		
		List<Subject> list = student.getSubjects();
		for(Subject sub : list) {
			if (sub.getId() == 4) {
				subject = sub;
			}
		}
		list.remove(subject);
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
	}

}
