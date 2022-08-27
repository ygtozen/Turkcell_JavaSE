package com.yigit.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _1_Stream_API7_filter {
	
	public static void streamToto1() {
		
		List<String> listem = Arrays.asList("bandirma", "istanbul", "ankara", "bandirma", "bursa", "bolu");
		
		// filter() ==> var olan listeden benim istediklerimi getir sadece getir
		
		// Listedeki band�rma ge�enleri istele
		List<String> listem2 = listem.stream() // ba�lang�
				.filter((temp) -> "bandirma".equals(temp)).collect(Collectors.toList());
		listem2.forEach(System.out::print);
		
		System.out.println("\n ** Bandirma gecmeyenler **");
		// Listede bandirma ge�meyenleri listele
		List<String> listem3 = listem.stream() // ba�lang�
				.filter((temp) -> !"bandirma".equals(temp)).collect(Collectors.toList());
		listem3.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri b�y�kten kucu�e s�rala
		System.out.println("\n ** Bandirma gecmeyenler kucukten buyuge **");
		// Listede bandirma ge�meyenleri listele
		List<String> listem4 = listem.stream() // ba�lang�
				.filter((temp) -> !"bandirma".equals(temp)).sorted().collect(Collectors.toList()); // biti�
		listem4.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri b�y�kten kucu�e s�rala
		System.out.println("\n ** Bandirma gecmeyenler buyukten kucuge **");
		// Listede bandirma ge�meyenleri listele
		List<String> listem5 = listem.stream() // ba�lang�
				.filter((temp) -> !"bandirma".equals(temp)).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()); // biti�
		listem5.forEach(System.out::println);
		
		// listedebi bandirma gecmeyenleri b�y�kten kucu�e ilk 2 eleman
		System.out.println("\n ** Bandirma gecmeyenler buyukten kucuge ilk 2 eleman**");
		// Listede bandirma ge�meyenleri listele
		List<String> listem6 = listem.stream() // ba�lang��
				.filter((temp) -> !"bandirma".equals(temp)).sorted(Comparator.reverseOrder()).limit(2)
				.collect(Collectors.toList()); // biti�
		listem6.forEach(System.out::println);
		
		/*
		 * // listedebi bandirma gecmeyenleri b�y�kten kucu�e ilk 2 eleman buyuk
		 * harflerle
		 * System.out.
		 * println("\n ** Bandirma gecmeyenler buyukten kucuge ilk 2 eleman BUYUK HARFLE**"
		 * );
		 * // Listede bandirma ge�meyenleri listele
		 * List<String> listem7 = listem.stream() // ba�lang�
		 * .filter((temp) -> !"bandirma".equals(temp.toUpperCase())
		 * .sorted(Comparator.reverseOrder()).limit(2)
		 * .collect(Collectors.toList()); // biti�
		 * listem7.forEach(System.out::println);
		 */
	}
	
	public static void main(String[] args) {
		streamToto1();
	}
}
