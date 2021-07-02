package com.exerciseday5;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		int occ = maxCharacters(s);
		System.out.println(occ);

	}
	
	public static int maxCharacters(String in) {
		int count[] = new int[256];
		for(int i = 0; i<in.length(); i++) {
			count[in.charAt(i)]++;
		}
		
		int max = -1; 
		char result = ' ';
		for(int i = 0; i<in.length(); i++) {
			if(max < count[in.charAt(i)]) {
				max = count[in.charAt(i)];
				result = in.charAt(i);
			}
		}
		for(int i = 0; i<in.length(); i++) {
			if(result == in.charAt(i)) {
				return i;
			}
		}
		return -1;
	}

}
