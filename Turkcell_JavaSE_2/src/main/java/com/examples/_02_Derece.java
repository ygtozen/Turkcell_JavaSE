package com.examples;

public class _02_Derece {
	public static void main(String[] args) {
		
		// 2.soru
		// Dereceyi Fahrenheit
		// (derece*9/5)+32
		// 0 derece 32 Fahrenheit
		
		int derece = 0, fahrenheit;
		fahrenheit = (derece * 9 / 5) + 32;
		System.out.println(fahrenheit);
		
		// 3.soru iki sayıda dört işlem ve bölümünden kalan
		// x1=4, y1=2;
		int x1 = 4, x2 = 2;
		int toplam, cikarma, carpma, bolme, kalan;
		toplam = x1 + x2;
		cikarma = x1 - x2;
		carpma = x1 * x2;
		bolme = x1 / x2;
		kalan = x1 % x2;
		System.out.println("Toplam : " + toplam);
		System.out.println("Cikarma : " + cikarma);
		System.out.println("Carpma : " + carpma);
		System.out.println("Bolme : " + bolme);
		System.out.println("Kalan : " + kalan);
	}
}
