package com.tutorial.beans;



public class DataHolder {

	public DataHolder() {
		// TODO Auto-generated constructor stub
	}
	
	//u.email,u.name,u.city,e.designation,e.organization 

	private String email;
	private String name;
	private String city;
	private String designation;
	private String organization;
	
	
	public DataHolder(String email, String name, String city, String designation, String organization) {
		super();
		this.email = email;
		this.name = name;
		this.city = city;
		this.designation = designation;
		this.organization = organization;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
