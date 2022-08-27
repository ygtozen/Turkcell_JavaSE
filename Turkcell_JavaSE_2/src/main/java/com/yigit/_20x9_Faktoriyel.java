package com.yigit;

import java.util.Scanner;

public class _20x9_Faktoriyel {
	public static void main(String[] args) {
		
		// Faktoriyel hespalama
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz : ");
		int number = scanner.nextInt();
		
		int faktoriyel = 1;
		for (int i = 1; i <= number; i++) {
			if (number == 0) {
				faktoriyel = 1;
			} else {
				faktoriyel = faktoriyel * i;
			}
		}
		
		System.out.println("Faktoriyel : " + faktoriyel);
		
	}
}
