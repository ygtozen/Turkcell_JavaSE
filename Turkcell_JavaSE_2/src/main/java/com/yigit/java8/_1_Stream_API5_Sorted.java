package com.yigit.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API5_Sorted {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// sorted() ==> küçükten büyüðe sýralama
		// List<String> listem2 = listem.stream().sorted().collect(Collectors.toList());
		listem.forEach(System.out::println);
		
		System.out.println();
		
		List<String> listem2 = listem.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
