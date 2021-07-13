package com.exerciseday11.demo1;

public class EmployeeConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInterface employeeInterface = Employee::new;
		Employee employee = employeeInterface.getEmployee(20, "HCL");
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpNo());
	}

}
