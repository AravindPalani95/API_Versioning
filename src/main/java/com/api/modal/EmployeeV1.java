package com.api.modal;

import java.io.Serializable;

public class EmployeeV1 implements Serializable{

	public EmployeeV1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private static final long serialVersionUID = -6420657624520580551L;

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
