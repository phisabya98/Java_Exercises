package com.exerciseday6;

import java.util.*;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<>();
		Set<Integer> s1 = new HashSet<>();
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s.add(2);
		s.add(8);
		s.add(276);
		s.add(26);
		s.retainAll(s1);
		System.out.println(s);


	}

}
