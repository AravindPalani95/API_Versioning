package com.api.modal;

import java.io.Serializable;

public class EmployeeV2 implements Serializable{
	
	private static final long serialVersionUID = -1050949267573391708L;

	private String firstName;
	
	private String lastName;
	
	public EmployeeV2(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
