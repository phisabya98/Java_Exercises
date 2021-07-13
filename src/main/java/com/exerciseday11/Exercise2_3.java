package com.exerciseday11;

import java.util.*;
public class Exercise2_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		
		//stream doesnt have a sum method
		//list.stream().filter(value -> value % 2 != 0).sum();
		//filters value that is not even will be sum
		int a = list.stream().filter(value -> value % 2 != 0).reduce(0, Integer::sum);
		System.out.println(a);
	}

}
