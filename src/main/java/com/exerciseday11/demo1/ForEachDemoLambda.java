package com.exerciseday11.demo1;
import java.util.*;

public class ForEachDemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list  = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		
		list.forEach((var) -> System.out.println(var));

	}

}
