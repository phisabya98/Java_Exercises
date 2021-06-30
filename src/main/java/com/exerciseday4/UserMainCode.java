package com.exerciseday4;

import java.util.Scanner;

public class UserMainCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(checkCharacters(s) == 1) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}

	}
	
	public static int checkCharacters(String s) {
		String start = Character.toString(s.charAt(0));
		String end = Character.toString(s.charAt(s.length()-1));
		if(start.equalsIgnoreCase(end)) {
			return 1;
		} else {
			return -1;
		}
	}

}
