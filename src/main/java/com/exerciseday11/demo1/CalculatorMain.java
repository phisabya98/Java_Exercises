package com.exerciseday11.demo1;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		Integer addResult = calculator.calc((x,y) -> x+y, 10, 5);
		Integer subResult = calculator.calc((x,y) -> x-y, 20 , 5);
		
		System.out.println(addResult);
		System.out.println(subResult);
	}

}
