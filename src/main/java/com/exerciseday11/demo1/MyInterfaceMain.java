package com.exerciseday11.demo1;

public class MyInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface = (a) -> {System.out.println(a);};
		myInterface.someMethod("HCL");
		
		MyInterface myInterface1 = System.out::println;
		myInterface1.someMethod("Java CoE");
	}

}
