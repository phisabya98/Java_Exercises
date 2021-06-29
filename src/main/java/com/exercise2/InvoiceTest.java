package com.exercise2;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in1 = new Invoice("432", "dumbell", 2, 15);
		System.out.println(in1.getDescription());
		//change the description of the instance to Hammer
		in1.setDescription("Hammer");
		System.out.println(in1.getDescription());
		//get the invoice amount
		System.out.println(in1.getInvoiceAmount());
		//test zeroes
		Invoice in2 = new Invoice("432", "dumbell", -2, 15);
		System.out.println(in2.getInvoiceAmount());
	}

}
