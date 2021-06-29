package com.exercise3_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create A object
		A a1 = new A();
		a1.doSomething();
		//assign B object to A
		a1 = new B();
		a1.doSomething();
		//B inherits methods from A
		a1.doSomethingElse();
		
	}

}
