package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.entity.Student;
import com.jsp.entity.Subject;

public class Delete1 {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Query query = entityManager.createQuery("select s from Student s");
		List<Student> list1 = query.getResultList();

		entityTransaction.begin();
		
		for (Student student : list1) {
		    Subject sub = null;
		    List<Subject> list2 = student.getSubjects();
		    for (Subject subject : list2) {
		        if (subject.getId() == 4) 
		        {
		            sub = subject;
		        }
		    }
		    if (sub != null) {
		        list2.remove(sub);
		        entityManager.merge(student);
		    }
		}

		Subject subject = entityManager.find(Subject.class, 4);
		entityManager.remove(subject);
		entityTransaction.commit();
		
		
		
	}

}
