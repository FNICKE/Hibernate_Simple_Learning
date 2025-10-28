package com.jsp.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.entity.Account;
import com.jsp.entity.Bank;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Bank bank = entityManager.find(Bank.class, 1);

		System.out.println("--------------------------BANK DETAILS-------------------------------");
		System.out.println("BANK ID IS   : "+bank.getId());
		System.out.println("BANK NAME IS : "+bank.getName());
		System.out.println("BANK ID IS   : "+bank.getLoc());
		System.out.println("----------------------------------------------------------------------");
		
//		List<Account> list = bank.getAccounts()
				
	}

}
