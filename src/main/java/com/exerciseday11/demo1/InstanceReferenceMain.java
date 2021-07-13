package com.exerciseday11.demo1;

public class InstanceReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInterface instanceInterface = () -> {
			System.out.println("Welcome");
		};
		
		instanceInterface.myInterface();
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		
		InstanceInterface instanceInterface2 = instanceMethodReference::saySomething;
		instanceInterface2.myInterface();

	}

}
