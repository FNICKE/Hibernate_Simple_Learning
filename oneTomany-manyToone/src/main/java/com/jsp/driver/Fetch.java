package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Fetch {
	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bank bank = entityManager.find(Bank.class, 1);

		System.out.println("*******************************************************");
		System.out.println("Bank ID     : " + bank.getId());
		System.out.println("Bank Name   : " + bank.getName());
		System.out.println("Bank Branch : " + bank.getBranch());

		List<Account> list = bank.getAccounts();

		for(Account account : bank.getAccounts()){
			
		System.out.println("Account ID     : " + account.getId());
		System.out.println("Account Number : " + account.getNumber());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("*******************************************************");
		
		}
		
	}
}
