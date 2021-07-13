package com.exerciseday11.demo1;

public class MethodReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceStatic static1 = (a) -> {return "Welcome" + a;};
		System.out.println(static1.sayHello(22));
		
		MethodReferenceStatic static2 = MethodReferenceStatic::someMethod;
		System.out.println(static2.sayHello(44));
	}

}
