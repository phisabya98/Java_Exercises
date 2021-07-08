package com.exerciseday6;

import java.util.*;
public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> rev = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			rev.add(i);
		}
		Collections.reverse(rev);
		System.out.println(rev);
	}

}
