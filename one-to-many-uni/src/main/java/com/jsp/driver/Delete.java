package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bank bank = entityManager.find(Bank.class,1);
		List<Account> list = bank.getAccounts();
		Account acc = null;
		
		for(Account account : list) {
			if(account.getId() == 102) {
				acc = account;
			}
		}
		
		list.remove(acc);
		
		entityTransaction.begin();
		entityManager.merge(bank);
		entityManager.remove(acc);
		entityTransaction.commit();
		

		
	}
}
