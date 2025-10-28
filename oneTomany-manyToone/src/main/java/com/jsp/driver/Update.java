package com.jsp.driver;

import java.util.ArrayList;
import java.util.List;

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

		Bank bank = entityManager.find(Bank.class, 1); 

		Account account = new Account( 808567, 3500);

		account.setBank(bank);

		List<Account> accounts = bank.getAccounts();
		if (accounts == null) {
			accounts = new ArrayList<>();
		}
		accounts.add(account);
		bank.setAccounts(accounts);

		entityTransaction.begin();
		entityManager.persist(account);
		entityTransaction.commit();

	}
}
