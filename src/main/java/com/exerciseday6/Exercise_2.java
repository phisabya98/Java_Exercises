package com.exerciseday6;
import java.util.*;
public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		int i = 0;
		while(i<10) {
			i++;
			a.add(i);
			
		}
		
		for(int j : a) {
			System.out.println(j);
		}
	}

}
