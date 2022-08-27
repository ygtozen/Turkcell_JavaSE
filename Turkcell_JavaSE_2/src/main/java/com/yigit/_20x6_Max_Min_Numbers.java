package com.yigit;

import java.util.Scanner;

public class _20x6_Max_Min_Numbers {
	public static void main(String[] args) {
		
		// Kullanıcıdan aldığım sayı max min
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Sayi giriniz : ");
		int number1 = scanner.nextInt();
		System.out.println("Sayi giriniz : ");
		int number2 = scanner.nextInt();
		
		if (number1 < number2) {
			System.out.println("Sayi2 daha buyuk");
		} else {
			System.out.println("Sayi1 daha buyuk");
		}
		
	}
}
