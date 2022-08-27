package com.yigit;

import java.util.Scanner;

// Exception : Java Lang kütüphanesinden gelir.
public class _26_UseOwnException extends Exception {
	
	public static void main(String[] args) throws YigitOzenException {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		int number = klavye.nextInt();
		if (number < 0) {
			throw new YigitOzenException("Sifirdan kucuk sayi giremezsin");
		} else {
			System.out.println(Math.pow(number, 2));
		}
	}
}
