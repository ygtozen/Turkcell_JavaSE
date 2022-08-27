package com.examples;

public class _03_DortIslem {
	public static void main(String[] args) {
		
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
