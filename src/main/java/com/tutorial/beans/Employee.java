package com.tutorial.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	public Employee() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String email;
	
	public Employee(String email, String designation, String organization) {
		super();
		this.email = email;
		this.designation = designation;
		this.organization = organization;
	}

	public Employee(long id) {
		super();
		this.id = id;
	}

	private String designation;
	
	private String organization;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
}
