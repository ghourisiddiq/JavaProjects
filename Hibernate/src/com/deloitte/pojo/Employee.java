package com.deloitte.pojo;

public class Employee {

	private int id;
	private String firstName;
	private String lastname;
	private int salary;

	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastname = lname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
