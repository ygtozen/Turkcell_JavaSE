package com.yigit;

import java.util.Scanner;

public class _22_Method {
	
	// voidliParametresiz
	public static void voidliParametresiz() {
		System.out.println("Voidli parametresiz");
	}
	
	// voidliParametreli
	public static void voidliParametreli(int count) {
		System.out.println("Voidli Parametreli : " + count);
	}
	
	// voidsizParametresiz
	public static int voidsizParametresiz() {
		System.out.println("Voidsiz Parametresiz");
		int sayi1 = 4, sayi2 = 5, toplam = 0;
		toplam = sayi1 + sayi2;
		return toplam;
	}
	
	// voidsizParametreli
	public static int voidsizParametreli(int number1, int number2) {
		System.out.println("Voidsiz Parametreli");
		int toplam = 0;
		toplam = number1 + number2;
		return toplam;
	}
	
	// Overloading: aynı metd isimleri olcak ancak parametre türü ve sayısı farklı
	// olacak
	public static int voidsizParametreli(int number1) {
		System.out.println("Voidsiz Parametreli");
		int toplam = 0;
		toplam = number1;
		return toplam;
	}
	
	public static void main(String[] args) {
		// voidliParametresiz();
		
		/*
		 * Scanner klavye = new Scanner(System.in);
		 * System.out.println("Bir sayi giriniz : ");
		 * int number = klavye.nextInt();
		 * voidliParametreli(number);
		 */
		
		/*
		 * int result = voidsizParametresiz();
		 * System.out.println(result);
		 */
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("1.giriniz : ");
		int number1 = klavye.nextInt();
		System.out.println("2.giriniz : ");
		int number2 = klavye.nextInt();
		
		// Argüman ==> metodu çağırırken verdiğimiz değer
		int result = voidsizParametreli(number1, number2);
		System.out.println(result);
	}
}
