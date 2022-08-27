package com.yigit;

import java.util.Scanner;

public class _17x1_StringExample {
	public static void main(String[] args) {
		
		// Örnek-3
		// girilen karakter harf mi, sayı mı, özel simge mi
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir değer giriniz : ");
		
		char karakter = scanner.next().charAt(0);
		if (Character.isDigit(karakter))
			System.out.print("Sayi");
		else if (Character.isLetter(karakter)) {
			System.out.print("Harf");
		} else {
			System.out.print("Özel simge");
		}
		
		char c1 = '4';
		if (Character.isDigit(c1)) {
			System.out.println("Sayidir");
		} else if (Character.isLetter(c1)) {
			System.out.println("Harftir");
		} else {
			System.out.println("Özel simge");
		}
	}
}
