package com.dixon.studentmanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class Student {
	protected int id;
	protected String name;
	protected String email;
	protected String major;
	
	public Student() {
	}
	
	public Student(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.major = country;
	}

	public Student(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.major = country;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return major;
	}
	public void setCountry(String country) {
		this.major = country;
	}
}