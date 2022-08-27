package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API4_Collect {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// Collector.toList() ==> stream objesini listeye çevir
		List<String> listem2 = listem.stream().collect(Collectors.toList());
		listem.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
