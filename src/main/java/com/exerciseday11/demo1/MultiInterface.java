package com.exerciseday11.demo1;

@FunctionalInterface
public interface MultiInterface {

	public String sayHello(String name);
	
	public static int add(int num1, int num2) {return num1+num2;}
	
	boolean equals(Object obj);
	
	default public int defualtMethod(int var) {
		return var + 100;
	}
}
