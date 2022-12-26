package com.student.homepage.impl;

public class Student {

	private String name;
	private String gender;
	private String department;
	private String description;

	public Student() {
	}

	public Student(String name, String gender, String department, String description) {
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
