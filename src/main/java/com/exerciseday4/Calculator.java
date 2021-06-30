package com.exerciseday4;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println("Add: " + x + " " + y +" is " + add(x,y));
		System.out.println("Subtract: " + x + " " + y +" is " + subtract(x,y));
		System.out.println("Multiply: " + x + " " +y +" is " + multiply(x,y));
	}
	
	public static int add(int x, int y) {
		return Math.addExact(x, y);
	}
	
	public static int subtract(int x, int y) {
		return Math.subtractExact(x, y);
	}
	
	public static int multiply(int x, int y) {
		return Math.multiplyExact(x, y);
	}
	
}
