package com.exercise3_4;

public class Animal {
	private String furColor;
	
	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public Animal makeNoise() {
		System.out.println("Noises");
		return this;
	}
}
