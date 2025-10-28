package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Update2 {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Bank bank = entityManager.find(Bank.class, 2);
		List<Account> list = bank.getAccounts();
		
		for(Account account : list) {
			
			if(account.getId() == 201) {
				account.setBlance(5600);
			}
		
		}
			entityTransaction.begin();
			entityManager.merge(bank);
			entityTransaction.commit();
	}

}
