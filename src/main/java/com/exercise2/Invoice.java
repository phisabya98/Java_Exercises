package com.exercise2;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String number, String description, int quantity, double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getInvoiceAmount() {
		if(this.quantity < 0 ) {
			this.quantity = 0;
		}else if(this.price < 0) {
			this.price = 0;
		}
	return this.price*this.quantity;
	}
	
	

}
