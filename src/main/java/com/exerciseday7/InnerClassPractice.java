package com.exerciseday7;

public class InnerClassPractice {
	public static void main(String[] args) {
//		Shape s = new Shape("Circle", "Blue", "Smooth");
//		Shape.Brush a = s.new Brush();
//	
//		System.out.println(s.toString());
//		a.draw();
		
		Shape s = new Shape("Circle");
		Shape.Brush a = s.new Brush("Blue", "Smooth");
		System.out.println(s.toString());
		a.draw();
	}
}
