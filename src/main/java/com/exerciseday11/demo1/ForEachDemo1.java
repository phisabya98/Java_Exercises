package com.exerciseday11.demo1;
import java.util.*;
public class ForEachDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10,"Arun", 1010f, 'E'));
		list.add(new Employee(20,"Phisa", 2020f, 'M'));
		list.add(new Employee(30,"Carol", 3030f, 'M'));
		list.add(new Employee(40,"Danny", 4040f, 'C'));
		list.add(new Employee(50,"Anthony", 5050f, 'M'));
		
		list.stream().forEach((var) -> System.out.println(var.getEmpNo() + " " + var.getEmpName() + " "
				+ var.getSalary()));
		
		//filter starting with alphabet c
		list.stream().filter((emp) -> emp.getEmpName().startsWith("A")).forEach((a) -> {System.out.println(a.getEmpName());}); 
		
		//filter and count
		Long noRec = list.stream().count();
		System.out.println(noRec);
		
		Long empSGt3000 = list.stream().filter((var) -> var.getSalary() > 3000).count();
		System.out.println(empSGt3000);
	}

}
