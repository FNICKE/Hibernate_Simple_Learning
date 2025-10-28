package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Update1 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = entityManager.find(Bank.class, 1);
		Account account = new Account(103,24561,3200);
		
		List<Account> list = bank.getAccounts();
		list.add(account);
		bank.setAccounts(list);
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(account);
		entityManager.merge(bank);
		entityTransaction.commit();
	}
}
