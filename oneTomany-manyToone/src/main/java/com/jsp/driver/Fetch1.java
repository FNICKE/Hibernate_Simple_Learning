package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Fetch1 {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Account account = entityManager.find(Account.class, 5);
		
		System.out.println("*******************************************************");
		System.out.println("Account ID      : " + account.getId());
		System.out.println("Account Number  : " + account.getNumber());
		System.out.println("Account Balance : " + account.getBalance());
		
		Bank bank = account.getBank();
		
		System.out.println("Bank ID         : " + bank.getId());
		System.out.println("Bank Name       : " + bank.getName());
		System.out.println("Bank Branch     : " + bank.getBranch());
		System.out.println("*******************************************************");
	}

}
