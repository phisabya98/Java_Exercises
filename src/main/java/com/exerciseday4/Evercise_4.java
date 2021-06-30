package com.exerciseday4;

import java.util.Scanner;

public class Evercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int vowels = countVowels(s);
		System.out.println(vowels);
		
		

	}
	
	public static int countVowels(String s) {
		int count = 0;;
		for(int i= 0; i<s.length();i++) {
			char ch = s.toLowerCase().charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' ) {
				count++;
			}
		}
		return count;
	}

}
