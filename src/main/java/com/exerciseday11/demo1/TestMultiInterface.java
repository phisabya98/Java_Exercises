package com.exerciseday11.demo1;

public class TestMultiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInterface myInterface1 = (name) -> (name + "World");
		//logic of sayHello
		System.out.println(myInterface1.sayHello("Hello"));
		//Accessing static method
		System.out.println(MultiInterface.add(1,2));
		//Accessing default method
		System.out.println(myInterface1.defualtMethod(10));
		
		MultiInterface myInterface2 = (name) -> (name + "World");
		
		System.out.println(myInterface1.equals(myInterface2));
	}

}
