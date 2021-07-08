package com.exerciseday6;
import java.util.*;
public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nums = new TreeSet<>();
		TreeSet<Integer> max = new TreeSet<>();
		nums.add(2);
		nums.add(4);
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(9);
		//find number less than 7
		max = (TreeSet)nums.headSet(7);
		Iterator it = max.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
