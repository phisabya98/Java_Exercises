package com.exercise2;

public class Person {
	private String name;
	private int age;
	private double shoeSize;
	public Person(String name, int age, double shoeSize) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
	}
	
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

	public double getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(double shoeSize) {
		this.shoeSize = shoeSize;
	}

	public void walking() {
		System.out.println("Name is " + this.name + ", age is " + this.age + ", shoe size is " + this.shoeSize);
	}
	
	public void startWalking() {
		walking();
	}
	
	
}
