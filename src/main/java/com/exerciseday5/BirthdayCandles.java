package com.exerciseday5;

import java.util.Arrays;

public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,32,23,32,24};
		
		System.out.println(birthday(arr));
	}
	
	public static int birthday(int[] n) {
		Arrays.sort(n);
		int tall = n[n.length-1];
		int count = 0;
		for(int i = 0; i<n.length; i++) {
			if(tall == n[i]) {
				count++;
			}
		}
		return count;
	}
}
