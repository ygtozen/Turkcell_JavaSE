package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API8_Distinc {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// map() ==> lambda expression (lambda function kullan�yoruz)
		// map() ==> Var olan listedeki veriler �zerinde manipulasyon yap�yor
		// (de�i�tiriyor)
		
		// listede verileri b�y�k harfe ge�irmek i�in kullan�yoruz
		
		List<String> listem2 = listem.stream() // ba�lang��
				.distinct().sorted().map((temp) -> temp.toUpperCase()).collect(Collectors.toList());
		listem2.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
