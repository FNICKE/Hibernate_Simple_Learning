package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Update {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Bank bank = entityManager.find(Bank.class, 2);
		
		
//		bank.setId(2);
//		bank.setLoc("DADAR");
//		bank.setName("ICICI");
		
		Account account = entityManager.find(Account.class, 101);
		
		account.setId(101);
		account.setBlance(50000);
		account.setNumber(56478);
		
		entityTransaction.begin();
		entityManager.merge(account);
		entityManager.merge(bank);
		entityTransaction.commit();
	}

}
