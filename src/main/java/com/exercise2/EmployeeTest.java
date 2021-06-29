package com.exercise2;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Phisa", "Bya", 66000);
		System.out.println(e1.getSalary());
		Employee e2 = new Employee("H", "A", 72000);
		System.out.println(e2.getSalary());
		e1.raise();
		e2.raise();
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
	}

}
