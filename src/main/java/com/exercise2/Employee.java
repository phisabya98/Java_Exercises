package com.exercise2;

public class Employee {
	String name; 
	String lastName;
	double salary;
	
	public Employee(String name, String lastName, double salary) {
		this.name = lastName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0)
		this.salary = salary;
	}
	
	public void raise() {
		this.salary = this.salary*.10 + (this.salary);
	}
	
}
