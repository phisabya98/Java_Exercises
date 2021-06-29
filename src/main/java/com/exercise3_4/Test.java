package com.exercise3_4;

public class Test {
	public static void main(String[] args) {
		//create dog instance
		Dog d = new Dog();
		//access inherited methods
		//d.makeNoise();
		//test to see if dog can access private variables
		//d.furColor() = black;
		//test to see if dog can access private method
		//d.makeNoise();
		d.setFurColor("Black");
		System.out.println(d.getFurColor());
		//overrid makenoise
		d.makeNoise("Woof");
		
	}
}
