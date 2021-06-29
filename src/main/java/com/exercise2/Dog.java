package com.exercise2;

public class Dog {
	String name;
	int age;
	double weight;
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "name is " + this.name + " and age is " + this.age;
	}
	
	public void showExcitement() {
		System.out.println(this.name + " is wagging its tail!!!");
	}
	
	public void showExcitement(int levelOfExcitement) {
		if(levelOfExcitement >= 50) {
			System.out.println(this.name + " is wagging its tail a lot");
		}else {
			System.out.println(this.name + " is barking");
		}
	}
	
	public void eating() {
		System.out.println(this.name + " eating");
	}
	
	public void eating(String food) {
		System.out.println("Eating " + food);
	}
	
	
	

}
