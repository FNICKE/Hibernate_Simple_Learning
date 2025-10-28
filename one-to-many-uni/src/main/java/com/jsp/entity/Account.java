package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private int id;
	private long number;
	private double blance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getBlance() {
		return blance;
	}
	public void setBlance(double blance) {
		this.blance = blance;
	}
	public Account(int id, long number, double blance) {
		super();
		this.id = id;
		this.number = number;
		this.blance = blance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
