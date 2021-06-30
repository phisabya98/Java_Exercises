package com.exerciseday4;

import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.nextLine();
	
	middle(s);
	}
	
	public static void middle(String s) {
		String mid;
		if(s.length()%2 == 0) {
			//return the middle of the even
			mid = Character.toString(s.charAt((s.length()/2)-1))
					.concat(Character.toString(s.charAt((s.length()/2))));
			System.out.println(mid);
		}else {
			//return the middle of the odd
			System.out.println(s.charAt((s.length()-1)/2));
		}
	}

}
