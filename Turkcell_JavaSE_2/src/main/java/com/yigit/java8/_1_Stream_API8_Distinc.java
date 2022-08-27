package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API8_Distinc {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// map() ==> lambda expression (lambda function kullanýyoruz)
		// map() ==> Var olan listedeki veriler üzerinde manipulasyon yapýyor
		// (deðiþtiriyor)
		
		// listede verileri büyük harfe geçirmek için kullanýyoruz
		
		List<String> listem2 = listem.stream() // baþlangýç
				.distinct().sorted().map((temp) -> temp.toUpperCase()).collect(Collectors.toList());
		listem2.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
