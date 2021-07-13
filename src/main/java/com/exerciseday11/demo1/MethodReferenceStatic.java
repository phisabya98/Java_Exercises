package com.exerciseday11.demo1;

@FunctionalInterface
public interface MethodReferenceStatic {
	public String sayHello(Integer str);
	public static String someMethod(Integer num) {
		return "Welcome static: " + num;
	}
	
	
}
