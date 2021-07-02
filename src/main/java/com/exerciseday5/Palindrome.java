package com.exerciseday5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		if(isPalindrome(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		if(s.equalsIgnoreCase(sb.reverse().toString())) {
			return true;
		}
		
		return false;
	}
}
