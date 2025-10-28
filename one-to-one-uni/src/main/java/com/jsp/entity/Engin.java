package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engin {
	@Id
	private int id;
	private String type;
	private int cc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Engin(int id, String type, int cc) {
		super();
		this.id = id;
		this.type = type;
		this.cc = cc;
	}
	public Engin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
