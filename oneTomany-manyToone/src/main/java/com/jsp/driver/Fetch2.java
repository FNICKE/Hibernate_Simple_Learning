package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Fetch2 {
	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("sachin").createEntityManager();
		
		Bank bank = entityManager.find(Bank.class, 3);
		
		System.out.println("*******************************************************");
		System.out.println("Bank ID         : " + bank.getId());
		System.out.println("Bank Name       : " + bank.getName());
		System.out.println("Bank Branch     : " + bank.getBranch());
		System.out.println("*******************************************************");
		
		List<Account> list = bank.getAccounts();
		
		for (Account account : list) {
			
			System.out.println("*******************************************************");
			
			System.out.println("Account ID      : " + account.getId());
			System.out.println("Account Number  : " + account.getNumber());
			System.out.println("Account Balance : " + account.getBalance());
			System.out.println("*******************************************************");
			
		}

	}

}
