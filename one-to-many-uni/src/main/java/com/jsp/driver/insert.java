package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class insert {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Bank bank = new Bank(5,"UNION","Panvel");
		Account account1 = new Account(501,13410,6000);
		//Account account2 = new Account(302,78546,6000);
		
		List<Account> list = new ArrayList<Account>();
		list.add(account1);
		//list.add(account2);
		
		bank.setAccounts(list);
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(account1);
		//entityManager.persist(account2);
		entityTransaction.commit();
		
		
		
		
	}

}
