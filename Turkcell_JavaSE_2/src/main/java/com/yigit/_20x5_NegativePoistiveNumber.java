package com.yigit;

import java.util.Scanner;

public class _20x5_NegativePoistiveNumber {
	public static void main(String[] args) {
		
		// Kullanıcıdan aldığım sayı negativ mi pozitiv mi
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi giriniz : ");
		int number = scanner.nextInt();
		
		if (number < 0) {
			System.out.println("Sayi negatif");
		} else {
			System.out.println("Sayi pozitif");
		}
		
		// ternary
		String result = (number < 0) ? "Negatif" : "Pozitif";
		System.out.println(result);
	}
}
