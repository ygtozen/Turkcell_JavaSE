package com.yigit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Java 8 ile gelmi� fonksiyonel bir programlamad�r.
// Verileri h�zl� ve efektif olarak i�lem yapmam�za olanak sa�lar
// Veri yap�lar� de�ildir bundan dolay� var olan kayna�� de�i�tirmez
// java.util.stream k�t�phanesinden t�rer
// BaseStream Interfacesisinden t�rer
// �e�itleri : intStream, LongStream, DoubleStream, Stream

// Stream : 2 grup �al��ma stili vard�r.
// 1-) Sequential (S�ral�)
// 2-) Paralel (Asenkron : Ayn� anda birden fazla i�lem yapar)

public class _1_Stream_API_Description {
	
	public static void basitArrayStreamExample() {
		// 2 ile b�l�nebilen say�lar� toplay�n
		
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
	
	// Stream ile ==> 2 ile b�l�nebilen say�lar� toplay�n
	// Stream ile Lambda expression �ok kullan�l�r
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
