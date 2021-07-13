package com.exerciseday7;

public class Shape {
	private final String shapeType;
//	private final String color;
//	private final String texture;
	public Shape(String shapeType) {
		
		this.shapeType = shapeType;
//		this.color = color;
//		this.texture = texture;
	} 
	
	@Override
	public String toString() {
		return String.format("Shape: %s", shapeType);
	}
	
	public class Brush{
		private final String color;
		private final String texture;
		public Brush(String color, String texture) {
			this.color = color;
			this.texture = texture;
		}
		
		public void draw() {
			System.out.println("\n****Drawing Shape: "+ Shape.this.shapeType);
			System.out.println("Color: " + this.color);
			System.out.println("Texture: " + this.texture);
		}
	}
	
	
}
