package com.exerciseday11.demo1;

import java.util.function.*;
public class Calculator {

	public Integer calc(BiFunction<Integer,Integer,Integer> bi, Integer num1, Integer num2) {
		return bi.apply(num1, num2);
	}
}
