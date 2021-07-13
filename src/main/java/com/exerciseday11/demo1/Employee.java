package com.exerciseday11.demo1;
//Reference to constructor
public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	private char band;
	public Employee() {
		super();
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, float salary, char band) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.band = band;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public char getBand() {
		return band;
	}

	public void setBand(char band) {
		this.band = band;
	}
	
	
	
}
