package com.yigit;

import java.util.Scanner;

public class AsalSayi_Iterative_Recursive {
	
	// use data
	public static int useData() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int number = klavye.nextInt();
		return number;
	}
	
	// iterative
	public static Integer iterativeAsalSayi(int number) throws YigitOzenException {
		
		int sayac = 0;
		if (number < 1) {
			throw new YigitOzenException("Sifirsan kucuk sayi girmezsiniz");
		} else {
			for (int i = 1; i <= number; i++) {
				int kalan = number % i;
				if (kalan == 0) {
					sayac++;
				}
			}
		}
		
		return sayac;
	}
	
	public static Integer recursiveFactoriyel(int facNumber) throws YigitOzenException {
		if (facNumber < 0)
			throw new YigitOzenException("Sifirdan kucuk sayi girmeyiniz");
		if (facNumber == 0 || facNumber == 1) {
			return 1;
		}
		return facNumber * recursiveFactoriyel(facNumber - 1);
	}
	
	// recursive
	public static Integer recursiveAsalSayi(int number, int i) throws YigitOzenException {
		int sayac = 0;
		if (number < 1)
			throw new YigitOzenException("Sifirsan kucuk sayi girmezsiniz");
		if (i == 1)
			return 1;
		else {
			if (number % i == 0) {
				return 0;
			} else
				return recursiveAsalSayi(number, i - 1);
		}
	}
	
	public static void main(String[] args) throws YigitOzenException {
		/*
		 * int result = iterativeAsalSayi(useData());
		 * if (result == 2) {
		 * System.out.println("Sayi asaldir");
		 * } else {
		 * System.out.println("Sayi asal degildir");
		 * }
		 */
		
		int data = useData();
		int prime = recursiveAsalSayi(data, data / 2);
		
		if (prime == 1) {
			System.out.println("Sayisi asaldir");
		} else {
			System.out.println("Sayisi asal degildir");
		}
	}
}
