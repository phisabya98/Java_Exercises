package com.exercise2;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Rosie", 4, 15.5);
		Dog d2 = new Dog("Gabby", 5, 53.6);
		System.out.println(d1.toString());
		d1.showExcitement();
		d1.showExcitement(65);
		d1.eating();
		d1.eating("Spaghetti");
		System.out.println(d2.toString());
		d2.showExcitement();
		d2.showExcitement(35);
		d2.eating();
		d2.eating("Steak");
		

	}

}
