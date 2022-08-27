package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API6_limit {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "balikesir", "bursa", "bolu");
		
		// s�ralad�ktan osnra ilk 3 tane veriyi bana list olarak d�ner ==> limit
		List<String> listem2 = listem.stream().sorted().limit(3).collect(Collectors.toList());
		listem2.forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
