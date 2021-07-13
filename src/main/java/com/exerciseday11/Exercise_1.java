package com.exerciseday11;

import java.util.ArrayList;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface sum = (double a, double b) -> { return a+b;};
		System.out.println(sum.sum(20.3, 22.3));
		
	    MyInterface2 my = () -> {System.out.println("Hello Word");};
	    my.myMessage();
	    
	    ArrayListCreator arr = ArrayList::new;
	    ArrayList<String> ar = arr.makeArray();
	    ar.add("Hi");
	    ar.add("World");
	    
	    ar.stream().forEach((var) -> System.out.println(var));
	    
	   
	}
	

}
