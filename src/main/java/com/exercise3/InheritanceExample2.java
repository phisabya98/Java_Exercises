package com.exercise3;

public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
	}

}
//create default classes
class Animal{
	void walk() {
		System.out.println("I am walking");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("I am eating");
	}
	//add bark method
	void bark() {
		System.out.println("I am barking");
	}
}
