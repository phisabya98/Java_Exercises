package com.exerciseday6;
import java.util.*;

public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> namesmap = new HashMap<>();
		namesmap.put(1, "Phisa");
		namesmap.put(2, "Adin");
		namesmap.put(23, "lisa");
		namesmap.put(22, "Alin");
		System.out.println(namesmap.size());
		//exercise 7
		Set keySet = namesmap.keySet();
		System.out.println(keySet);
	}

}
