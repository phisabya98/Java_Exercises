package com.exerciseday5;

import java.util.Arrays;

public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,32,23,24};
		
		System.out.println(birthday(arr));
	}
	
	public static int birthday(int[] n) {
		Arrays.sort(n);
		return n[n.length-1];
	}
}
