package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API10_MapFilter {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// distinct() ==> var olan listedeki tekrar eden veriler yazdýrmayan liste
		
		// listede bandirma geçenleri listele
		
		List<String> listem2 = listem.stream() // baþlangýç
				.distinct().sorted().collect(Collectors.toList());
		listem2.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
