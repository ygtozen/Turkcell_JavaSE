package com.yigit;

import java.util.Random;
import java.util.Scanner;

public class _20x3_RandomNumber {
	public static void main(String[] args) {
		// Örnek: 1-10 arasında 5 tane random sayı üretelim ? (Random, for)
		
		Random random = new Random();
		
		for (int i = 1; i <= 10; i++) {
			int number = random.nextInt(1, 11);
			System.out.print(number + " ");
		}
		
		System.out.println();
		
		String str = "";
		for (int i = 1; i <= 5; i++) {
			str += (random.nextInt(10) + 1) + " ";
		}
		System.out.print(str);
		System.out.println();
		
		// Kullanıcıdan gun switch case hangi gun
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gun giriniz : ");
		String gun = scanner.nextLine();
		
	}
}
