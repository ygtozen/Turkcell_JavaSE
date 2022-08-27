package com.yigit.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API7_filter {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// filter() ==> var olan listeden benim istediklerimi getir sadece getir
		
		// Listedeki bandýrma geçenleri istele
		List<String> listem2 = listem.stream() // baþlangç
				.filter((temp) -> "bandirma".equals(temp)).collect(Collectors.toList());
		listem2.forEach(System.out::print);
		
		System.out.println("\n ** Bandirma gecmeyenler **");
		// Listede bandirma geçmeyenleri listele
		List<String> listem3 = listem.stream() // baþlangç
				.filter((temp) -> !"bandirma".equals(temp)).collect(Collectors.toList());
		listem3.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri büyükten kucuðe sýrala
		System.out.println("\n ** Bandirma gecmeyenler kucukten buyuge **");
		// Listede bandirma geçmeyenleri listele
		List<String> listem4 = listem.stream() // baþlangç
				.filter((temp) -> !"bandirma".equals(temp)).sorted().collect(Collectors.toList()); // bitiþ
		listem4.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri büyükten kucuðe sýrala
		System.out.println("\n ** Bandirma gecmeyenler buyukten kucuge **");
		// Listede bandirma geçmeyenleri listele
		List<String> listem5 = listem.stream() // baþlangç
				.filter((temp) -> !"bandirma".equals(temp)).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()); // bitiþ
		listem5.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri büyükten kucuðe ilk 2 eleman
		System.out.println("\n ** Bandirma gecmeyenler buyukten kucuge ilk 2 eleman**");
		// Listede bandirma geçmeyenleri listele
		List<String> listem6 = listem.stream() // baþlangýç
				.filter((temp) -> !"bandirma".equals(temp)).sorted(Comparator.reverseOrder()).limit(2)
				.collect(Collectors.toList()); // bitiþ
		listem6.forEach(System.out::println);
		
		/*
		 * // listedebi bandirma gecmeyenleri büyükten kucuðe ilk 2 eleman buyuk
		 * harflerle
		 * System.out.
		 * println("\n ** Bandirma gecmeyenler buyukten kucuge ilk 2 eleman BUYUK HARFLE**"
		 * );
		 * // Listede bandirma geçmeyenleri listele
		 * List<String> listem7 = listem.stream() // baþlangç
		 * .filter((temp) -> !"bandirma".equals(temp.toUpperCase())
		 * .sorted(Comparator.reverseOrder()).limit(2)
		 * .collect(Collectors.toList()); // bitiþ
		 * listem7.forEach(System.out::println);
		 */
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
