package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Java 8 ile gelmiþ fonksiyonel bir programlamadýr.
// Verileri hýzlý ve efektif olarak iþlem yapmamýza olanak saðlar
// Veri yapýlarý deðildir bundan dolayý var olan kaynaðý deðiþtirmez
// java.util.stream kütüphanesinden türer
// BaseStream Interfacesisinden türer
// Çeþitleri : intStream, LongStream, DoubleStream, Stream

// Stream : 2 grup çalýþma stili vardýr.
// 1-) Sequential (Sýralý)
// 2-) Paralel (Asenkron : Ayný anda birden fazla iþlem yapar)

public class _1_Stream_API_Description {
	
	public static void basitArrayStreamExample() {
		// 2 ile bölünebilen sayýlarý toplayýn
		
		// Diziyle
		int[] dizi = { 1, 2, 3, 4, 5 };
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				toplam += dizi[i];
			}
		}
		System.out.println(toplam);
	}
	
	// Stream ile ==> 2 ile bölünebilen sayýlarý toplayýn
	// Stream ile Lambda expression çok kullanýlýr
	public static void basitStreamExamples() {
		List<Integer> listem1 = List.of(1, 2, 3, 4, 5);
		List<Integer> listem2 = Arrays.asList(1, 2, 3, 4, 5);
		int toplam = listem2.stream().filter(temp -> temp % 2 == 0).reduce(0, (x, y) -> x + y);
		System.out.println(toplam);
		
		// Pradicate : java.util.function
		Predicate<Integer> ciftSayilar = temp -> temp % 2 == 0;
		int toplam2 = listem2.stream().filter(temp -> temp % 2 == 0).reduce(0, (x, y) -> x + y);
		System.out.println(toplam2);
	}
	
	public static void main(String[] args) {
		// int [] dizi = {1,2,3,4,5,6};
		// IntStream intStream = Arrays.stream(dizi);
		basitArrayStreamExample();
		basitStreamExamples();
	}
}
