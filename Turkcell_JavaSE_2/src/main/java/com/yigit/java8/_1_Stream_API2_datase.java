package com.yigit.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_Stream_API2_datase {
	
	public static void streamToto1() {
		
		int[] dizi = { 1, 2, 3, 4, 5, 6 };
		
		List<Integer> listem1 = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> listem2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// listem
		List<Integer> listem3 = new ArrayList<Integer>();
		listem3.add(1);
		listem3.add(2);
		listem3.add(3);
		listem3.add(4);
		listem3.add(5);
		listem3.add(6);
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
