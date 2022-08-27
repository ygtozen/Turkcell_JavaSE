package com.yigit;

import java.util.Scanner;

public class _22x1_AsalSayi_factoriyel_Fibonacci {
	
	public static void hesapla() {
		
	}
	
	public static void main(String[] args) {
		
		// Kullanıcıdan aldığım sayi faktoriyel
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		
		int sayi = scanner.nextInt();
		int sayac = 0;
		if (sayi < 1) {
			System.out.println("1 den buyuk sayilar, asal sayi olabilir");
		} else {
			for (int i = 1; i <= sayi; i++) {
				int kalan = sayi % i;
				if (kalan == 0) {
					sayac++;
				}
			}
			if (sayac == 2) {
				System.out.println("Sayi asaldir");
			} else {
				System.out.println("Sayi asal degildir");
			}
		}
		
	}
}
